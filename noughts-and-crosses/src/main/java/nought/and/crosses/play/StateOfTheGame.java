package nought.and.crosses.play;

import java.util.ArrayList;
import java.util.List;

public class StateOfTheGame {
    private List<String> list;
    private static List<Boolean> conditionValue = new ArrayList<>();
    private boolean winner = false;

    public StateOfTheGame(List<String> list) {
        this.list = list;
            conditionValue.add(getList(0) == getList(1) && getList(1) == getList(2));
            conditionValue.add(getList(3) == getList(4) && getList(4) == getList(5));
            conditionValue.add(getList(6) == getList(7) && getList(7) == getList(8));
            conditionValue.add(getList(0) == getList(3) && getList(3) == getList(6));
            conditionValue.add(getList(1) == getList(4) && getList(4) == getList(7));
            conditionValue.add(getList(2) == getList(5) && getList(5) == getList(8));
            conditionValue.add(getList(0) == getList(4) && getList(4) == getList(8));
            conditionValue.add(getList(2) == getList(4) && getList(4) == getList(6));
    }

    public boolean checkStateOfTheGame() {

        for (int i = 0; i < getConditionValue().size(); i++) {
            if (getConditionValue().get(i).booleanValue() == true) {
                return true;
            }
        }
        return false;
    }

    public String getList(int i) {
        return list.get(i);
    }

    public static List<Boolean> getConditionValue() {
        return conditionValue;
    }
}
