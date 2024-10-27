package com.kevenreyes.screenmatch.models;

public class Series extends Title {
    private int season;
    private boolean active;
    private int episodesSeason;
    private int minutesEpisodes;

    // Getters
    public int getSeason() {
        return season;
    }

    public boolean getIsActive() {
        return active;
    }

    public int getEpisodesSeason() {
        return episodesSeason;
    }

    public int getMinutesEpisodes() {
        return minutesEpisodes;
    }

    // Setters

    public void setSeason(int season) {
        this.season = season;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setEpisodesSeason(int episodesSeason) {
        this.episodesSeason = episodesSeason;
    }

    public void setMinutesEpisodes(int minutesEpisodes) {
        this.minutesEpisodes = minutesEpisodes;
    }

    @Override
    public int getDurationsInMinuts() {
        return season * episodesSeason * minutesEpisodes;
    }

}
