package com.ibk.retotecnico.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ExchangeRate {
    private String date;
    private Info info;
    private Query query;
    private BigDecimal result;
    private Boolean success;
}
