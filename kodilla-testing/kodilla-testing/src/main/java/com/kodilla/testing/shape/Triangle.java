package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape{
    private String shapeName;
    private double high;
    private  double basis;

    public Triangle(String shapeName, double high, double basis){
        this.shapeName = shapeName;
        this.high = high;
        this.basis = basis;
    }

    public double getHigh() {
        return high;
    }

    public double getBasis() {
        return basis;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField() {
        return 0.5 * high * basis;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.high, high) == 0 &&
                Double.compare(triangle.basis, basis) == 0 &&
                Objects.equals(getShapeName(), triangle.getShapeName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getShapeName(), high, basis);
    }
}
