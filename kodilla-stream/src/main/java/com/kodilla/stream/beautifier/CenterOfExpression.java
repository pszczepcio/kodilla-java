package com.kodilla.stream.beautifier;

public class CenterOfExpression {
    public static String AddWordInCenter(String text){
        String result = "";
        String result1 = "" ;
        String resultEnd;
        String permanentText = "jajo";
        char[] stringWord = new char[text.length()];
        stringWord = text.toCharArray();
        if(stringWord.length % 2 == 0 ) {
            for (int i = 0; i < (stringWord.length/2); i++) {
                    result += stringWord[i];
                }
                for(int j = stringWord.length/2 ; j < stringWord.length ; j++){
                    result1 += stringWord[j];
                }
        }else{
                for (int i = 0; i < (stringWord.length - 1) / 2; i++) {
                        result += stringWord[i];
                    }
                    for(int j = (stringWord.length-1)/2 ; j < stringWord.length ; j++){
                        result1 += stringWord[j];
                    }
                }
        return result + permanentText + result1;
    }
}
