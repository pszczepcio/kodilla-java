package nought.and.crosses.play;

import javafx.scene.text.Font;
import javafx.scene.text.Text;
import java.util.ArrayList;
import java.util.List;

public class CheckField {
    private static List<DataField> listText = new ArrayList<>();
    private static Text text;
    private static boolean condition1 = true;
    private static boolean condition2 = true;
    private static boolean condition3 = true;
    private static boolean condition4 = true;
    private static boolean condition5 = true;
    private static boolean condition6 = true;
    private static boolean condition7 = true;
    private static boolean condition8 = true;
    private static boolean condition9 = true;


    public  CheckField() {
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                if(i == 0){

                    listText.add(j,new DataField("" + j,(80+j*200),120));
                }
                if(i == 1){
                    listText.add(j+3, new DataField("" + j+3,(80+j*200),320));
                }
                if(i == 2){
                    listText.add(j+6, new DataField("" + j+6, (80+j*200),520));
                }
            }
        }
    }


    public static void printXOrY(double x , double y, String sign) {
        if (x > 0 && x < 200 && y > 0 && y < 200)  {
            if(condition1) {
                text = new Text();
                text.setText(sign);
                text.setFont(Font.font(80));
                text.setX(80);
                text.setY(120);
                listText.get(0).setText(text.getText());
            }else {
                Play.setRemoveClick(1) ;
                return;
            }
            condition1 = false;
        } else if (x > 200 && x < 400 && y > 0 && y < 200) {
            if (condition2) {
                text = new Text();
                text.setText(sign);
                text.setFont(Font.font(80));
                text.setX(280);
                text.setY(120);
                listText.get(1).setText(text.getText());
            }else{
                Play.setRemoveClick(1) ;
                return;
            }
            condition2 = false;
        } else if (x > 400 && x < 600 && y > 0 && y < 200) {
            if(condition3) {
                text = new Text();
                text.setText(sign);
                text.setFont(Font.font(80));
                text.setX(480);
                text.setY(120);
                listText.get(2).setText(text.getText());
            }else{
                Play.setRemoveClick(1) ;
                return;
            }
            condition3 = false;
        } else if (x > 0 && x < 200 && y > 200 && y < 400) {
            if(condition4) {
                text = new Text();
                text.setText(sign);
                text.setFont(Font.font(80));
                text.setX(80);
                text.setY(320);
                listText.get(3).setText(text.getText());
            }else{
                Play.setRemoveClick(1) ;
                return;
            }
            condition4 = false;
        } else if (x > 200 && x < 400 && y > 200 && y < 400) {
                if(condition5) {
                    text = new Text();
                    text.setText(sign);
                    text.setFont(Font.font(80));
                    text.setX(280);
                    text.setY(320);
                    listText.get(4).setText(text.getText());
                }else{
                    Play.setRemoveClick(1) ;
                    return;
                }
                condition5 = false;
        } else if (x > 400 && x < 600 && y > 200 && y < 400) {
            if(condition6) {
                text = new Text();
                text.setText(sign);
                text.setFont(Font.font(80));
                text.setX(480);
                text.setY(320);
                listText.get(5).setText(text.getText());
            }else{
                Play.setRemoveClick(1) ;
                return;
            }
            condition6 = false;
        } else if (x > 0 && x < 200 && y > 400 && y < 600) {
            if(condition7) {
                text = new Text();
                text.setText(sign);
                text.setFont(Font.font(80));
                text.setX(80);
                text.setY(520);
                listText.get(6).setText(text.getText());
            }else{
                Play.setRemoveClick(1) ;
                return;
            }
            condition7 = false;
        }else if (x > 200 && x < 400 && y > 400 && y < 600) {
            if(condition8) {
                text = new Text();
                text.setText(sign);
                text.setFont(Font.font(80));
                text.setX(280);
                text.setY(520);
                listText.get(7).setText(text.getText());
            }else{
                Play.setRemoveClick(1) ;
                return;
            }
            condition8 = false;
        }else if (x > 400 && x < 600 && y > 400 && y < 600) {
            if(condition9) {
                text = new Text();
                text.setText(sign);
                text.setFont(Font.font(80));
                text.setX(480);
                text.setY(520);
                listText.get(8).setText(text.getText());
            }else{
                Play.setRemoveClick(1) ;
                return;
            }
            condition9 = false;
        }
        NoughtAndCrosses.getRoot().getChildren().add(text);
    }

    public static List<DataField> getListText() {
        return listText;
    }
}
