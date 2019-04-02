package com.kodilla.patterns2.decorator.taxiportal;


import com.kodilla.patterns2.decorator.pizza.*;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost(){
        //Given
        PizzaOrder pizza = new BasicPizzaOrder();
        //When
        BigDecimal pizzaCost = pizza.getCost();
        //then;
        assertEquals(new BigDecimal(15), pizzaCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription(){
        //Given
        PizzaOrder pizza = new BasicPizzaOrder();
        //When
        String pizzaDescription = pizza.getDescription();
        //then;
        assertEquals("Pizza with dough, tomatoes souce, cheese", pizzaDescription);
    }

    @Test
    public void testPizzaOrderWithHamGetCost(){
        //Given
        PizzaOrder pizza = new BasicPizzaOrder();
        pizza = new PizzaWithHam(pizza);
        //When
        BigDecimal pizzaCost = pizza.getCost();
        //Then
        assertEquals(new BigDecimal(20), pizzaCost);
    }

    @Test
    public void testPizzaOrderWithHamGetDescription(){
        //Given
        PizzaOrder pizza = new BasicPizzaOrder();
        pizza = new PizzaWithHam(pizza);
        //When
        String pizzaDescription = pizza.getDescription();
        //Then
        assertEquals("Pizza with dough, tomatoes souce, cheese, ham", pizzaDescription);
    }

    @Test
    public void testPizzaOrderWithSeveralIngredientsGetCost(){
        //Given
        PizzaOrder pizza = new BasicPizzaOrder();
        pizza = new PizzaWithHam(pizza);
        pizza = new PizzaWithMushrooms(pizza);
        pizza = new PizzaWithPepper(pizza);
        pizza = new PizzaWithCorn(pizza);
        //When
        BigDecimal pizzaCost = pizza.getCost();
        //Then
        assertEquals(new BigDecimal(27), pizzaCost);
    }

    @Test
    public void testPizzaOrderWithSeveralIngredientsGetDescription(){
        //Given
        PizzaOrder pizza = new BasicPizzaOrder();
        pizza = new PizzaWithHam(pizza);
        pizza = new PizzaWithMushrooms(pizza);
        pizza = new PizzaWithPepper(pizza);
        pizza = new PizzaWithCorn(pizza);
        //When
        String pizzaDescription = pizza.getDescription();
        //Then
        assertEquals("Pizza with dough, tomatoes souce, cheese, ham, mushrooms, pepper, corn", pizzaDescription);
        System.out.println(pizzaDescription);
    }
}