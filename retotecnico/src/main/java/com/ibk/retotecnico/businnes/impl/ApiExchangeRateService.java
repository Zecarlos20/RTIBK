package com.ibk.retotecnico.businnes.impl;


import com.ibk.retotecnico.expose.dto.ExchangeRequest;
import com.ibk.retotecnico.model.ExchangeRate;

import java.util.Optional;

public interface ApiExchangeRateService {
    ExchangeRate getExchange(ExchangeRequest exchangeRequest);
}
