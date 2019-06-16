//package com.kodilla.sudoku.computer;
//
//import com.kodilla.sudoku.board.SudokuBoard;
//import com.kodilla.sudoku.game.RemoveAllProbableNumber;
//import com.kodilla.sudoku.game.Sections;
//import com.kodilla.sudoku.numbers.NumbersDto;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class EnterOneOccurrenceInSection extends Sections {
//    private static List<Integer> filledField = new ArrayList<>();
//    private static List<NumbersDto> probableField = new ArrayList<>();
//    private static NumbersDto numbersDto;
//    private static int counter;
//    private static boolean singleValue;
//    private static boolean enterValues;
//
//    public static void createFilledFieldList(int iStart, int jStart, int iEnd, int jEnd){
//        filledField.clear();
//        for (int i = iStart ; i < iEnd ; i++){
//            for (int j = jStart ; j < jEnd ; j++){
//                if (SudokuBoard.getvalueOfSingleField(i,j) != -1){
//                    filledField.add(SudokuBoard.getvalueOfSingleField(i,j));
//                }
//            }
//        }
//    }
//
//    public static void creatProbableFieldList(int iStart, int jStart, int iEnd, int jEnd){
//        probableField.clear();
//        for (int i = iStart ; i < iEnd ; i++){
//            for (int j = jStart ; j < jEnd ; j++) {
//                if (SudokuBoard.getvalueOfSingleField(i,j) == -1){
//                    for(int x = 0 ; x < SudokuBoard.getProbaleNumbersSize(i,j) ; x++) {
//                        probableField.add(new NumbersDto(i, j, SudokuBoard.getProbableNumber(i, j, x)));
//                    }
//                }
//            }
//        }
//    }
//
//    public static boolean enterSingleValueInSection(){
//        counter = 0;
//        singleValue = false;
//        for (int i = 1 ; i < 10 ; i++){
//            for(int j = 0 ; j < probableField.size() ; j++){
//                if (probableField.get(j).getNumber() == i){
//                    numbersDto = probableField.get(j);
//                    ++counter;
//                }
//            }
//            if(counter == 1){
//                SudokuBoard.setvalueOfSingleField(numbersDto.getRowNumber(), numbersDto.getColumnNumber(), numbersDto.getNumber());
//                counter = 0;
//                singleValue = true;
//            }
//        }
//        return singleValue;
//    }
//
//    public static boolean enterAllSingleValueInSection(){
//        enterValues = false;
//        for (int i = 0 ; i < 9 ; i+=3){
//            for (int j = 0 ; j < 9 ; j+=3){
//                int iSart = i;
//                int jStart = j;
//                int iEnd=  i + 3;
//                int jEnd = j + 3;
//                createFilledFieldList(iSart, jStart, iEnd, jEnd);
//                creatProbableFieldList(iSart, jStart, iEnd, jEnd);
//                enterValues = enterSingleValueInSection();
//                RemoveAllProbableNumber.removeAllProbableNumbers();
//            }
//        }
//        return enterValues;
//    }
//
//    public static List<Integer> getFilledField() {
//        return filledField;
//    }
//
//    public static List<NumbersDto> getProbableField() {
//        return probableField;
//    }
//}
