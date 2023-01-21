package com.models;

public class ClashCoins {
    private int id;
    private boolean clashTurn; // face caché bataille face neutre paix clashTurn = true == bataille
    private String urlImage;

    public ClashCoins(int id, boolean clashTurn, String urlImage) {
        this.id = id;
        this.clashTurn = clashTurn;
        this.urlImage = urlImage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isClashTurn() {
        return clashTurn;
    }

    public void setClashTurn(boolean clashTurn) {
        this.clashTurn = clashTurn;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }
}
