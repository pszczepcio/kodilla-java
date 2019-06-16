//package com.kodilla.sudoku.game;
//
//import com.kodilla.sudoku.board.SudokuBoard;
//import com.kodilla.sudoku.numbers.NumbersDto;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class RemoveProbableNumber extends Sections{
//    private static int columnNumber;
//    private NumbersDto numbersDto;
//    private static List<Integer> filledFieldsList = new ArrayList<>();
//    private static List<Integer> emptyFieldsList = new ArrayList<>();
//    private static int blockNumber;
//
//    public static void removeNumbersInRow(int row, int column){
//        for(int i = 0 ; i < 9 ; i++){
//            if(SudokuBoard.getvalueOfSingleField(row, i) != -1) {
//                filledFieldsList.add(SudokuBoard.getvalueOfSingleField(row, i));
//            }
//        }
//        for (int i = 0 ; i < 9 ; i++){
//            for(int j = 0 ; j < filledFieldsList.size() ; j++){
//                SudokuBoard.getSudokuBoard().get(row).getRow().get(i).getProbableNumbers().remove(filledFieldsList.get(j));
//            }
//        }
//        filledFieldsList.clear();
//        //return true;
//    }
//
//    public static void removeNumbersInColumn(int row, int column){
//        for(int i = 0 ; i < 9 ; i++){
//            if(SudokuBoard.getvalueOfSingleField(i, column) != -1){
//                filledFieldsList.add(SudokuBoard.getvalueOfSingleField(i, column));
//            }
//        }
//        for (int i = 0 ; i < 9 ; i++){
//            for (int j = 0 ; j < filledFieldsList.size() ; j++){
//                SudokuBoard.getSudokuBoard().get(i).getRow().get(column).getProbableNumbers().remove(filledFieldsList.get(j));
//            }
//        }
//        filledFieldsList.clear();
//        //return true;
//    }
//
//    public static int searchSectionNumber(int row, int column) {
//        if (0 <= row && row <= 2 && 0 <= column && column <= 2) {
//            blockNumber = 1;
//        }else if (0 <= row && row <= 2 && 3<= column && column <= 5){
//            blockNumber = 2;
//        }else if (0 <= row && row <= 2 && 6<= column && column <= 8) {
//            blockNumber = 3;
//        }else if (3 <= row && row <= 5 && 0<= column && column <= 2) {
//            blockNumber = 4;
//        }else if(3 <= row && row <= 5 && 3<= column && column <= 5) {
//             blockNumber =5;
//        }else if(3 <= row && row <= 5 && 6<= column && column <= 8) {
//            blockNumber = 6;
//        }else if(6 <= row && row <= 8 && 0<= column && column <= 2) {
//            blockNumber = 7;
//        }else if(6 <= row && row <= 8 && 3<= column && column <= 5) {
//            blockNumber = 8;
//        }else if(6 <= row && row <= 8 && 6<= column && column <= 8) {
//            blockNumber = 9;
//        }
//        return blockNumber;
//    }
//
//    public static void removeNumbersInSection(int blockNumber) {
//        switch (blockNumber) {
//            case SECTION1: {
//                for (int i = 0; i < 3; i++) {
//                    for (int j = 0; j < 3; j++) {
//                        if (SudokuBoard.getvalueOfSingleField(i, j) != -1) {
//                            filledFieldsList.add(SudokuBoard.getvalueOfSingleField(i, j));
//                        }
//                    }
//                }
//                for (int i = 0; i < 3; i++) {
//                    for (int j = 0; j < 3; j++) {
//                        if (SudokuBoard.getvalueOfSingleField(i, j) == -1) {
//                            for (int x = 0; x < filledFieldsList.size(); x++) {
//                                SudokuBoard.getSudokuBoard().get(i).getRow().get(j).getProbableNumbers().remove(filledFieldsList.get(x));
//                            }
//                        }
//                    }
//                }
//                break;
//            }
//            case SECTION2: {
//                for (int i = 0; i < 3; i++) {
//                    for (int j = 3; j < 6; j++) {
//                        if (SudokuBoard.getvalueOfSingleField(i, j) != -1) {
//                            filledFieldsList.add(SudokuBoard.getvalueOfSingleField(i, j));
//                        }
//                    }
//                }
//                for (int i = 0; i < 3; i++) {
//                    for (int j = 3; j < 6; j++) {
//                        if (SudokuBoard.getvalueOfSingleField(i, j) == -1) {
//                            for (int x = 0; x < filledFieldsList.size(); x++) {
//                                SudokuBoard.getSudokuBoard().get(i).getRow().get(j).getProbableNumbers().remove(filledFieldsList.get(x));
//                            }
//                        }
//                    }
//                }
//                break;
//            }
//            case SECTION3: {
//                for (int i = 0; i < 3; i++) {
//                    for (int j = 6; j < 9; j++) {
//                        if (SudokuBoard.getvalueOfSingleField(i, j) != -1) {
//                            filledFieldsList.add(SudokuBoard.getvalueOfSingleField(i, j));
//                        }
//                    }
//                }
//                for (int i = 0; i < 3; i++) {
//                    for (int j = 6; j < 9; j++) {
//                        if (SudokuBoard.getvalueOfSingleField(i, j) == -1) {
//                            for (int x = 0; x < filledFieldsList.size(); x++) {
//                                SudokuBoard.getSudokuBoard().get(i).getRow().get(j).getProbableNumbers().remove(filledFieldsList.get(x));
//                            }
//                        }
//                    }
//                }
//                break;
//            }
//            case SECTION4: {
//                for (int i = 3; i < 6; i++) {
//                    for (int j = 0; j < 3; j++) {
//                        if (SudokuBoard.getvalueOfSingleField(i, j) != -1) {
//                            filledFieldsList.add(SudokuBoard.getvalueOfSingleField(i, j));
//                        }
//                    }
//                }
//                for (int i = 3; i < 6; i++) {
//                    for (int j = 0; j < 3; j++) {
//                        if (SudokuBoard.getvalueOfSingleField(i, j) == -1) {
//                            for (int x = 0; x < filledFieldsList.size(); x++) {
//                                SudokuBoard.getSudokuBoard().get(i).getRow().get(j).getProbableNumbers().remove(filledFieldsList.get(x));
//                            }
//                        }
//                    }
//                }
//                break;
//            }
//            case SECTION5: {
//                for (int i = 3; i < 6; i++) {
//                    for (int j = 3; j < 6; j++) {
//                        if (SudokuBoard.getvalueOfSingleField(i, j) != -1) {
//                            filledFieldsList.add(SudokuBoard.getvalueOfSingleField(i, j));
//                        }
//                    }
//                }
//                for (int i = 3; i < 6; i++) {
//                    for (int j = 3; j < 6; j++) {
//                        if (SudokuBoard.getvalueOfSingleField(i, j) == -1) {
//                            for (int x = 0; x < filledFieldsList.size(); x++) {
//                                SudokuBoard.getSudokuBoard().get(i).getRow().get(j).getProbableNumbers().remove(filledFieldsList.get(x));
//                            }
//                        }
//                    }
//                }
//                break;
//            }
//            case SECTION6: {
//                for (int i = 3; i < 6; i++) {
//                    for (int j = 6; j < 9; j++) {
//                        if (SudokuBoard.getvalueOfSingleField(i, j) != -1) {
//                            filledFieldsList.add(SudokuBoard.getvalueOfSingleField(i, j));
//                        }
//                    }
//                }
//                for (int i = 3; i < 6; i++) {
//                    for (int j = 6; j < 9; j++) {
//                        if (SudokuBoard.getvalueOfSingleField(i, j) == -1) {
//                            for (int x = 0; x < filledFieldsList.size(); x++) {
//                                SudokuBoard.getSudokuBoard().get(i).getRow().get(j).getProbableNumbers().remove(filledFieldsList.get(x));
//                            }
//                        }
//                    }
//                }
//                break;
//            }
//            case SECTION7: {
//                for (int i = 6; i < 9; i++) {
//                    for (int j = 0; j < 3; j++) {
//                        if (SudokuBoard.getvalueOfSingleField(i, j) != -1) {
//                            filledFieldsList.add(SudokuBoard.getvalueOfSingleField(i, j));
//                        }
//                    }
//                }
//                for (int i = 6; i < 9; i++) {
//                    for (int j = 0; j < 3; j++) {
//                        if (SudokuBoard.getvalueOfSingleField(i, j) == -1) {
//                            for (int x = 0; x < filledFieldsList.size(); x++) {
//                                SudokuBoard.getSudokuBoard().get(i).getRow().get(j).getProbableNumbers().remove(filledFieldsList.get(x));
//                            }
//                        }
//                    }
//                }
//                break;
//            }
//            case SECTION8: {
//                for (int i = 6; i < 9; i++) {
//                    for (int j = 3; j < 6; j++) {
//                        if (SudokuBoard.getvalueOfSingleField(i, j) != -1) {
//                            filledFieldsList.add(SudokuBoard.getvalueOfSingleField(i, j));
//                        }
//                    }
//                }
//                for (int i = 6; i < 9; i++) {
//                    for (int j = 3; j < 6; j++) {
//                        if (SudokuBoard.getvalueOfSingleField(i, j) == -1) {
//                            for (int x = 0; x < filledFieldsList.size(); x++) {
//                                SudokuBoard.getSudokuBoard().get(i).getRow().get(j).getProbableNumbers().remove(filledFieldsList.get(x));
//                            }
//                        }
//                    }
//                }
//                break;
//            }
//            case SECTION9: {
//                for (int i = 6; i < 9; i++) {
//                    for (int j = 6; j < 9; j++) {
//                        if (SudokuBoard.getvalueOfSingleField(i, j) != -1) {
//                            filledFieldsList.add(SudokuBoard.getvalueOfSingleField(i, j));
//                        }
//                    }
//                }
//                for (int i = 6; i < 9; i++) {
//                    for (int j = 6; j < 9; j++) {
//                        if (SudokuBoard.getvalueOfSingleField(i, j) == -1) {
//                            for (int x = 0; x < filledFieldsList.size(); x++) {
//                                SudokuBoard.getSudokuBoard().get(i).getRow().get(j).getProbableNumbers().remove(filledFieldsList.get(x));
//                            }
//                        }
//                    }
//                }
//                break;
//            }
//        }
//        filledFieldsList.clear();
//        //return true;
//    }
//
//    public static List<Integer> getFilledFieldsList() {
//        return filledFieldsList;
//    }
//
//    public static List<Integer> getEmptyFieldsList() {
//        return emptyFieldsList;
//    }
//}
