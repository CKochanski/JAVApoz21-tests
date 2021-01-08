package pl.sda.tests.calculator.operation;

public interface Operation {

    int calculate(int arg1, int arg2);
    OperationType supportedType();
}
