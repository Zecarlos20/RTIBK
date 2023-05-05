package com.ibk.retotecnico.businnes.impl;


import com.ibk.retotecnico.expose.dto.ExchangeRateDto;
import com.ibk.retotecnico.expose.dto.ExchangeRequest;

public interface ExchageRateService {
    ExchangeRateDto exchageRate(ExchangeRequest exchangeRequest);
}
