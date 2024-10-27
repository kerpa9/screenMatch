package com.kevenreyes.screenmatch.models;

import com.kevenreyes.screenmatch.calculus.IClasification;

public class Movie extends Title implements IClasification {
    private String director;

    public Movie(String name, int releaseDate, boolean includedInPlan, 
    int durationInMinutes){
        super(name, releaseDate, includedInPlan, durationInMinutes);

    }

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

    @Override
    public String toString(){
        return "Movie: "+this.getName()+"( "+getReleaseDate()+" )";
    }

}
