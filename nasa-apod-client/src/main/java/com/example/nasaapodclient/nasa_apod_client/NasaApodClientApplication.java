package com.example.nasaapodclient.nasa_apod_client;

import com.example.nasaapodclient.nasa_apod_client.View.NasaApiClient;
import com.example.nasaapodclient.nasa_apod_client.Model.ApodResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class NasaApodClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(NasaApodClientApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Bean
	public CommandLineRunner run(NasaApiClient nasaApiClient) { // Usando o nome correto do parâmetro
		return args -> {
			ApodResponse apod = nasaApiClient.getApod();
			System.out.println("Imagem do Dia da NASA (" + apod.getDate() + ")");
			System.out.println("Título: " + apod.getTitle());
			System.out.println("Explicação: " + apod.getExplanation());
			System.out.println("URL da Imagem: " + apod.getUrl());
		};
	}
}