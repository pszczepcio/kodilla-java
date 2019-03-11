package board.automaticgenerationOfBoard;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class CreateCoordinates {
    private Set<Coordinate> listOfCoordinates = new HashSet<>();
    private Random generator = new Random();
    private int row;
    private int column;

    public Set<Coordinate> creatListOfCoordinates(){
        boolean listIsFull = false;
        while (!listIsFull) {
            row = generator.nextInt(9);
            column = generator.nextInt(9);
            listOfCoordinates.add(new Coordinate(row, column));
            if(listOfCoordinates.size() == 46){
                listIsFull = true;
            }
        }
        return listOfCoordinates;
    }

    public void printList(){
        int a = 0;
        for (Coordinate list: getListOfCoordinates()){
            ++a;
            System.out.println(a+": " + list.getRow() +", "+ list.getColumn());
        }
    }

    public Set<Coordinate> getListOfCoordinates() {
        return listOfCoordinates;
    }
}
