package com.example.feedbackform.Controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiFetcher {
    public static void main(String[] args) {
        // Replace with your desired API endpoint
        String apiUrl = "https://apps.cratiocrm.com/api/apirequest.php?apikey=NF8xXzQ0MCRAMTYyOCMjMjAyMC0xMC0wMSAxMjo0MzozNw==&formname=Ticket&operation=getRecordsBySearch&pageno=1&numofrecords=400&sortcolumn=Contact%20No%201&sortorder=desc&isnull=1&templatename=Recently Created&searchcondition=Status@is@CLOSED@AND$Ticket Date@between@2024-10-29%7C2024-10-29@AND";

        try {
            // Create a URL object
            URL url = new URL(apiUrl);
            // Open a connection to the URL
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            // Check for a successful response code (200 OK)
            int responseCode = conn.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Read the response from the input stream
                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                // Print the output
                System.out.println("API Response:");
                System.out.println(response.toString());
            } else {
                System.out.println("GET request failed. Response Code: " + responseCode);
            }

        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}