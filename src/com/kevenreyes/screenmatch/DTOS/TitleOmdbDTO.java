package com.kevenreyes.screenmatch.DTOS;

// Data object translate
// The DTO is the intermediary class that interprets incoming information in order to send the correct data to the class that requires it.

public record TitleOmdbDTO(String title, String year, String runtime) {

}
