package com.ibk.retotecnico.config;

import com.ibk.retotecnico.businnes.impl.ApiExchangeRateService;
import com.ibk.retotecnico.expose.dto.ExchangeRequest;
import com.ibk.retotecnico.model.ExchangeRate;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Optional;

@Log4j2
@Service
@RequiredArgsConstructor
public class ApiExchangeRateClientConfiguration implements ApiExchangeRateService {

    @Value("${api.exchangerate.apikey}")
    private String apikey;

    @Value("${api.exchangerate.uri}")
    private String uri;



    @Override
    public ExchangeRate getExchange(ExchangeRequest exchangeRequest) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set("apikey", apikey);
        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ExchangeRate response = restTemplate.exchange(uri + "&to=" +
                exchangeRequest.getTo() + "&from=" + exchangeRequest.getFrom() + "&amount=" +
                exchangeRequest.getAmount(), HttpMethod.GET, entity, ExchangeRate.class).getBody();
        log.info(response.toString());
        return response;
    }
}
