package pl.sda.tests.calculator.operation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicationOperationTest {

    private final MultiplicationOperation sut = new MultiplicationOperation();

    @ParameterizedTest
    @CsvSource({"10,3,30", "5,-2,-10"})
    public void shouldPerformMultiplicationOperation(int arg1, int arg2, int expected) {
        //when
        int result = sut.calculate(arg1, arg2);

        //then
        assertEquals(expected, result);
    }

    @Test
    public void shouldReturnCorrectOperationType() {
        //when
        OperationType actual = sut.supportedType();

        //then
        assertEquals(OperationType.MULTIPLICATION, actual);
    }
}
