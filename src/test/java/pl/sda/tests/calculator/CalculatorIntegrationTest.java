package pl.sda.tests.calculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.sda.tests.calculator.operation.OperationType;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class CalculatorIntegrationTest {

    @Autowired
    private Calculator sut;

    @ParameterizedTest
    @EnumSource(value = OperationType.class)
    public void shouldHaveMappingForAllEnumValues(OperationType operationType) {
        //when
        String actual = sut.calculate(operationType, 1, 2);

        //then
        assertNotNull(actual);
    }
}
