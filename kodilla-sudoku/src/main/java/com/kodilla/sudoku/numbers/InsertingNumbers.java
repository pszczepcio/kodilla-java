//package com.kodilla.sudoku.numbers;
//
//
//
//import com.kodilla.sudoku.computer.ComputerGame;
//
//import java.util.Scanner;
//
//public class InsertingNumbers {
//    private Scanner scanner = new Scanner(System.in);
//    private final static String SUDOKU = "sudoku";
//    private ComputerGame computerGame = new ComputerGame();
//    private String word;
//    private int columnNumber ;
//    private int rowNumber ;
//    private int number ;
//
//    private void insertColumnNumber(){
//        while (!scanner.hasNextInt()){
//            word = scanner.next();
//            checkWordSudoku(word);
//        }
//        columnNumber = scanner.nextInt()-1;
//        //System.out.println(columnNumber);
//    }
//
//    private void insertRowNumber(){
//        while(!scanner.hasNextInt()){
//            scanner.next();
//            word = scanner.next();
//            checkWordSudoku(word);
//        }
//        rowNumber = scanner.nextInt()-1;
//        //System.out.println(rowNumber);
//
//    }
//
//    private void insertNumber(){
//        while(!scanner.hasNextInt()){
//           scanner.next();
//           word = scanner.next();
//           checkWordSudoku(word);
//        }
//        int number1 = scanner.nextInt();
//        if(1 <= number1 && number1 <= 9){
//            number = number1;
//        }
//    }
//
////    public void checkingInsertNumbers(){
////        System.out.print("Please insert the column number :");
////        insertColumnNumber();
////        System.out.print("Please insert the row number :");
////        insertRowNumber();
////        System.out.print("Please enter a number from 1 to 9 :");
////        insertNumber();
////     }
////
////     private void checkWordSudoku(String word){
////         if(word.equals(SUDOKU)){
////             computerGame.sudokuSolution();
////             return;
////         }
////             System.out.println("You entered a letter instead of a number or you entered a letter. Please enter the correct number.");
////     }
////
////    public int getColumnNumber() {
////        return columnNumber;
////    }
////
////    public int getRowNumber() {
////        return rowNumber;
////    }
////
////    public int getNumber() {
////        return number;
////    }
////
////    public NumbersDto getNumbersDto() {
////        return new NumbersDto(getRowNumber(), getColumnNumber(), getNumber());
////    }
//}
