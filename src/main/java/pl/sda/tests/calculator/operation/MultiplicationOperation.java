package pl.sda.tests.calculator.operation;

import org.springframework.stereotype.Component;

@Component
class MultiplicationOperation implements Operation {

    @Override
    public int calculate(int arg1, int arg2) {
        return arg1 * arg2;
    }

    @Override
    public OperationType supportedType() {
        return OperationType.MULTIPLICATION;
    }
}
