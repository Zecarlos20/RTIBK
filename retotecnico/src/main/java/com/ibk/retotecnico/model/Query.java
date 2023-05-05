package com.ibk.retotecnico.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Query {
    private BigDecimal amount;
    private String from;
    private String to;
}
