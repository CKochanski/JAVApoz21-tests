package pl.sda.tests.calculator.operation;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubtractionOperationTest {

    private final SubtractionOperation sut = new SubtractionOperation();

    @ParameterizedTest
    @CsvSource({"1,2,-1", "1,-2,3"})
    public void shouldPerformAdditionOperation(int ar1, int arg2, int expected) {
        //when
        int result = sut.calculate(ar1, arg2);

        //then
        assertEquals(expected, result);
    }
}
