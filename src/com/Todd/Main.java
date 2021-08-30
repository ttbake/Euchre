package com.Todd;

public class Main {

    public static void main(String[] args) {
    Deck deck = new Deck();
    deck.setCardsInDeck();;
    for (Card card : deck.getCardsInDeck()) {
        System.out.println(card.toString());
    }
    }
}
