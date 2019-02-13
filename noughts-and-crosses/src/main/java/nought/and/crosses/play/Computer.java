package nought.and.crosses.play;

import javafx.geometry.Point2D;
import java.util.ArrayList;
import java.util.List;

public class Computer {
    private static List<String> signList = new ArrayList<>();
    private static List<Point2D> signCoordinates = new ArrayList<>();
    private static Point2D point ;

    public Computer(List<Point2D> list) {
        signCoordinates = list;
    }

    public static Point2D countMove(List<String> list1){
        signList = list1;
        if(signList.get(4) != "X" && signList.get(4) != "O") {
            point = new Point2D(signCoordinates.get(4).getX(), signCoordinates.get(4).getY());
        }else if(signList.get(4) == "X" && signList.get(0) == "X" && signList.get(8) !="O"){
            point = new Point2D(signCoordinates.get(8).getX(), signCoordinates.get(8).getY());
        }else if(signList.get(4) == "X" && signList.get(8) == "X" && signList.get(0) !="O") {
            point = new Point2D(signCoordinates.get(0).getX(), signCoordinates.get(0).getY());
        }else if(signList.get(4) == "X" && signList.get(6) == "X" && signList.get(2) !="O") {
            point = new Point2D(signCoordinates.get(2).getX(), signCoordinates.get(2).getY());
        }else if(signList.get(4) == "X" && signList.get(2) == "X" && signList.get(6) !="O") {
            point = new Point2D(signCoordinates.get(6).getX(), signCoordinates.get(6).getY());
        }else if(signList.get(4) == "X" && signList.get(1) == "X" && signList.get(7) !="O") {
            point = new Point2D(signCoordinates.get(7).getX(), signCoordinates.get(7).getY());
        }else if(signList.get(4) == "X" && signList.get(7) == "X" && signList.get(1) !="O") {
            point = new Point2D(signCoordinates.get(1).getX(), signCoordinates.get(1).getY());
        }else if(signList.get(4) == "X" && signList.get(3) == "X" && signList.get(5) !="O") {
            point = new Point2D(signCoordinates.get(5).getX(), signCoordinates.get(5).getY());
        }else if(signList.get(4) == "X" && signList.get(5) == "X" && signList.get(3) !="O") {
            point = new Point2D(signCoordinates.get(3).getX(), signCoordinates.get(3).getY());
        }else if(signList.get(1) == "X" && signList.get(0) == "X" && signList.get(2) !="O") {
            point = new Point2D(signCoordinates.get(2).getX(), signCoordinates.get(2).getY());
        }else if(signList.get(1) == "X" && signList.get(2) == "X" && signList.get(0) !="O") {
            point = new Point2D(signCoordinates.get(0).getX(), signCoordinates.get(0).getY());
        }else if(signList.get(7) == "X" && signList.get(6) == "X" && signList.get(8) !="O") {
            point = new Point2D(signCoordinates.get(8).getX(), signCoordinates.get(8).getY());
        }else if(signList.get(7) == "X" && signList.get(8) == "X" && signList.get(6) !="O") {
            point = new Point2D(signCoordinates.get(6).getX(), signCoordinates.get(6).getY());
        }else if(signList.get(3) == "X" && signList.get(0) == "X" && signList.get(6) !="O") {
            point = new Point2D(signCoordinates.get(6).getX(), signCoordinates.get(6).getY());
        }else if(signList.get(3) == "X" && signList.get(6) == "X" && signList.get(0) !="O") {
            point = new Point2D(signCoordinates.get(0).getX(), signCoordinates.get(0).getY());
        }else if(signList.get(5) == "X" && signList.get(2) == "X" && signList.get(8) !="O") {
            point = new Point2D(signCoordinates.get(8).getX(), signCoordinates.get(8).getY());
        }else if(signList.get(5) == "X" && signList.get(8) == "X" && signList.get(2) !="O") {
            point = new Point2D(signCoordinates.get(2).getX(), signCoordinates.get(2).getY());
        }else if(signList.get(4) == "X" && signList.get(0) != "X" && signList.get(0) !="O" && signList.get(1) != "X" && signList.get(1) !="O" && signList.get(3) != "X" && signList.get(3) !="O") {
            point = new Point2D(signCoordinates.get(0).getX(), signCoordinates.get(0).getY());
        }else if(signList.get(4) == "X" && signList.get(2) != "X" && signList.get(2) !="O" && signList.get(1) != "X" && signList.get(1) !="O" && signList.get(5) != "X" && signList.get(5) !="O") {
            point = new Point2D(signCoordinates.get(2).getX(), signCoordinates.get(2).getY());
        }else if(signList.get(4) == "X" && signList.get(6) != "X" && signList.get(6) !="O" && signList.get(3) != "X" && signList.get(3) !="O" && signList.get(7) != "X" && signList.get(7) !="O") {
            point = new Point2D(signCoordinates.get(6).getX(), signCoordinates.get(6).getY());
        }else if(signList.get(4) == "X" && signList.get(8) != "X" && signList.get(8) !="O" && signList.get(7) != "X" && signList.get(7) !="O" && signList.get(5) != "X" && signList.get(5) !="O") {
            point = new Point2D(signCoordinates.get(8).getX(), signCoordinates.get(8).getY());
        }else if(signList.get(4) == "O" && signList.get(0) == "X" && signList.get(2) =="X" && signList.get(1) != "X" && signList.get(1) !="O") {
            point = new Point2D(signCoordinates.get(1).getX(), signCoordinates.get(1).getY());
        }else if(signList.get(4) == "O" && signList.get(0) == "X" && signList.get(6) =="X" && signList.get(3) != "X" && signList.get(3) !="O") {
            point = new Point2D(signCoordinates.get(3).getX(), signCoordinates.get(3).getY());
        }else if(signList.get(4) == "O" && signList.get(2) == "X" && signList.get(8) =="X" && signList.get(5) != "X" && signList.get(5) !="O") {
            point = new Point2D(signCoordinates.get(5).getX(), signCoordinates.get(5).getY());
        }else if(signList.get(4) == "O" && signList.get(6) == "X" && signList.get(8) =="X" && signList.get(7) != "X" && signList.get(7) !="O") {
            point = new Point2D(signCoordinates.get(7).getX(), signCoordinates.get(7).getY());
        }else if(signList.get(4) == "O" && signList.get(0) == "X" && signList.get(7) =="X" && signList.get(3) != "X" && signList.get(3) !="O" && signList.get(5) != "X" && signList.get(5) !="O") {
            point = new Point2D(signCoordinates.get(3).getX(), signCoordinates.get(3).getY());
        }else if(signList.get(4) == "O" && signList.get(2) == "X" && signList.get(7) =="X" && signList.get(3) != "X" && signList.get(3) !="O" && signList.get(5) != "X" && signList.get(5) !="O") {
            point = new Point2D(signCoordinates.get(5).getX(), signCoordinates.get(5).getY());
        }else if(signList.get(4) == "O" && signList.get(6) == "X" && signList.get(1) =="X" && signList.get(3) != "X" && signList.get(3) !="O" && signList.get(5) != "X" && signList.get(5) !="O") {
            point = new Point2D(signCoordinates.get(3).getX(), signCoordinates.get(3).getY());
        }else if(signList.get(4) == "O" && signList.get(8) == "X" && signList.get(1) =="X" && signList.get(3) != "X" && signList.get(3) !="O" && signList.get(5) != "X" && signList.get(5) !="O") {
            point = new Point2D(signCoordinates.get(5).getX(), signCoordinates.get(5).getY());
        }else if(signList.get(4) == "O" && signList.get(6) == "X" && signList.get(5) =="X" && signList.get(1) != "X" && signList.get(1) !="O" && signList.get(7) != "X" && signList.get(7) !="O") {
            point = new Point2D(signCoordinates.get(1).getX(), signCoordinates.get(1).getY());
        }else if(signList.get(4) == "O" && signList.get(0) == "X" && signList.get(5) =="X" && signList.get(1) != "X" && signList.get(1) !="O" && signList.get(7) != "X" && signList.get(7) !="O") {
            point = new Point2D(signCoordinates.get(7).getX(), signCoordinates.get(7).getY());
        }else if(signList.get(4) == "O" && signList.get(2) == "X" && signList.get(3) =="X" && signList.get(1) != "X" && signList.get(1) !="O" && signList.get(7) != "X" && signList.get(7) !="O") {
            point = new Point2D(signCoordinates.get(1).getX(), signCoordinates.get(1).getY());
        }else if(signList.get(4) == "O" && signList.get(8) == "X" && signList.get(3) =="X" && signList.get(1) != "X" && signList.get(1) !="O" && signList.get(7) != "X" && signList.get(7) !="O") {
            point = new Point2D(signCoordinates.get(7).getX(), signCoordinates.get(7).getY());
        }else if(signList.get(4) == "O" && signList.get(0) == "X" && signList.get(8) =="X" && signList.get(3) != "X" && signList.get(3) !="O" && signList.get(5) != "X" && signList.get(5) !="O") {
            point = new Point2D(signCoordinates.get(3).getX(), signCoordinates.get(3).getY());
        }else if(signList.get(4) == "O" && signList.get(0) == "X" && signList.get(8) =="X" && signList.get(3) == "O" && signList.get(5) != "X" && signList.get(5) !="O" && signList.get(2) =="X") {
            point = new Point2D(signCoordinates.get(5).getX(), signCoordinates.get(5).getY());
        }
            return point;
    }

    public static List<Point2D> getSignCoordinates() {
        return signCoordinates;
    }
}
