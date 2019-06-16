package com.kodilla.testing.shape;

import java.util.ArrayList;
import  com.kodilla.testing.shape.Triangle;

public class ShapeCollector {
    private Shape shape;
    private ArrayList<Shape> collection = new ArrayList<Shape>();

    public ShapeCollector (){
        }

    public void addFigure(Shape shape) {
        collection.add(shape);
    }

    public boolean removeFigure(Shape shape){
        boolean result = false;
        if(collection.contains(shape)){
            collection.remove(shape);
            result = true;
        }
        return result;

    }

    public Shape getFigure(int n){
        if(n >= 0 && n < collection.size()){
             shape = collection.get(n);
        }
        return shape;
    }

    public int showFigures(){
        System.out.println("The size of the collection of figures is: " + collection.size());
        return collection.size();
    }
}
