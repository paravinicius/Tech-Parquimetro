package com.fiap.techparquimetro.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalTime;

@Document
@Data
public class Recibo {
    @Id
    private String codigo;
    private String IdVeiculo;
    private String horaEntrada;
    private String horaSaida;
    private double valorRecibo;
}
