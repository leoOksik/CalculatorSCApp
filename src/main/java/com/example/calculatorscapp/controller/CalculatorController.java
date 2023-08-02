package com.example.calculatorscapp.controller;

import com.example.calculatorscapp.dto.CalculatorParams;
import com.example.calculatorscapp.service.ServiceCalculatorSC;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final ServiceCalculatorSC serviceCalculatorSC;

    public CalculatorController(ServiceCalculatorSC serviceCalculatorSC) {
        this.serviceCalculatorSC = serviceCalculatorSC;
    }

    @GetMapping("ping")
    public String ping() {
        return "pong";
    }

    @GetMapping("status")
    public String serverStatus() {
        return "Server is running";
    }

    @PostMapping("solve")
    public ResponseEntity<String> solve (@RequestBody CalculatorParams calculatorParams) {
        return ResponseEntity.ok(serviceCalculatorSC.calculatePerimeterSquare
                (calculatorParams.getCalculatorOperation(), calculatorParams.getRadius()));
    }
}
