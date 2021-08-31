package com.Todd;

public class Player {
    private String name;
    private Hand playerHand = new Hand();
    private boolean isDealer = false;

    public boolean isDealer() {
        return isDealer;
    }

    public void setDealer(boolean dealer) {
        isDealer = dealer;
    }

    public Hand getPlayerHand() {
        return playerHand;
    }

    public void setPlayerHand(Hand playerHand) {
        this.playerHand = playerHand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player(String namePlayer){
        name = namePlayer;
    }
}
