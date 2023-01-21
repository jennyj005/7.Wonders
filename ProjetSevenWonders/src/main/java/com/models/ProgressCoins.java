package com.models;

public class ProgressCoins {
    private int id;
    private String name;
    private String effect;
    private String urlImage;

    public ProgressCoins(int id, String name, String effect, String urlImage) {
        this.id = id;
        this.name = name;
        this.effect = effect;
        this.urlImage = urlImage;
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

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }
}
