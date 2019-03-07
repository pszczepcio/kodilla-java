package game;


public class RemoveAllProbableNumbers {
    private RemoveProbableNumber removeProbableNumber;


    public RemoveAllProbableNumbers(RemoveProbableNumber removeProbableNumber) {
        this.removeProbableNumber = removeProbableNumber;
    }

    public  void removeAllProbableNumbers(){
        for (int i = 0 ; i < 9 ; i++){
            for(int j = 0 ; j < 9 ; j++){
                this.removeProbableNumber.removeNumbersInRow(i,j);
                this.removeProbableNumber.removeNumbersInColumn(i,j);
            }
        }
        for(int i =1 ; i < 10 ; i++){
            this.removeProbableNumber.removeNumbersInSection(i);
        }
    }
}
