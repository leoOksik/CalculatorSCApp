package com.example.calculatorscapp.service.impl;

import com.example.calculatorscapp.dto.CalculatorParams;
import com.example.calculatorscapp.exception.MessageException;
import com.example.calculatorscapp.service.ServiceCalculatorSC;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

@Service
public class ServiceCalculatorSCImpl implements ServiceCalculatorSC {
    @Override
    public String calculatePerimeterSquare(@NotNull String calculatorOperation, @NotNull Double radius) {

        if(radius <= 0 ) {
            throw new MessageException ("radius must be > 0");
        }
        else if (calculatorOperation.equalsIgnoreCase("s")) {
            return "S = " + Math.PI * radius * radius;
        } else if (calculatorOperation.equalsIgnoreCase("c")) {
            return "C = " + Math.PI * radius;
        }
        else  {
            throw new MessageException("Incorrect operation. Enter s for square or c for perimeter");
        }
    }
}
