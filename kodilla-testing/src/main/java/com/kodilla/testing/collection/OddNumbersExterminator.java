package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    private ArrayList<Integer> numbers = new ArrayList<Integer>();
    private ArrayList<Integer> evenNumber = new ArrayList<Integer>();

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {

        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.size() == 0){
                System.out.println("The arraylist is empty");
                return evenNumber;
            }
            if (numbers.get(i) % 2 == 0) {
                evenNumber.add(numbers.get(i));
            }
        }
        return evenNumber;
    }

    public Integer getEvenNumber(Integer i){
        return evenNumber.get(i);
    }

    public int getSize(){
        if(evenNumber.size() == 0){
            System.out.println("The arraylist is empty");
            return 0;
        }else {
            return evenNumber.size();
        }
    }
}
