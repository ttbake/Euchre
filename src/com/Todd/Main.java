package com.Todd;

public class Main {

    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.setCardsInDeck();;
        for (Card card : deck.getCardsInDeck()) {
            System.out.println(card.toString());
        }
        Game game = new Game();
        game.dealHandsToPlayers(deck);
        for (Player player : game.getPlayersInGame()){
            System.out.println(player.getName() + " has " + player.getPlayerHand().getCardsInHand());
        }
        game.setTrump(deck);
    }
}
