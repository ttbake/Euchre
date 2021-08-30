package com.Todd;

import java.util.Map;

public class Card {
    private String CardTitle;
    private String CardSuit;

    public String getCardTitle() {
        return CardTitle;
    }

    public void setCardTitle(String cardTitle) {
        CardTitle = cardTitle;
    }

    public String getCardSuit() {
        return CardSuit;
    }

    public void setCardSuit(String cardSuit) {
        CardSuit = cardSuit;
    }

    public Card(String cardTitle, String cardSuit) {
        CardTitle = cardTitle;
        CardSuit = cardSuit;
    }

    @Override
    public String toString() {
        return getCardTitle() + "-" + getCardSuit();
    }
}
