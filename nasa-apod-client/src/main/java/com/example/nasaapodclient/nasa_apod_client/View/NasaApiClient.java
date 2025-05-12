package com.example.nasaapodclient.nasa_apod_client.View;

import com.example.nasaapodclient.nasa_apod_client.Model.ApodResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.client.HttpClientErrorException;

@Component
public class NasaApiClient {
    private final String APOD_URL;
    private final RestTemplate restTemplate;

    public NasaApiClient(RestTemplate restTemplate, @Value("${nasa.api.key}") String apiKey) {
        this.restTemplate = restTemplate;
        this.APOD_URL = "https://api.nasa.gov/planetary/apod?api_key=" + apiKey;
    }

    public ApodResponse getApod() {
        try {
            System.out.println("Chamando a API da NASA com URL: " + APOD_URL);
            ApodResponse response = restTemplate.getForObject(APOD_URL, ApodResponse.class);
            System.out.println("Resposta recebida: " + (response != null ? response.getTitle() : "null"));
            return response;
        } catch (HttpClientErrorException e) {
            System.err.println("Erro HTTP ao chamar a API da NASA: " + e.getStatusCode() + " - " + e.getResponseBodyAsString());
            return null;
        } catch (Exception e) {
            System.err.println("Erro inesperado ao chamar a API da NASA: " + e.getMessage());
            return null;
        }
    }
}