package nought.and.crosses.play;

import javafx.geometry.Point2D;
import java.util.ArrayList;
import java.util.List;

public class CreatListOfFields {
    private static List<Rectangle> list = new ArrayList<>();
    private static List<Point2D> textCoordinates = new ArrayList<>();

    public static void ListOffields() {

        list.add(new Rectangle(0, 200, 0, 200));
        list.add(new Rectangle(200, 400, 0, 200));
        list.add(new Rectangle(400, 600, 0, 200));
        list.add(new Rectangle(0, 200, 200, 400));
        list.add(new Rectangle(200, 400, 200, 400));
        list.add(new Rectangle(400, 600, 200, 400));
        list.add(new Rectangle(0, 200, 400, 600));
        list.add(new Rectangle(200, 400, 400, 600));
        list.add(new Rectangle(400, 600, 400, 600));
    }

    public static void textList() {
        textCoordinates.add(new Point2D(80, 120));
        textCoordinates.add(new Point2D(280, 120));
        textCoordinates.add(new Point2D(480, 120));
        textCoordinates.add(new Point2D(80, 320));
        textCoordinates.add(new Point2D(280, 320));
        textCoordinates.add(new Point2D(480, 320));
        textCoordinates.add(new Point2D(80, 520));
        textCoordinates.add(new Point2D(280, 520));
        textCoordinates.add(new Point2D(480, 520));
    }

    public static List<Rectangle> getList() {
        return list;
    }

    public static List<Point2D> getTextCoordinates() {
        return textCoordinates;
    }

    public static double getBeginnigX(int i){
        return CreatListOfFields.getList().get(i).getBeginningX();
    }

    public static double getBeginnigY(int i){
        return CreatListOfFields.getList().get(i).getBeginningY();
    }

    public static double getEndX(int i){
        return CreatListOfFields.getList().get(i).getEndX();
    }

    public static double getEndY(int i){
        return CreatListOfFields.getList().get(i).getEndY();
    }

}
