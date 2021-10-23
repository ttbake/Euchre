package com.Todd;

import java.util.*;

public class Deck {
    private Map<String, Integer> MapOfCardValues = new HashMap<>();
    private List<Card> CardsInDeck = new ArrayList<>();
    private static String[] Suits = new String[]{"clubs", "spades", "hearts", "diamonds"};

    public List<String> getSuits() {
        return Arrays.stream(Suits).toList();
    }

    public static String[] getValues() {
        return Values;
    }

    private static String[] Values = new String[]{"9", "10", "J", "Q", "K", "A"};

    public Map<String, Integer> getMapOfCardValues() {
        return MapOfCardValues;
    }

    public void setMapOfCardValues() {
        if (MapOfCardValues.isEmpty()){
            MapOfCardValues.put("9", 1);
            MapOfCardValues.put("10", 2);
            MapOfCardValues.put("J", 3);
            MapOfCardValues.put("Q", 4);
            MapOfCardValues.put("K", 5);
            MapOfCardValues.put("A", 6);
        }
    }

    public List<Card> getCardsInDeck() {
        return CardsInDeck;
    }

    public void setCardsInDeck() {
        if (CardsInDeck .isEmpty()){
            for (String value : Values) {
                for (String suit : Suits){
                    Card card = new Card(value, suit);
                    CardsInDeck.add(card);
                }
            }
        }
        Collections.shuffle(CardsInDeck);
        setMapOfCardValues();
    }
}
