package com.kevenreyes.screenmatch.models;

public class Title {

    private String name;
    private int releaseDate;
    private boolean includedInPlan;
    private double sumEvaluations;
    private int totalEvaluations;
    private int durationInMinutes;

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

    public void setDurationsInMinuts(int durationInMinutes){
        this.durationInMinutes= durationInMinutes;
    }

}
