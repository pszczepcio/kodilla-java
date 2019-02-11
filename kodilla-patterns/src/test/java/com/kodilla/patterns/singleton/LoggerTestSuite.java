package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    private static Logger logger;

    @BeforeClass
    public static void creatLogger(){
        Logger.getInstance().log("event1");
        Logger.getInstance().log("event2");
        Logger.getInstance().log("event3");
    }

    @Test
    public void tesGetNameLogger(){
        //Given
        //When
        String lastLog = Logger.getInstance().getLastLog();
        System.out.println("Logger : " + lastLog);
        //Then
        Assert.assertEquals("event3" , lastLog);
    }
}
