package nought.and.crosses.play;


import javafx.scene.text.Font;
import javafx.scene.text.Text;
import java.util.ArrayList;
import java.util.List;

public class ConditionsForBoard {
    private static List<Text> textList ;
    private static List<String> signList = new ArrayList<>();
    private static boolean tab[] = new boolean [9];
    private static Text text;

    public ConditionsForBoard() {
        for(int i = 0 ; i < 9 ; i++){
            tab[i] = true;
            signList.add("" +i);
        }
    }

    public static void checkConditionsForBoard(double x, double y, String sign) {
        for(int i = 0 ; i < 9 ; i++) {
            if (tab[i] == true && x > CreatListOfFields.getBeginnigX(i) && x < CreatListOfFields.getEndX(i) && y > CreatListOfFields.getBeginnigY(i) && y < CreatListOfFields.getEndY(i)) {
                tab[i] = false;
                text = new Text(sign);
                text.setFont(Font.font(80));
                text.setX(CreatListOfFields.getTextCoordinates().get(i).getX());
                text.setY(CreatListOfFields.getTextCoordinates().get(i).getY());
                try {
                    signList.set(i,sign);
                    textList.get(i).setText(text.getText());
                }catch (NullPointerException ex){

                }
                NoughtAndCrosses.getRoot().getChildren().add(text);
                break;
            }else if(tab[i] == false && x > CreatListOfFields.getBeginnigX(i) && x < CreatListOfFields.getEndX(i) && y > CreatListOfFields.getBeginnigY(i) && y < CreatListOfFields.getEndY(i)){
                Play.setRemoveClick(1);
            }
        }
    }

    public static List<String> getSignList() {
        return signList;
    }
}