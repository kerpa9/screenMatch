package com.kevenreyes.screenmatch.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.kevenreyes.screenmatch.models.Movie;
import com.kevenreyes.screenmatch.models.Series;
import com.kevenreyes.screenmatch.models.Title;

public class PrincipalList {
    public static void main(String[] args) {

        Movie myMovie = new Movie("Harry Potter", 1999, true, 200);
        myMovie.evaluate(9);
        Movie myMovie1 = new Movie("Avatar", 2023, true, 210);
        myMovie1.evaluate(6);
        var movieRings = new Movie("The Lord of the Rings", 2001, false, 180);
        movieRings.evaluate(10);
        Series lost = new Series("Lost", 2020, false, 310);

        List<Title> movAndSeries = new ArrayList<>();
        movAndSeries.add(myMovie);
        movAndSeries.add(myMovie1);
        movAndSeries.add(movieRings);
        movAndSeries.add(lost);

        for (Title item : movAndSeries) {
            System.out.println(item.getName());

            if (item instanceof Movie movie && movie.getClasification() > 2) {
                System.out.println(movie.getClasification());
            }
        }

        ArrayList<String> artistList = new ArrayList<>();
        artistList.add("Axel Rose");
        artistList.add("Max Verstapend");
        artistList.add("Checo Perez");

        Collections.sort(artistList);
        System.out.println("Artist list" + artistList);

        Collections.sort(movAndSeries);

        System.out.println("Movies list" + movAndSeries);

        movAndSeries.sort(Comparator.comparing(Title::getReleaseDate));
        System.out.println("List date: " + movAndSeries);

    }

}
