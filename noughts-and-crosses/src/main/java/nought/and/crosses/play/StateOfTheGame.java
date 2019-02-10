package nought.and.crosses.play;

import java.util.List;

public class StateOfTheGame {
    private List<DataField> checkOfWinningFields;
    private boolean winner = false;


    public StateOfTheGame(List<DataField> checkOfWinningFields) {
        this.checkOfWinningFields = checkOfWinningFields;
    }

    public boolean checkStateOfTheGame() {
            if (getCheckOfWinningFields(0) == getCheckOfWinningFields(1) && getCheckOfWinningFields(1) == getCheckOfWinningFields(2)) {
                winner = true;
                return winner;
            } else if(getCheckOfWinningFields(3) == getCheckOfWinningFields(4) && getCheckOfWinningFields(4) == getCheckOfWinningFields(5)){
                winner = true;
                return winner;
            }else if(getCheckOfWinningFields(6) == getCheckOfWinningFields(7) && getCheckOfWinningFields(7) == getCheckOfWinningFields(8)) {
                winner = true;
                return winner;
            }else if(getCheckOfWinningFields(0) == getCheckOfWinningFields(3) && getCheckOfWinningFields(3) == getCheckOfWinningFields(6)) {
                winner = true;
                return winner;
            }else if(getCheckOfWinningFields(1) == getCheckOfWinningFields(4) && getCheckOfWinningFields(4) == getCheckOfWinningFields(7)) {
                winner = true;
                return winner;
            }else if(getCheckOfWinningFields(2) == getCheckOfWinningFields(5) && getCheckOfWinningFields(5) == getCheckOfWinningFields(8)) {
                winner = true;
                return winner;
            }else if(getCheckOfWinningFields(0) == getCheckOfWinningFields(4) && getCheckOfWinningFields(4) == getCheckOfWinningFields(8)) {
                winner = true;
                return winner;
            }else if(getCheckOfWinningFields(2) == getCheckOfWinningFields(4) && getCheckOfWinningFields(4) == getCheckOfWinningFields(6)) {
                winner = true;
                return winner;
            }
        return winner;
    }

    public String getCheckOfWinningFields(int i) {
        return checkOfWinningFields.get(i).getText();
    }
}
