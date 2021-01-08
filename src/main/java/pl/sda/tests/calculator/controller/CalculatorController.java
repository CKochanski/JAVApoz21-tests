package pl.sda.tests.calculator.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.tests.calculator.Calculator;
import pl.sda.tests.calculator.model.Calculation;

@RestController
public class CalculatorController {

    private final Calculator calculator;

    public CalculatorController(Calculator calculator) {
        this.calculator = calculator;
    }

    @PostMapping("/calculate")
    public String calculate(@RequestBody Calculation calculation) {
        return calculator.calculate(calculation.getOperationType(), calculation.getArg1(), calculation.getArg2());
    }
}
