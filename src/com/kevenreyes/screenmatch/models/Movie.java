package com.kevenreyes.screenmatch.models;

import com.kevenreyes.screenmatch.calculus.IClasification;

public class Movie extends Title implements IClasification {
    private String director;

    // Getter
    public String getDirector() {
        return director;
    }

    // Setter

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClasification() {
        return (int) calMediaEvaluate() / 2;
    }

}
