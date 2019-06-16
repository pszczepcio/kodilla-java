package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape{
    private String shapeName;
    private static final double PI = 3.14;
    private double radius;

    public Circle(String shapeName, double radius){
        this.shapeName = shapeName;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField() {
        return PI * radius * radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0 &&
                Objects.equals(getShapeName(), circle.getShapeName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getShapeName(), radius);
    }
}
