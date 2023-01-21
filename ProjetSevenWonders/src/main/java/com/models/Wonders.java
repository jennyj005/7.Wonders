package com.models;

import java.util.List;

public class Wonders
{
    private int id;
    private String name;
    private List<Parts> parts;
    private String effect;
    private int parts_achieved;
    private String urlImage;

    public Wonders(int id, String name, List<Parts> parts, String effect, int parts_achieved, String urlImage)
    {
        this.id = id;
        this.name = name;
        this.effect =effect;
        this.parts = parts;
        this.parts_achieved = parts_achieved;
        this.urlImage = urlImage;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getEffect()
    {
        return effect;
    }

    public void setEffect(String effect)
    {
        this.effect = effect;
    }

    public List<Parts> getParts()
    {
        return parts;
    }

    public void setParts(List<Parts> parts)
    {
        this.parts = parts;
    }

    public int getParts_achieved()
    {
        return parts_achieved;
    }

    public void setParts_achieved(int parts_achieved)
    {
        this.parts_achieved = parts_achieved;
    }

    public String getUrlImage()
    {
        return urlImage;
    }

    public void setUrlImage(String urlImage)
    {
        this.urlImage = urlImage;
    }
}
