package com.math;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorTest {
    private MathApplication mathApplication;
    private CalculatorService calcService;

    public CalculatorTest() {
    }

    @Before
    public void setUp() {
        this.mathApplication = new MathApplication();
        Calculator calculator = new Calculator();
        this.calcService = (CalculatorService)Mockito.spy(calculator);
        this.mathApplication.setCalculatorService(this.calcService);
    }

    @Test
    public void testAdd() {
        Assert.assertEquals(this.mathApplication.add(20.0, 10.0), 30.0, 0.0);
    }

    class Calculator implements CalculatorService {
        Calculator() {
        }

        public double add(double input1, double input2) {
            return input1 + input2;
        }

        public double subtract(double input1, double input2) {
            throw new UnsupportedOperationException("Method not implemented yet!");
        }

        public double multiply(double input1, double input2) {
            throw new UnsupportedOperationException("Method not implemented yet!");
        }

        public double divide(double input1, double input2) {
            throw new UnsupportedOperationException("Method not implemented yet!");
        }
    }
}
