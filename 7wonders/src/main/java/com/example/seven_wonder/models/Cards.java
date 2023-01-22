package com.example.seven_wonder.models;

public class Cards {
    private int id;
    private String color;
    private String type;
    private int symbol;
    private int victoryPoint;
    private String typeofSymbol;
    private String product;
    private String urlImage;
    private String effect;

    public Cards(int id, String color, String type, int symbol, int victoryPoint, String typeofSymbol, String product, String urlImage) {
        this.id = id;
        this.color = color;
        this.type = type;
        this.symbol = symbol;
        this.victoryPoint = victoryPoint;
        this.typeofSymbol = typeofSymbol;
        this.product = product;
        this.urlImage = urlImage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSymbol() {
        return symbol;
    }

    public void setSymbol(int symbol) {
        this.symbol = symbol;
    }

    public int getVictoryPoint() {
        return victoryPoint;
    }

    public void setVictoryPoint(int victoryPoint) {
        this.victoryPoint = victoryPoint;
    }

    public String getTypeofSymbol() {
        return typeofSymbol;
    }

    public void setTypeofSymbol(String typeofSymbol) {
        this.typeofSymbol = typeofSymbol;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }
}
