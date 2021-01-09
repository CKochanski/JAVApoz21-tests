package pl.sda.tests.calculator.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import pl.sda.tests.calculator.model.Calculation;
import pl.sda.tests.calculator.operation.OperationType;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CalculatorControllerIntegrationTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void shouldReturnProperResult() {
        //given
        Calculation calculation = new Calculation(1, 2, OperationType.ADDITION);

        //when
        ResponseEntity<String> response = restTemplate.postForEntity("/calculate", calculation, String.class);

        //then
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals("Result: 3", response.getBody());
    }
}
