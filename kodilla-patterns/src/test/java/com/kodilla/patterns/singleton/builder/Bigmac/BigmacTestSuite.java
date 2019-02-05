package com.kodilla.patterns.singleton.builder.Bigmac;

import com.kodilla.patterns.builder.bigmac.Bigmac;
import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void tesBigmacNew(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("sesame")
                .burgers(2)
                .souce("garlic")
                .ingredient("salat")
                .ingredient("tomatoes")
                .ingredient("cucomber")
                .ingredient("onion")
                .build();

        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(4, bigmac.getIngredients().size());

    }
}
