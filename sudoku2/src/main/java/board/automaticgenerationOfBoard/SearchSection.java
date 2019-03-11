package board.automaticgenerationOfBoard;

public class SearchSection {

    private int numberBlock;

    public int searchBlockNumber( int row, int column){
        if(0 <= column && column < 3 && 0 <= row && row < 3){
            return numberBlock = 1;
        }else if(3 <= column && column < 6 && 0 <= row && row < 3){
            return numberBlock = 2;
        }else if(6 <= column && column < 9 && 0 <= row && row < 3){
            return numberBlock = 3;
        }else if(0 <= column && column < 3 && 3 <= row && row < 6){
            return numberBlock = 4;
        }else if(3 <= column && column < 6 && 3 <= row && row < 6){
            return numberBlock = 5;
        }else if(6 <= column && column < 9 && 3 <= row && row < 6){
            return numberBlock = 6;
        }else if(0 <= column && column < 3 && 6 <= row && row < 9){
            return numberBlock = 7;
        }else if(3 <= column && column < 6 && 6 <= row && row < 9){
            return numberBlock = 8;
        }else if(6 <= column && column < 9 && 6 <= row && row < 9){
            return numberBlock = 9;
        }else{
            numberBlock = 0;
        }
        return numberBlock;
    }
}
