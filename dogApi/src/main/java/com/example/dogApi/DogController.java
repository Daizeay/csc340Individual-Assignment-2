package com.example.dogApi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/dog")

public class DogController {

    @GetMapping
    public DogView getRandomDogView() {
        // Define the API URL as a local variable
        String apiUrl = "https://dog.ceo/api/breeds/image/random";

        // Initialize RestTemplate to perform the API request
        RestTemplate restTemplate = new RestTemplate();

        // Perform the API request and get the response as a String
        String jsonResponse = restTemplate.getForObject(apiUrl, String.class);

        if (jsonResponse != null) {
            try {
                // Initialize ObjectMapper to parse the JSON response
                ObjectMapper objectMapper = new ObjectMapper();

                // Parse the JSON response into a JsonNode object
                JsonNode root = objectMapper.readTree(jsonResponse);

                // Create and populate the DogView object
                DogView dogView = new DogView();
                dogView.setMessage(root.path("message").asText());
                dogView.setStatus(root.path("status").asText());

                return dogView;
            } catch (Exception e) {
                e.printStackTrace();
                return null; // Handle error appropriately
            }
        }
        return null; // Handle error appropriately
    }
}