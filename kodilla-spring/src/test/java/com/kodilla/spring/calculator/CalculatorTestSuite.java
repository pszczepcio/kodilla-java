package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double score = calculator.add(2.3,2.1);
        double score1 = calculator.sub(3.5,2.0);
        double score2= calculator.mul(0.5,2.0);
        double score3 = calculator.div(6.4,3.0);
        //Then
        Assert.assertEquals(4.4,score,0.001);
        Assert.assertEquals(1.5,score1,0.001);
        Assert.assertEquals(1.0,score2,0.001);
        Assert.assertEquals(2.133,score3,0.001);
    }
}
