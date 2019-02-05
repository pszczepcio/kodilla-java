package com.kodilla.patterns.singleton.strategy;

import com.kodilla.patterns.strategy.social.*;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User mariola = new Millenials("Mariola Szczepańska");
        User jan = new YGeneration("Jan Kowalski");
        User miko = new ZGeneration("Mikołaj");
        //When
        String mariolaUseCommunicator = mariola.publischer();
        System.out.println("Mariola uses " + mariolaUseCommunicator);
        String janUseCommunicator = jan.publischer();
        System.out.println("Jan uses " + janUseCommunicator);
        String mikoUseCommunicator = miko.publischer();
        System.out.println("Mikołaj uses " + mikoUseCommunicator);

        //Then
        Assert.assertEquals("Snapchat" , mariolaUseCommunicator);
        Assert.assertEquals("Twitter" , janUseCommunicator);
        Assert.assertEquals("Facebook" , mikoUseCommunicator);
        System.out.println();
    }

    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User mariola = new Millenials("Mariola Szczepanska");
        //When
        System.out.println("Mariola uses " + mariola.publischer());
        mariola.setSocialPublishert(new FacebookPublisher());
        System.out.println("Now Mariola uses " + mariola.publischer());

        Assert.assertEquals("Facebook" , mariola.publischer());
    }
}
