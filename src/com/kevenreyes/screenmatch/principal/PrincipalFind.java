package com.kevenreyes.screenmatch.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;
import com.google.gson.Gson;
import com.kevenreyes.screenmatch.models.Title;

public class PrincipalFind {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("-------------------------------MOVIES---------------------------");
        System.out.println("Find's yours favorites movies");

        var find = scanner.nextLine();

        String address = "https://www.omdbapi.com/?apikey=e2a21826&t=" + find;

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(address))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("-----------------Response-------------------");

        String json = response.body();

        // System.out.println(json);

        // Use library GSON
        Gson gson = new Gson();

        Title myTitle = gson.fromJson(json, Title.class);

        // System.out.println("My tiltle: " + myTitle.getName());
        // System.out.println("Release: " + myTitle.getReleaseDate());
        System.out.println(myTitle);
        // Gson
    }

}
