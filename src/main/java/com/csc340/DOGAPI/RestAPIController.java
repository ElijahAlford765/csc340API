package com.csc340.DOGAPI;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestAPIController {


    @GetMapping("/breeds")
    public dogbreeds getDogBreeds() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://dog.ceo/api/breeds/list/all";
        dogbreeds dogBreed = restTemplate.getForObject(url, dogbreeds.class);
        return dogBreed;
    }

    @GetMapping("/random-dog")
    public DogResponse getRandomDog() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://dog.ceo/api/breeds/image/random";
        DogResponse dogResponse = restTemplate.getForObject(url, DogResponse.class);
        return dogResponse;
    }
}
