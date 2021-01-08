package pl.sda.tests.calculator.model;

import pl.sda.tests.calculator.operation.OperationType;

public class Calculation {

    private int arg1;
    private int arg2;
    private OperationType operationType;

    public Calculation(int arg1, int arg2, OperationType operationType) {
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.operationType = operationType;
    }

    public Calculation() {
    }

    public int getArg1() {
        return arg1;
    }

    public void setArg1(int arg1) {
        this.arg1 = arg1;
    }

    public int getArg2() {
        return arg2;
    }

    public void setArg2(int arg2) {
        this.arg2 = arg2;
    }

    public OperationType getOperationType() {
        return operationType;
    }

    public void setOperationType(OperationType operationType) {
        this.operationType = operationType;
    }
}
