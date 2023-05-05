package com.ibk.retotecnico.expose;

import com.ibk.retotecnico.businnes.impl.ExchageRateService;
import com.ibk.retotecnico.expose.dto.ExchangeRateDto;
import com.ibk.retotecnico.expose.dto.ExchangeRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/exchange-rate")
@RequiredArgsConstructor
public class ExchangeRateController {
    private final ExchageRateService exchageRateService;

    @GetMapping("/calculate")
    public ExchangeRateDto exchangeRate(@RequestBody ExchangeRequest exchangeRequest) {
        return exchageRateService.exchageRate(exchangeRequest);
    }
}
