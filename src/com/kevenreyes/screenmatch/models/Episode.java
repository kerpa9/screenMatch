package com.kevenreyes.screenmatch.models;

import com.kevenreyes.screenmatch.calculus.IClasification;

public class Episode implements IClasification {
    private int number;
    private String name;
    private Series serie;
    private int totalViews;

    // Gettes

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public Series getSerie() {
        return serie;
    }

    public int getTotalViews() {
        return totalViews;
    }

    // Settes

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSerie(Series serie) {
        this.serie = serie;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    // Methods
    @Override
    public int getClasification() {

        if (totalViews > 100) {
            return 4;
        } else {
            return 2;
        }
    }

}
