package com.Todd;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Game {
    private Set<Player> PlayersInGame = new HashSet<>();
    private static String[] PlayerNames = new String[]{"Player", "Partner", "Enemy 1", "Enemy 2"};
    private boolean trumpSet;

    public boolean isTrumpSet() {
        return trumpSet;
    }

    public void setTrumpSet(boolean trumpSet) {
        this.trumpSet = trumpSet;
    }

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
            System.out.println(player.getPlayerHand().getCardsInHand().toString());
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            //if (!player.getPlayerHand().getCardsInHand().contains()){

            //}
        }
    }

    public void setTrump(Deck deck){
        while (!trumpSet){
            for (Player player : PlayersInGame) {
                if (!player.getName().equals("Player")){
                    continue;
                }
                System.out.println("What would you like trump to be? If no desire to select trump, say pass. ");
                Scanner sc = new Scanner(System.in);
                String input = sc.nextLine();
                if (deck.getSuits().contains(input.toLowerCase())){
                    System.out.println("Trump is now " + input.toLowerCase());
                    setTrumpSet(true);
                }
                else{
                    System.out.println("Invalid suit");
                }
            }
        }
    }
}
