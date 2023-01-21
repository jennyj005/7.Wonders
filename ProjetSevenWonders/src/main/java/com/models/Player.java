package com.models;

import java.util.List;

public class Player
{
    private String name;
    private Wonders wonders;
    private int victoryClashCoins;
    private boolean catPawn;
    private ProgressCoins progressCoins;
    private List<Cards> resources;
    private List<Cards> deck;
    private int age;

    public Player(String name, Wonders wonders, int victoryClashCoins, boolean catPawn, ProgressCoins progressCoins, List<Cards> deck, int age)
    {
        this.name = name;
        this.wonders = wonders;
        this.victoryClashCoins = victoryClashCoins;
        this.catPawn = catPawn;
        this.progressCoins = progressCoins;
        this.resources = resources;
        this.deck = deck;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Wonders getWonders()
    {
        return wonders;
    }

    public void setWonders(Wonders wonders)
    {
        this.wonders = wonders;
    }

    public void setVictoryClashCoins(int victoryClashCoins)
    {
        this.victoryClashCoins = victoryClashCoins;
    }

    public boolean isCatPawn()
    {
        return catPawn;
    }

    public void setCatPawn(boolean catPawn)
    {
        this.catPawn = catPawn;
    }

    public ProgressCoins getProgressCoins()
    {
        return progressCoins;
    }

    public List<Cards> getResources()
    {
        return resources;
    }

    public void setResources(List<Cards> resources)
    {
        this.resources = resources;
    }

    public List<Cards> getDeck()
    {
        return deck;
    }

    public void setDeck(List<Cards> deck)
    {
        this.deck = deck;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
}
