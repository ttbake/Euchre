package com.Todd;

import java.util.Dictionary;
import java.util.HashSet;

public class Hand {
    private HashSet<Card> CardsInHand = new HashSet<>();

    public HashSet<Card> getCardsInHand() {
        return CardsInHand;
    }

    public void setCardsInHand(HashSet<Card> cardsInHand) {
        CardsInHand = cardsInHand;
    }
}
