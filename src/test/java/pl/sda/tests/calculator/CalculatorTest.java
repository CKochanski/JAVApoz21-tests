package pl.sda.tests.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.sda.tests.calculator.operation.Operation;
import pl.sda.tests.calculator.operation.OperationType;

import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculatorTest {

    private final Calculator sut = new Calculator(operations());

    private List<Operation> operations() {
        Operation operation = mock(Operation.class);
        when(operation.calculate(2, 3)).thenReturn(10);
        when(operation.supportedType()).thenReturn(OperationType.ADDITION);
        return List.of(operation);
    }

    @Test
    public void shouldReturnResultForAdditionOperation() {
        //when
        String result = sut.calculate(OperationType.ADDITION, 2, 3);

        //then
        assertEquals("Result: 10", result);
    }

    @Test
    public void shouldThrowExceptionWhenOperationWithGivenTypeIsNotFound() {
        //expect
        Assertions.assertThrows(NoSuchElementException.class, () -> {
            sut.calculate(OperationType.SUBTRACTION, 2, 3);
        });
    }
}
