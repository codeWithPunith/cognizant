package Junit.JunitEx3and4.junitdemo.src.test.java;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
        System.out.println("Setup");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Teardown");
    }

    @Test
    void testAddition() {

       
        int a = 10;
        int b = 20;

      
        int result = calculator.add(a, b);

        
        assertEquals(30, result);
 
    }
}