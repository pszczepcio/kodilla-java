package board;

import java.util.ArrayList;
import java.util.List;


public class GeneratedBoard {
    private SudokuBoard sudokuBoard;
    private List<Integer> listOfNumbers = new ArrayList<>();
    private List<Integer> listOfRepetitions = new ArrayList<>();


    public GeneratedBoard(SudokuBoard sudokuBoard) {
        this.sudokuBoard = sudokuBoard;
    }

    public void creatBoard2(){
        this.sudokuBoard.getSudokuBoard().get(0).getSudokuElementsInRow().get(1).setValue(7);
        this.sudokuBoard.getSudokuBoard().get(0).getSudokuElementsInRow().get(7).setValue(1);
        this.sudokuBoard.getSudokuBoard().get(0).getSudokuElementsInRow().get(8).setValue(6);


        this.sudokuBoard.getSudokuBoard().get(1).getSudokuElementsInRow().get(0).setValue(3);
        this.sudokuBoard.getSudokuBoard().get(1).getSudokuElementsInRow().get(1).setValue(5);
        this.sudokuBoard.getSudokuBoard().get(1).getSudokuElementsInRow().get(7).setValue(4);


        this.sudokuBoard.getSudokuBoard().get(2).getSudokuElementsInRow().get(2).setValue(6);
        this.sudokuBoard.getSudokuBoard().get(2).getSudokuElementsInRow().get(6).setValue(5);
        this.sudokuBoard.getSudokuBoard().get(2).getSudokuElementsInRow().get(8).setValue(3);

        this.sudokuBoard.getSudokuBoard().get(3).getSudokuElementsInRow().get(1).setValue(3);
        this.sudokuBoard.getSudokuBoard().get(3).getSudokuElementsInRow().get(4).setValue(1);
        this.sudokuBoard.getSudokuBoard().get(3).getSudokuElementsInRow().get(8).setValue(8);

        this.sudokuBoard.getSudokuBoard().get(4).getSudokuElementsInRow().get(2).setValue(7);
        this.sudokuBoard.getSudokuBoard().get(4).getSudokuElementsInRow().get(4).setValue(9);

        this.sudokuBoard.getSudokuBoard().get(5).getSudokuElementsInRow().get(2).setValue(9);
        this.sudokuBoard.getSudokuBoard().get(5).getSudokuElementsInRow().get(5).setValue(6);
        this.sudokuBoard.getSudokuBoard().get(5).getSudokuElementsInRow().get(6).setValue(1);

        this.sudokuBoard.getSudokuBoard().get(6).getSudokuElementsInRow().get(7).setValue(3);

        this.sudokuBoard.getSudokuBoard().get(7).getSudokuElementsInRow().get(5).setValue(5);
        this.sudokuBoard.getSudokuBoard().get(7).getSudokuElementsInRow().get(7).setValue(6);
        this.sudokuBoard.getSudokuBoard().get(7).getSudokuElementsInRow().get(8).setValue(1);


        this.sudokuBoard.getSudokuBoard().get(8).getSudokuElementsInRow().get(0).setValue(4);
        this.sudokuBoard.getSudokuBoard().get(8).getSudokuElementsInRow().get(1).setValue(1);
        this.sudokuBoard.getSudokuBoard().get(8).getSudokuElementsInRow().get(2).setValue(3);
        this.sudokuBoard.getSudokuBoard().get(8).getSudokuElementsInRow().get(6).setValue(8);
        this.sudokuBoard.getSudokuBoard().get(8).getSudokuElementsInRow().get(7).setValue(7);

        for(int i = 0 ; i < 9 ; i++){
            for(int j = 0 ; j < 9 ; j++){
                if(this.sudokuBoard.getvalueOfSingleField(i, j) != -1){
                    this.sudokuBoard.getSudokuBoard().get(i).getSudokuElementsInRow().get(j).setChange(false);
                }else if (this.sudokuBoard.getvalueOfSingleField(i ,j) == -1){
                    this.sudokuBoard.getSudokuBoard().get(i).getSudokuElementsInRow().get(j).setChange(true);
                }
            }
        }
        this.sudokuBoard.printBoard();
    }

