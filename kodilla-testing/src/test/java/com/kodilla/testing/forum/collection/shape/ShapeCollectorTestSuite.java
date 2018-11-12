package com.kodilla.testing.forum.collection.shape;

import com.kodilla.testing.shape.*;
import com.kodilla.testing.shape.Triangle;
import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    // sprawdzanie metody dodającej figure
    public void testAddFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square("square1", 5.0, 5.0);
        //When
        shapeCollector.addFigure(square);
        //Then
        Assert.assertEquals(1,shapeCollector.getCollection().size());
    }

    @Test
    //test sprawdzajacy usuwanie figury
    public void testRemoveFigure(){
        //Given
        Shape square = new Square("square1", 5.0, 5.0);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(square);
        //When
        shapeCollector.removeFigure(square);
        //Then
        Assert.assertEquals(0,shapeCollector.getCollection().size());
    }


    @Test
    //sprawdzenie pobrania figury z listy
    public void testGetFigure() {
        //Given
        Shape triangle = new Triangle("triangle1", 5.0, 3.0);
        ShapeCollector shapeCollector = new ShapeCollector(triangle);
        //When
        shapeCollector.addFigure(triangle);
        //shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals("triangle1",shapeCollector.getFigure(0).getShapeName());
        Assert.assertEquals(triangle, shapeCollector.getFigure(0));

    }
}
