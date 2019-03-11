package board.automaticgenerationOfBoard;

import Computer.Solve;
import InsertData.NumberDTO;
import board.StartingBoard;
import board.SudokuBoard;

import java.util.*;

public class AutomaticGenerationOfBoard extends Sections {
    private SectionData sectionData;
    private SectionData secData2;
    private SearchSection searchSection= new SearchSection();
    private SudokuBoard copyBoard;
    private Solve solve = new Solve();
    private SudokuBoard sudokuBoard = new SudokuBoard();
    private StartingBoard startingBoard = new StartingBoard(sudokuBoard);
    private int row;
    private int column;
    private int number;
    private NumberDTO numberDTO;
    private Set<NumberDTO> numberDTOSList = new HashSet<>();
    CreateCoordinates createCoordinates = new CreateCoordinates();
    private Random generator = new Random();

    public AutomaticGenerationOfBoard() {
        startingBoard.createSudokuBord();
    }

    public void creatListOfCoordinates(){
        numberDTOSList.clear();
        boolean fillList = false;
        //numberDTOSList.clear();
        while (!fillList){
            row = generator.nextInt(9);
            column = generator.nextInt(9);
            number = generator.nextInt(9)+1;
            numberDTOSList.add(new NumberDTO(row, column, number));
            if (numberDTOSList.size() == 200){
                fillList = true;
            }
        }
    }

    public boolean checkRow(int row, int number){
        int counterRow = 0;
        for(int i = 0 ; i < 9 ; i++){
            if(sudokuBoard.getSudokuBoard().get(row).getSudokuElementsInRow().get(i).getValue() == -1 ||
                    sudokuBoard.getvalueOfSingleField(row, i) != number){
                ++counterRow;
            }
        }
        if (counterRow == 9){
            return true;
        }
        return false;
    }

    public boolean checkColumn(int column , int number){
        int counterColumn = 0;
        for (int i = 0 ; i < 9 ; i++){
            if (sudokuBoard.getSudokuBoard().get(i).getSudokuElementsInRow().get(column).getValue() == -1 ||
                    sudokuBoard.getvalueOfSingleField(i, column) != number){
                ++counterColumn;
            }
        }
        if (counterColumn == 9){
            return true;
        }
        return false;
    }

    public boolean checkSections(int iStart, int jStart, int iEnd, int jEnd, int number){
        int counterSection = 0;
        for(int i = iStart ; i < iEnd ; i++){
            for (int j = jStart ; j < jEnd ; j++){
                if(sudokuBoard.getSudokuBoard().get(i).getSudokuElementsInRow().get(j).getValue() == -1 ||
                    sudokuBoard.getvalueOfSingleField(i,j) != number){
                    ++counterSection;
                }
            }
        }
        if (counterSection == 9){
            return true;
        }
        return false;
    }

    public boolean fillBoards() {
        boolean value = false;
        int counterField = 0;
        for (NumberDTO numbers : getNumberDTOSList()) {
            boolean row = checkRow(numbers.getRowNumber(), numbers.getNumber());
            boolean column = checkColumn(numbers.getColumnNumber(), numbers.getNumber());
            int section = searchSection.searchBlockNumber(numbers.getRowNumber(),numbers.getColumnNumber());
            secData2 = checkAllSections(section);

            boolean sectionValue = checkSections(secData2.getiStart(), secData2.getjStart(), secData2.getiEnd(), secData2.getjEnd(),numbers.getNumber());
            if (row && column && sectionValue) {
                sudokuBoard.setValueOfSingleField(numbers.getRowNumber(), numbers.getColumnNumber(), numbers.getNumber());
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0 ; j < 9; j++) {
                if (sudokuBoard.getvalueOfSingleField(i,j) != -1){
                    ++counterField;
                }
            }
        }
        if(counterField == 81) {
//            boolean fill = false;
//            while(!fill){
//                if( solve.solve(sudokuBoard)) {
//                    fill = true;
//                }
//            }
//
//             copyBoard = null;
//            try{
//                copyBoard = sudokuBoard.deepCopy();
//            }catch (CloneNotSupportedException e){
//                System.out.println(e);
//            }
////usuwanie elementów z rozwiazanego sudoku
//            createCoordinates.creatListOfCoordinates();
//            for(Coordinate list : createCoordinates.getListOfCoordinates()){
//                sudokuBoard.setValueOfSingleField(list.getRow(), list.getColumn(), -1);
//            }
//            value = true;
        }
            return value = true;

    }

    public SudokuBoard getCopyBoard() {
        return copyBoard;
    }

    public SudokuBoard getSudokuBoard() {
        return sudokuBoard;
    }

    public  SectionData checkAllSections(int sectionNumber){
        switch(sectionNumber){
            case SECTION1: {
                return sectionData = new SectionData(0,0,3,3);

            }
            case  SECTION2: {
                return sectionData = new SectionData(0,3,3,6);

            }
            case SECTION3: {
                return sectionData = new SectionData(0,6,3,9);

            }
            case SECTION4: {
                return sectionData = new SectionData(3,0,6,3);

            }
            case SECTION5: {
                return sectionData = new SectionData(3,3,6,6);

            }
            case SECTION6: {
                return sectionData = new SectionData(3,6,6,9);

            }
            case SECTION7: {
                return  sectionData = new SectionData(6,0,9,3);

            }
            case  SECTION8: {
                return sectionData = new SectionData(6,3,9,6);

            }
            case SECTION9: {
                return sectionData = new SectionData(6,6,9,9);
            }
        }
        return sectionData;
    }

    public Set<NumberDTO> getNumberDTOSList() {
        return numberDTOSList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AutomaticGenerationOfBoard)) return false;
        AutomaticGenerationOfBoard that = (AutomaticGenerationOfBoard) o;
        return Objects.equals(numberDTO, that.numberDTO);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberDTO);
    }
}
