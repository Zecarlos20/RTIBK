package com.ibk.retotecnico;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;


public class RestemplateMain {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.add("apikey", "6rGu1ThPcjnu2lZEiT82XYVRtXN4wzQG");

        HttpEntity<String> requestEntity = new HttpEntity<>(null, headers);

        String url = "https://api.apilayer.com/exchangerates_data/convert?to=EUR&from=PEN&amount=12.50";

        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, requestEntity, String.class);
        System.out.println(response.getBody());
    }
}
