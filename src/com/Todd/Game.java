package com.Todd;

import java.util.HashSet;
import java.util.Set;

public class Game {
    private Set<Player> PlayersInGame = new HashSet<>();
    private static String[] PlayerNames = new String[]{"You", "Partner", "Enemy 1", "Enemy 2"};

    public Set<Player> getPlayersInGame() {
        return PlayersInGame;
    }

    public void setPlayersInGame(Set<Player> playersInGame) {
        PlayersInGame = playersInGame;
    }

    public Game(){
        for (String name : PlayerNames){
            Player player = new Player(name);
            PlayersInGame.add(player);
        }
    }

    public void dealHandsToPlayers(Deck deck){
        for (Player player : PlayersInGame){
            for (Card card : deck.getCardsInDeck()){
                if (!card.isAssigned() && player.getPlayerHand().getCardsInHand().size() != 5){
                    player.getPlayerHand().getCardsInHand().add(card);
                    card.setAssigned(true);
                }
            }
        }
    }

    public void trick(){
        for (Player player : PlayersInGame){
            System.out.println("Which of your cards do you want to play?");

        }
    }
}
