package com.kodilla.stream.beautifier;

public class SmalltoBigAndBigToSmall {
    private static char[] arrayTable = new char[0];
    private static String small = "abcdefghijklłmnoprstuwxyz";
    private static String big = small.toUpperCase();

    private static char[] smallLetters = new char[0];
    private static char[] bigLetters = new char[0];

    private static String textAfterChange = "";

    public static String change(String text) {

        arrayTable = new char[text.length()];
        arrayTable = text.toCharArray();
        smallLetters = small.toCharArray();
        bigLetters = big.toCharArray();

        for(int i = 0 ; i < arrayTable.length ; i++){
            for(int j = 0 ; j < smallLetters.length ; j++){
                if(arrayTable[i] == smallLetters[j]){
                    textAfterChange += bigLetters[j];
                }else if(arrayTable[i] == bigLetters[j]){
                    textAfterChange += smallLetters[j];
                }
            }
        }
        return textAfterChange;
    }
}
