package nought.and.crosses.play;

public class DataField {
    private String text;
    private double x;
    private double y;

    public DataField(String text, double x, double y) {
        this.text = text;
        this.x = x;
        this.y = y;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