    public void createNewBoard(){
        this.sudokuBoard.getSudokuBoard().get(0).getSudokuElementsInRow().get(1).setValue(2);
        this.sudokuBoard.getSudokuBoard().get(0).getSudokuElementsInRow().get(3).setValue(5);
        this.sudokuBoard.getSudokuBoard().get(0).getSudokuElementsInRow().get(5).setValue(1);
        this.sudokuBoard.getSudokuBoard().get(0).getSudokuElementsInRow().get(7).setValue(9);

        this.sudokuBoard.getSudokuBoard().get(1).getSudokuElementsInRow().get(0).setValue(8);
        this.sudokuBoard.getSudokuBoard().get(1).getSudokuElementsInRow().get(3).setValue(2);
        this.sudokuBoard.getSudokuBoard().get(1).getSudokuElementsInRow().get(5).setValue(3);
        this.sudokuBoard.getSudokuBoard().get(1).getSudokuElementsInRow().get(8).setValue(6);

        this.sudokuBoard.getSudokuBoard().get(2).getSudokuElementsInRow().get(1).setValue(3);
        this.sudokuBoard.getSudokuBoard().get(2).getSudokuElementsInRow().get(4).setValue(6);
        this.sudokuBoard.getSudokuBoard().get(2).getSudokuElementsInRow().get(7).setValue(7);

        this.sudokuBoard.getSudokuBoard().get(3).getSudokuElementsInRow().get(2).setValue(1);
        this.sudokuBoard.getSudokuBoard().get(3).getSudokuElementsInRow().get(6).setValue(6);

        this.sudokuBoard.getSudokuBoard().get(4).getSudokuElementsInRow().get(0).setValue(5);
        this.sudokuBoard.getSudokuBoard().get(4).getSudokuElementsInRow().get(1).setValue(4);
        this.sudokuBoard.getSudokuBoard().get(4).getSudokuElementsInRow().get(7).setValue(1);
        this.sudokuBoard.getSudokuBoard().get(4).getSudokuElementsInRow().get(8).setValue(9);

        this.sudokuBoard.getSudokuBoard().get(5).getSudokuElementsInRow().get(2).setValue(2);
        this.sudokuBoard.getSudokuBoard().get(5).getSudokuElementsInRow().get(6).setValue(7);

        this.sudokuBoard.getSudokuBoard().get(6).getSudokuElementsInRow().get(1).setValue(9);
        this.sudokuBoard.getSudokuBoard().get(6).getSudokuElementsInRow().get(4).setValue(3);
        this.sudokuBoard.getSudokuBoard().get(6).getSudokuElementsInRow().get(7).setValue(8);

        this.sudokuBoard.getSudokuBoard().get(7).getSudokuElementsInRow().get(0).setValue(2);
        this.sudokuBoard.getSudokuBoard().get(7).getSudokuElementsInRow().get(3).setValue(8);
        this.sudokuBoard.getSudokuBoard().get(7).getSudokuElementsInRow().get(5).setValue(4);
        this.sudokuBoard.getSudokuBoard().get(7).getSudokuElementsInRow().get(8).setValue(7);

        this.sudokuBoard.getSudokuBoard().get(8).getSudokuElementsInRow().get(1).setValue(1);
        this.sudokuBoard.getSudokuBoard().get(8).getSudokuElementsInRow().get(3).setValue(9);
        this.sudokuBoard.getSudokuBoard().get(8).getSudokuElementsInRow().get(5).setValue(7);
        this.sudokuBoard.getSudokuBoard().get(8).getSudokuElementsInRow().get(7).setValue(6);
        ///////////////////////////////////////////////////////////////////////////////////////////////////////
        this.sudokuBoard.getSudokuBoard().get(0).getSudokuElementsInRow().get(0).setValue(4);
        this.sudokuBoard.getSudokuBoard().get(0).getSudokuElementsInRow().get(2).setValue(6);
        this.sudokuBoard.getSudokuBoard().get(0).getSudokuElementsInRow().get(4).setValue(7);
        this.sudokuBoard.getSudokuBoard().get(0).getSudokuElementsInRow().get(6).setValue(3);
        this.sudokuBoard.getSudokuBoard().get(0).getSudokuElementsInRow().get(8).setValue(8);

        this.sudokuBoard.getSudokuBoard().get(1).getSudokuElementsInRow().get(1).setValue(5);
        this.sudokuBoard.getSudokuBoard().get(1).getSudokuElementsInRow().get(2).setValue(7);
        this.sudokuBoard.getSudokuBoard().get(1).getSudokuElementsInRow().get(4).setValue(9);
        this.sudokuBoard.getSudokuBoard().get(1).getSudokuElementsInRow().get(6).setValue(1);
        this.sudokuBoard.getSudokuBoard().get(1).getSudokuElementsInRow().get(7).setValue(4);

        this.sudokuBoard.getSudokuBoard().get(2).getSudokuElementsInRow().get(0).setValue(1);
        this.sudokuBoard.getSudokuBoard().get(2).getSudokuElementsInRow().get(2).setValue(9);
        this.sudokuBoard.getSudokuBoard().get(2).getSudokuElementsInRow().get(3).setValue(4);
        this.sudokuBoard.getSudokuBoard().get(2).getSudokuElementsInRow().get(5).setValue(8);
        this.sudokuBoard.getSudokuBoard().get(2).getSudokuElementsInRow().get(6).setValue(2);
        this.sudokuBoard.getSudokuBoard().get(2).getSudokuElementsInRow().get(8).setValue(5);

        this.sudokuBoard.getSudokuBoard().get(3).getSudokuElementsInRow().get(0).setValue(9);
        this.sudokuBoard.getSudokuBoard().get(3).getSudokuElementsInRow().get(1).setValue(7);
        this.sudokuBoard.getSudokuBoard().get(3).getSudokuElementsInRow().get(3).setValue(3);
        this.sudokuBoard.getSudokuBoard().get(3).getSudokuElementsInRow().get(4).setValue(8);
        this.sudokuBoard.getSudokuBoard().get(3).getSudokuElementsInRow().get(5).setValue(5);
        this.sudokuBoard.getSudokuBoard().get(3).getSudokuElementsInRow().get(7).setValue(2);
        this.sudokuBoard.getSudokuBoard().get(3).getSudokuElementsInRow().get(8).setValue(4);

        this.sudokuBoard.getSudokuBoard().get(4).getSudokuElementsInRow().get(2).setValue(3);
        this.sudokuBoard.getSudokuBoard().get(4).getSudokuElementsInRow().get(3).setValue(7);
        this.sudokuBoard.getSudokuBoard().get(4).getSudokuElementsInRow().get(4).setValue(2);
        this.sudokuBoard.getSudokuBoard().get(4).getSudokuElementsInRow().get(5).setValue(6);
        this.sudokuBoard.getSudokuBoard().get(4).getSudokuElementsInRow().get(6).setValue(8);

        this.sudokuBoard.getSudokuBoard().get(5).getSudokuElementsInRow().get(0).setValue(6);
        this.sudokuBoard.getSudokuBoard().get(5).getSudokuElementsInRow().get(1).setValue(8);
        this.sudokuBoard.getSudokuBoard().get(5).getSudokuElementsInRow().get(3).setValue(1);
        this.sudokuBoard.getSudokuBoard().get(5).getSudokuElementsInRow().get(4).setValue(4);
        this.sudokuBoard.getSudokuBoard().get(5).getSudokuElementsInRow().get(5).setValue(9);
        this.sudokuBoard.getSudokuBoard().get(5).getSudokuElementsInRow().get(7).setValue(5);
        this.sudokuBoard.getSudokuBoard().get(5).getSudokuElementsInRow().get(8).setValue(3);

        this.sudokuBoard.getSudokuBoard().get(6).getSudokuElementsInRow().get(0).setValue(7);
        this.sudokuBoard.getSudokuBoard().get(6).getSudokuElementsInRow().get(2).setValue(4);
        this.sudokuBoard.getSudokuBoard().get(6).getSudokuElementsInRow().get(3).setValue(6);
        this.sudokuBoard.getSudokuBoard().get(6).getSudokuElementsInRow().get(5).setValue(2);
        this.sudokuBoard.getSudokuBoard().get(6).getSudokuElementsInRow().get(6).setValue(5);
        this.sudokuBoard.getSudokuBoard().get(6).getSudokuElementsInRow().get(8).setValue(1);

        this.sudokuBoard.getSudokuBoard().get(7).getSudokuElementsInRow().get(1).setValue(6);
        this.sudokuBoard.getSudokuBoard().get(7).getSudokuElementsInRow().get(2).setValue(5);
        this.sudokuBoard.getSudokuBoard().get(7).getSudokuElementsInRow().get(4).setValue(1);
        this.sudokuBoard.getSudokuBoard().get(7).getSudokuElementsInRow().get(6).setValue(9);
        this.sudokuBoard.getSudokuBoard().get(7).getSudokuElementsInRow().get(7).setValue(3);

        this.sudokuBoard.getSudokuBoard().get(8).getSudokuElementsInRow().get(4).setValue(5);
        this.sudokuBoard.getSudokuBoard().get(8).getSudokuElementsInRow().get(6).setValue(4);
        this.sudokuBoard.getSudokuBoard().get(8).getSudokuElementsInRow().get(8).setValue(2);
        for(int i = 0 ; i < 9 ; i++){
            for(int j = 0 ; j < 9 ; j++){
                if(this.sudokuBoard.getvalueOfSingleField(i, j) != -1){
                    this.sudokuBoard.getSudokuBoard().get(i).getSudokuElementsInRow().get(j).setChange(false);
                }
            }
        }
        this.sudokuBoard.printBoard();
    }



    public List<Integer> getListOfNumbers() {
        return listOfNumbers;
    }

    public List<Integer> getListOfRepetitions() {
        return listOfRepetitions;
    }
}
