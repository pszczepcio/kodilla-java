package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape{
    private String shapeName;
    private double high;
    private double width;

    public Square(String shapeName, double high, double width){
        this.shapeName = shapeName;
        this.high = high;
        this.width = width;
    }

    public double getHigh() {
        return high;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField() {
        return high * width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;
        Square square = (Square) o;
        return Double.compare(square.high, high) == 0 &&
                Double.compare(square.width, width) == 0 &&
                Objects.equals(getShapeName(), square.getShapeName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getShapeName(), high, width);
    }
}
