package com.ibk.retotecnico.expose.dto;

import com.ibk.retotecnico.model.Info;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class ExchangeRateDto {
    //private BigDecimal rate;
    private Info info;
    private BigDecimal amount;
    private String from;
    private String to;
    private BigDecimal result;

}
