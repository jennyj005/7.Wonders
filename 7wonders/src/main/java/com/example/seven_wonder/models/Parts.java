package com.example.seven_wonder.models;

public class Parts {
    private int id;

    private String condition;

    private String name;

    private int victoryPoint;

    private boolean completed;
    private String effect;

    public Parts(int id, String name, String condition, boolean completed, String effect, int victoryPoint) {
        this.id = id;
        this.name = name;
        this.completed = completed;
        this.condition = condition;
        this.effect = effect;
        this.victoryPoint = victoryPoint;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public int getVictoryPoint() {
        return victoryPoint;
    }

    public void setVictoryPoint(int victoryPoint) {
        this.victoryPoint = victoryPoint;
    }
}
