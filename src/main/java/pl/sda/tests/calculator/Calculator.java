package pl.sda.tests.calculator;

import org.springframework.stereotype.Component;
import pl.sda.tests.calculator.operation.Operation;
import pl.sda.tests.calculator.operation.OperationType;

import java.util.List;

@Component
public class Calculator {

    private final List<Operation> operations;

    public Calculator(List<Operation> operations) {
        this.operations = operations;
    }

    public String calculate(OperationType operationType, int arg1, int arg2) {
        Operation requestedOperation = operations.stream().filter(operation -> operation.supportedType() == operationType).findAny().orElseThrow();
        return "Result: " + requestedOperation.calculate(arg1, arg2);
    }
}
