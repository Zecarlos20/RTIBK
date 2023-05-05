package com.ibk.retotecnico.expose.dto;

import lombok.Data;
import lombok.NonNull;

import java.math.BigDecimal;

@Data
public class ExchangeRequest {
    @NonNull
    private String to;
    @NonNull
    private String from;
    @NonNull
    private BigDecimal amount;
}
