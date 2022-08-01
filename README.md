# Scryfall Java Api

## Usage
Everything stems from de.rohmio.mtg.scryfall.api.ScryfallApi

For example if you want to use the cards endpoint and seach for a card by its scryfall id:
```
String scryfallId = "e9d5aee0-5963-41db-a22b-cfea40a967a3";
CardObject cardObject = ScryfallApi.cards.scryfallId(scryfallId).get();
```

## Settings
You can adjust the rate by which requests are made in `ScryfallApi.SCRYFALL_RATE_LIMIT`. The default value is 100 (ms between requests).
