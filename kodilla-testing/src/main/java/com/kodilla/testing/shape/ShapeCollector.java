package com.kodilla.testing.shape;

import java.util.ArrayList;
import  com.kodilla.testing.shape.Triangle;

public class ShapeCollector {
    private Shape shape;
    private Shape exampleShape;
    private ArrayList<Shape> collection = new ArrayList<Shape>();

    public ShapeCollector (){
        }

    public ShapeCollector (Shape shape){
        this.shape = shape;
    }

    public Shape getShape() {
        return shape;
    }

    public ArrayList<Shape> getCollection() {
        return collection;
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
             exampleShape = collection.get(n);
        }
        return exampleShape;
    }

    public void showFigures(){

    }

}
