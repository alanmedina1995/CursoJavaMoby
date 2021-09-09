package junit5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatuCalculatorTest {

    private TemperatuCalculator temperatuCalculator;

    @BeforeEach
    public void setUp(){
        temperatuCalculator = new TemperatuCalculator();
    }

    @AfterEach
    public void tearDown(){
        temperatuCalculator = null;
    }
    @Test
    void toFahrenheitTest() {
        assertEquals(-9.4, temperatuCalculator.toFahrenheit(-23), 0.01);
    }
}