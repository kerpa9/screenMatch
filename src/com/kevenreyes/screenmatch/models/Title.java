package com.kevenreyes.screenmatch.models;

import com.google.gson.annotations.SerializedName;
import com.kevenreyes.screenmatch.DTOS.TitleOmdbDTO;
import com.kevenreyes.screenmatch.exceptions.ErrorIntDuring;

public class Title implements Comparable<Title> {

    private String name;
    private int releaseDate;
    private boolean includedInPlan;
    private double sumEvaluations;
    private int totalEvaluations;
    private int durationInMinutes;

    public Title(TitleOmdbDTO myTitleOmdbDTO) {
        this.name = myTitleOmdbDTO.title();
        this.releaseDate = Integer.valueOf(myTitleOmdbDTO.year());


        if (myTitleOmdbDTO.runtime().contains("N/A")) {
            throw new ErrorIntDuring("Something through");

        }
        this.durationInMinutes = Integer.valueOf(myTitleOmdbDTO.runtime().substring(0, 3).replace(" ", ""));

    }

    public Title(String name, int releaseDate, boolean includedInPlan,
            int durationInMinutes) {

        this.name = name;
        this.releaseDate = releaseDate;
        this.includedInPlan = includedInPlan;
        this.durationInMinutes = durationInMinutes;
    }

    // GETTERS
    public String getName() {
        return name;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public boolean getIncludedPlan() {
        return includedInPlan;
    }

    public double getSumEvaluations() {
        return sumEvaluations;
    }

    public int getTotalEvaluations() {
        return totalEvaluations;
    }

    public int getDurationsInMinuts() {
        return durationInMinutes;
    }

    // SETERS
    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setIncludedPlan(boolean includedInPlan) {
        this.includedInPlan = includedInPlan;
    }

    public void setSumEvaluations(double sumEvaluations) {
        this.sumEvaluations = sumEvaluations;
    }

    public void setTotalEvaluations(int totalEvaluations) {
        this.totalEvaluations = totalEvaluations;
    }

    public void setDurationsInMinuts(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    // Methods

    public void showTechnicalSheet() {
        System.out.println("Name the movie: " + name);
        System.out.println("Release date:  " + releaseDate);

    }

    public void evaluate(double note) {
        sumEvaluations += note;
        totalEvaluations++;
    }

    public double calMediaEvaluate() {
        return sumEvaluations / totalEvaluations;
    }

    @Override
    public int compareTo(Title otherTitle) {
        return this.getName().compareTo(otherTitle.getName());

    }

    @Override
    public String toString() {
        return "(Name movie: " + name + ", Release date: " + releaseDate + ", Duration: " + durationInMinutes+")";
    }

}
