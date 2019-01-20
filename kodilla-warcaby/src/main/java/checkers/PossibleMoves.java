package checkers;


import javafx.geometry.Point2D;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;


public class PossibleMoves {
    private static MouseEvent event1;
    private final static double RADIUS = 35.0;
    private final static double STEP = 77.5;
    private final static double TWOSTEP = 155;
    private static Color colorFigure;
    private static double xFigure;
    private static double yFigure;
    private static double moveXLeft;
    private static double moveXRight;
    private static double moveYUp;
    private static double moveYDown;
    private static double beatXLeft;
    private static double beatXRight;
    private static double beatYUp;
    private static double beatYDown;
    private static int number;
    private static int nameFigure;
    private static int nameFigure1;
    private static int nameFigure2;
    private static int Figure;
    private static int count1;
    private static int count2;
    private static int blackLeft;
    private static int blackRight;
    private static int whiteLeft;
    private static int whiteRight;
    private static boolean beat1 = false;
    private static boolean beat2 = false;
    private static Point2D moveLeft;
    private static Point2D moveRight;
    private static Point2D beatLeft;
    private static Point2D beatRight;

    public static void posibleMoves(MouseEvent event, Color color) {
        event1 = event;
        colorFigure = color;
        for (int i = 0; i < InitialStateGame.getCollectionOfFigures().size(); i++) {
            if (colorFigure == InitialStateGame.getCollectionOfFigures().get(i).getFill() && InitialStateGame.getCenterXFigure(i) - RADIUS < event1.getX() && InitialStateGame.getCenterXFigure(i) + RADIUS > event1.getX() && InitialStateGame.getCenterYFigure(i) - RADIUS < event1.getY() && InitialStateGame.getCenterYFigure(i) + RADIUS > event1.getY()) {
                number = i;
                xFigure = InitialStateGame.getCenterXFigure(number);
                yFigure = InitialStateGame.getCenterYFigure(number);
            }
        }
        if (colorFigure == Color.WHITE) {
            for (int i = 0; i < Board.getChessBoard().size(); i++) {
                if (xFigure == Board.getX(i) && yFigure == Board.getY(i)) {
                    Figure = i;
                    break;
                }
            }
            for (int i = 0; i < InitialStateGame.getCollectionOfFigures().size(); i++) {
                moveXLeft = xFigure - STEP;
                moveXRight = xFigure + STEP;
                moveYUp = yFigure - STEP;
                moveLeft = CheckFieldBoard.checkField(new Point2D(moveXLeft, moveYUp));
                moveRight = CheckFieldBoard.checkField(new Point2D(moveXRight, moveYUp));
                if (moveLeft != null && CheckFieldBoard.checkFreeField(moveLeft) != null) {
                    nameFigure1 = Board.getChessBoard().indexOf(new Point2D(moveLeft.getX(), moveLeft.getY()));
                    ++count1;
                }
                if (moveRight != null && CheckFieldBoard.checkFreeField(moveRight) != null) {
                    nameFigure2 = Board.getChessBoard().indexOf(new Point2D(moveRight.getX() , moveRight.getY()));
                    ++count2;
                }
                if(count1 + count2 != 0){
                    System.out.println("Figure from field \"" + Board.getNameOfFieldsBoard().get(Figure) + "\" have a possible movements on the fields: ");
                    if(count1 == 1){
                        System.out.println(Board.getNameOfFieldsBoard().get(nameFigure1));
                    }
                    if(count2 == 1){
                        System.out.println(Board.getNameOfFieldsBoard().get(nameFigure2));
                    }
                    break;
                }else{
                    System.out.println("Figure from field \"" + Board.getNameOfFieldsBoard().get(Figure) + "\" hasn't movement.");
                    break;
                }
            }
            count1 = 0;
            count2 = 0;
        }

        if (colorFigure == Color.BLACK) {
            for (int i = 0; i < Board.getChessBoard().size(); i++) {
                if (xFigure == Board.getX(i) && yFigure == Board.getY(i)) {
                    Figure = i;
                    break;
                }
            }
            for (int i = 0; i < InitialStateGame.getCollectionOfFigures().size(); i++) {
                moveXLeft = xFigure - STEP;
                moveXRight = xFigure + STEP;
                moveYDown = yFigure + STEP;
                moveLeft = CheckFieldBoard.checkField(new Point2D(moveXLeft, moveYDown));
                moveRight = CheckFieldBoard.checkField(new Point2D(moveXRight, moveYDown));
                if (moveLeft != null && CheckFieldBoard.checkFreeField(moveLeft) != null) {
                    nameFigure1 = Board.getChessBoard().indexOf(new Point2D(moveLeft.getX(), moveLeft.getY()));
                    ++count1;
                }
                if (moveRight != null && CheckFieldBoard.checkFreeField(moveRight) != null) {
                    nameFigure2 = Board.getChessBoard().indexOf(new Point2D(moveRight.getX() , moveRight.getY()));
                    ++count2;
                }

                if(count1 + count2 != 0) {
                    System.out.println("Figure from field \"" + Board.getNameOfFieldsBoard().get(Figure) + "\" have a possible movements on the fields: ");
                    if(count1 == 1){
                        System.out.println(Board.getNameOfFieldsBoard().get(nameFigure1));
                    }
                    if(count2 == 1){
                        System.out.println(Board.getNameOfFieldsBoard().get(nameFigure2));
                    }
                    break;
                }else{
                    System.out.println("Figure from field \"" + Board.getNameOfFieldsBoard().get(Figure) + "\" hasn't movement.");
                    break;
                }
            }
            count1 = 0;
            count2 = 0;
        }
    }
    public static boolean possibleBeat(MouseEvent event , Color color){
        event1 = event;
        colorFigure = color;
        for (int i = 0; i < InitialStateGame.getCollectionOfFigures().size(); i++) {
            if (colorFigure == InitialStateGame.getCollectionOfFigures().get(i).getFill() && InitialStateGame.getCenterXFigure(i) - RADIUS < event1.getX() && InitialStateGame.getCenterXFigure(i) + RADIUS > event1.getX() && InitialStateGame.getCenterYFigure(i) - RADIUS < event1.getY() && InitialStateGame.getCenterYFigure(i) + RADIUS > event1.getY()) {
                number = i;
                xFigure = InitialStateGame.getCenterXFigure(i);
                yFigure = InitialStateGame.getCenterYFigure(i);
            }
        }
        beatXLeft = xFigure - TWOSTEP;
        beatXRight = xFigure + TWOSTEP;
        beatYUp = yFigure - TWOSTEP;
        moveXLeft = xFigure - STEP;
        moveXRight = xFigure + STEP;
        moveYUp  = yFigure - STEP;

        if(colorFigure == Color.WHITE && colorFigure != Color.BLACK) {
            for (int i = 0; i < Board.getChessBoard().size(); i++) {
                if (xFigure == Board.getX(i) && yFigure == Board.getY(i)) {
                    nameFigure = i;
                    break;
                }
            }
            for (int i = 0; i < InitialStateGame.getCollectionOfFigures().size(); i++) {
                beatYUp = yFigure - TWOSTEP;
                moveYUp = yFigure - STEP;
                moveLeft = CheckFieldBoard.checkField(new Point2D(moveXLeft, moveYUp));
                moveRight = CheckFieldBoard.checkField(new Point2D(moveXRight, moveYUp));
                beatLeft = CheckFieldBoard.checkField(new Point2D(beatXLeft, beatYUp));
                beatRight = CheckFieldBoard.checkField(new Point2D(beatXRight, beatYUp));

                if ((beatLeft != null && CheckFieldBoard.checkFreeField(beatLeft) != null)) {
                    if ((moveLeft != null && CheckFieldBoard.checkFreeField(new Point2D(moveLeft.getX(), moveLeft.getY())) != null) && (moveRight != null && CheckFieldBoard.checkFreeField(new Point2D(moveRight.getX(), moveRight.getY())) != null)) {
                        return false;
                    }
                    if ((InitialStateGame.getCenterXFigure(i) == moveXLeft && InitialStateGame.getCenterYFigure(i) == moveYUp) && InitialStateGame.getCollectionOfFigures().get(i).getFill() == Color.BLACK) {
                        blackLeft = i;
                        blackLeft = Board.getChessBoard().indexOf(new Point2D(InitialStateGame.getCenterXFigure(blackLeft), InitialStateGame.getCenterYFigure(blackLeft)));
                        beat1 = true;
                    }
                }
                if (beatRight != null && CheckFieldBoard.checkFreeField(beatRight) != null) {
                    if ((moveLeft != null && CheckFieldBoard.checkFreeField(new Point2D(moveLeft.getX(), moveLeft.getY())) != null) && (moveRight != null && CheckFieldBoard.checkFreeField(new Point2D(moveRight.getX(), moveRight.getY())) != null)) {
                        return false;
                    }
                    if (InitialStateGame.getCenterXFigure(i) == moveXRight && InitialStateGame.getCenterYFigure(i) == moveYUp && InitialStateGame.getCollectionOfFigures().get(i).getFill() == Color.BLACK) {
                        blackRight = i;
                        blackRight = Board.getChessBoard().indexOf(new Point2D(InitialStateGame.getCenterXFigure(blackRight), InitialStateGame.getCenterYFigure(blackRight)));
                        beat2 = true;
                    }
                }
            }

            if(beat1 != false || beat2 != false){
               System.out.print("Figure from field \"" + Board.getNameOfFieldsBoard().get(nameFigure) + "\" is beating figure from field: ");
                if(beat1 != false){
                    System.out.print(Board.getNameOfFieldsBoard().get(blackLeft) + " ");
                    beat1 = false;
                }
                if(beat2 != false) {
                    System.out.println(Board.getNameOfFieldsBoard().get(blackRight));
                    beat2 = false;
                }
                System.out.println();
                return true;
            }
        }

        if(colorFigure == Color.BLACK){
            for (int i = 0; i < Board.getChessBoard().size(); i++) {
                if (xFigure == Board.getX(i) && yFigure == Board.getY(i)) {
                    nameFigure = i;
                    break;
                }
            }
            for (int i = 0; i < InitialStateGame.getCollectionOfFigures().size(); i++) {
                beatYDown = yFigure + TWOSTEP;
                moveYDown  = yFigure + STEP;
                moveLeft = CheckFieldBoard.checkField(new Point2D(moveXLeft , moveYDown));
                moveRight = CheckFieldBoard.checkField(new Point2D(moveXRight , moveYDown));
                beatLeft = CheckFieldBoard.checkField(new Point2D(beatXLeft, beatYDown));
                beatRight = CheckFieldBoard.checkField(new Point2D(beatXRight, beatYDown));

                if((beatLeft != null && CheckFieldBoard.checkFreeField(beatLeft) != null)) {
                    if ((moveLeft != null && CheckFieldBoard.checkFreeField(new Point2D(moveLeft.getX(), moveLeft.getY())) != null) && (moveRight != null && CheckFieldBoard.checkFreeField(new Point2D(moveRight.getX(), moveRight.getY())) != null)) {
                        return false;
                    }
                    if ((InitialStateGame.getCenterXFigure(i) == moveXLeft && InitialStateGame.getCenterYFigure(i) == moveYDown) && InitialStateGame.getCollectionOfFigures().get(i).getFill() == Color.WHITE) {
                        whiteLeft = i;
                        whiteLeft = Board.getChessBoard().indexOf(new Point2D(InitialStateGame.getCenterXFigure(whiteLeft), InitialStateGame.getCenterYFigure(whiteLeft)));
                        beat1 = true;
                    }
                }
                if(beatRight != null &&CheckFieldBoard.checkFreeField(beatRight) != null){
                    if (InitialStateGame.getCenterXFigure(i) == moveXRight && InitialStateGame.getCenterYFigure(i) == moveYDown && InitialStateGame.getCollectionOfFigures().get(i).getFill() == Color.WHITE) {
                        whiteRight = i;
                        whiteRight = Board.getChessBoard().indexOf(new Point2D(InitialStateGame.getCenterXFigure(whiteRight), InitialStateGame.getCenterYFigure(whiteRight)));
                        beat2 = true;
                    }
                }
            }
            if(beat1 != false || beat2 != false){
                System.out.print("Figure from field \"" + Board.getNameOfFieldsBoard().get(nameFigure) + "\"  is beating figure from field: ");
                if(beat1 != false){
                    System.out.println(Board.getNameOfFieldsBoard().get(whiteLeft));
                    beat1 = false;
                }
                if(beat2 != false){
                    System.out.println(Board.getNameOfFieldsBoard().get(whiteRight));
                    beat2 = false;
                }
                System.out.println();
                return true;
            }
        }
        return false;
    }
}




