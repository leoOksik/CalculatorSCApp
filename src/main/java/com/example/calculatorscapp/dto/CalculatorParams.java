package com.example.calculatorscapp.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CalculatorParams {

    private String calculatorOperation;
    private Double radius;
}
