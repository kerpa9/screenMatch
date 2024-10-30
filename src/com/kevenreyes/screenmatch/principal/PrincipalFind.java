package com.kevenreyes.screenmatch.principal;

import com.kevenreyes.screenmatch.DTOS.TitleOmdbDTO;
import com.kevenreyes.screenmatch.exceptions.ErrorIntDuring;
import com.kevenreyes.screenmatch.models.Title;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalFind {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);

        List<Title> movies = new ArrayList<>();

        
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create();

        while (true) {

            System.out.println("-------------------------------MOVIES---------------------------");
            System.out.println("Find's yours favorites movies");

            var find = scanner.nextLine();

            if (find.equalsIgnoreCase("salir")) {
                break;
            }

            try {

                // Http Request

                String address = "https://www.omdbapi.com/?apikey=e2a21826&t=" + find.replace(" ", "+");

                HttpClient client = HttpClient.newHttpClient();

                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(address))
                        .build();

                // Http Response

                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                System.out.println("-----------------Response-------------------");

                // System.out.println(json);

                // Use library GSON
                String json = response.body();


                TitleOmdbDTO myTitleOmdb = gson.fromJson(json, TitleOmdbDTO.class);

                // System.out.println("My tiltle: " + myTitle.getName());
                // System.out.println("Release: " + myTitle.getReleaseDate());

                // Response converter from Gson
                // System.out.println(myTitleOmdb);

                Title myTitle = new Title(myTitleOmdb);

                System.out.println("Title: " + myTitle);

                movies.add(myTitle);

                // FileWriter
                // FileWriter writer = new FileWriter("movies.txt");
                // writer.write(myTitle.toString());

                // // Close writer
                // writer.close();

            } catch (NumberFormatException e) {
                System.out.println("Throw Error");
                System.out.println(e.getMessage());

            } catch (IllegalArgumentException e) {
                System.out.println("Throw Error");
                System.out.println(e.getMessage());

            } catch (ErrorIntDuring e) {
                System.out.println(e.getMessage());

            } finally {
                System.out.println("End program");
            }

        }
        
        FileWriter writer=new FileWriter("movies.json");
        writer.write(gson.toJson(movies));
        writer.close();
        System.out.println(movies);
    }

}
