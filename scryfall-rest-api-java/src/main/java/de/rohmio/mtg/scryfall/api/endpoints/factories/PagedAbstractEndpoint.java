package de.rohmio.mtg.scryfall.api.endpoints.factories;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import javax.ws.rs.core.GenericType;

import de.rohmio.mtg.scryfall.api.model.ListObject;
import de.rohmio.mtg.scryfall.api.model.ScryfallError;

public abstract class PagedAbstractEndpoint<T> extends AbstractEndpoint<ListObject<T>> {
	
	protected PagedAbstractEndpoint(String path, GenericType<ListObject<T>> resultType) {
		super(path, resultType);
	}

	protected PagedAbstractEndpoint(String path, Class<ListObject<T>> resultClass) {
		super(path, resultClass);
	}

	public abstract PagedAbstractEndpoint<T> page(int page);
	
	public List<T> getAll() throws ScryfallError {
		List<T> list = new ArrayList<>();
		ListObject<T> listObject = null;
		for(int page = 1; listObject == null || listObject.getHas_more(); ++page) {
			listObject = page(page).get();
			list.addAll(listObject.getData());
		}
		return list;
	}
	public void getAll(Consumer<List<T>> consumer) throws ScryfallError {
		ListObject<T> listObject = null;
		for(int page = 1; listObject == null || listObject.getHas_more(); ++page) {
			listObject = page(page).get();
			consumer.accept(listObject.getData());
		}
	}

}
