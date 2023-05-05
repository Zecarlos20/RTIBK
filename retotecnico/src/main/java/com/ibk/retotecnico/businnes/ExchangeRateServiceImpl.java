package com.ibk.retotecnico.businnes;


import com.ibk.retotecnico.businnes.impl.ApiExchangeRateService;
import com.ibk.retotecnico.businnes.impl.ExchageRateService;
import com.ibk.retotecnico.expose.dto.ExchangeRateDto;
import com.ibk.retotecnico.expose.dto.ExchangeRequest;
import com.ibk.retotecnico.model.ExchangeRate;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ExchangeRateServiceImpl implements ExchageRateService {
    private final ApiExchangeRateService apiExchangeRateService;

    @Override
    public ExchangeRateDto exchageRate(ExchangeRequest exchangeRequest) {
        ExchangeRate exchangeRate = apiExchangeRateService.getExchange(exchangeRequest);
        return ExchangeRateDto.builder()
                .info(exchangeRate.getInfo())
                .amount(exchangeRate.getQuery().getAmount())
                .from(exchangeRate.getQuery().getFrom())
                .to(exchangeRate.getQuery().getTo())
                .result(exchangeRate.getResult())
                .build();
    }
}
