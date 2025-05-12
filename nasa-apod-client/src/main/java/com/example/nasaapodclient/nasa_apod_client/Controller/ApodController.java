package com.example.nasaapodclient.nasa_apod_client.Controller;

import com.example.nasaapodclient.nasa_apod_client.View.NasaApiClient;
import com.example.nasaapodclient.nasa_apod_client.Model.ApodResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApodController {
    private final NasaApiClient nasaApiClient;

    public ApodController(NasaApiClient nasaApiClient) {
        this.nasaApiClient = nasaApiClient;
    }

    @GetMapping("/apod")
    public String getApod(Model model) {
        System.out.println("Acessando o endpoint /apod");
        ApodResponse apod = nasaApiClient.getApod();
        if (apod == null) {
            System.out.println("ApodResponse é null");
            model.addAttribute("error", "Não foi possível carregar os dados da APOD. Verifique a chave da API ou a conexão com a internet.");
        } else {
            System.out.println("ApodResponse recebido: " + apod.getTitle());
        }
        model.addAttribute("apod", apod);
        return "apod";
    }

    @GetMapping("/api/apod")
    public ApodResponse getApodApi() {
        System.out.println("Acessando o endpoint /api/apod");
        return nasaApiClient.getApod();
    }
}