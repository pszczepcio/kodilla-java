package nought.and.crosses.play;

public class Rectangle {
    private double beginningX;
    private double endX;
    private double beginningY;
    private double endY;

    public Rectangle(double beginningX, double endX, double beginningY, double endY) {
        this.beginningX = beginningX;
        this.endX = endX;
        this.beginningY = beginningY;
        this.endY = endY;
    }

    public double getBeginningX() {
        return beginningX;
    }

    public double getEndX() {
        return endX;
    }

    public double getBeginningY() {
        return beginningY;
    }

    public double getEndY() {
        return endY;
    }
}
