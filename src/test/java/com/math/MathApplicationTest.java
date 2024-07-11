package com.math;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTest {
    @InjectMocks
    MathApplication mathApplication = new MathApplication();
    @Mock
    CalculatorService calcService;

    public MathApplicationTest() {
    }

    @Test
    public void testAdd() {
        Mockito.when(this.calcService.add(10.0, 20.0)).thenReturn(30.0);
        Assert.assertEquals(this.mathApplication.add(10.0, 20.0), 30.0, 0.0);
        ((CalculatorService) Mockito.verify(this.calcService)).add(11.0, 20.0);
    }
}
 