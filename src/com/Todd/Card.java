package com.Todd;

import java.util.Map;

public class Card {
    private String CardTitle;
    private String CardSuit;
    private boolean isAssigned;
    private boolean isTrump;

    public boolean isTrump() {
        return isTrump;
    }

    public void setTrump(boolean trump) {
        isTrump = trump;
    }

    public boolean isAssigned() {
        return isAssigned;
    }

    public void setAssigned(boolean assigned) {
        isAssigned = assigned;
    }

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
