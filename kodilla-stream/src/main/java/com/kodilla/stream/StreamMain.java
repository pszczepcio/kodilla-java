package com.kodilla.stream;

import com.kodilla.stream.lambda.*;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.StaticPoemBeautifier;
import com.kodilla.stream.beautifier.CenterOfExpression;
import com.kodilla.stream.beautifier.SmalltoBigAndBigToSmall;


public class StreamMain {
    public static void main(String[] args) {
    /*    System.out.println("Wellcome to module 7 - Stream");

        Processor processor = new Processor();
        Executor codeToExecute = () -> System.out.println("This is an example text.");
        processor.execute(codeToExecute);


        //MathExpression
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(10,5,((a, b) -> a + b));
        expressionExecutor.executeExpression(10,5,((a, b) -> a - b));
        expressionExecutor.executeExpression(10,5,((a, b) -> a * b));
        expressionExecutor.executeExpression(10,5,((a, b) -> a / b));


        //lambda statyczna
        ExpressionExecutor expressionExecutor1 = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor1.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor1.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor1.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor1.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor1.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor1.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor1.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor1.executeExpression(3, 4, FunctionalCalculator::divideAByB);
*/

        //PoemBeautifier
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Piotrek", text -> text + "aaa");
        poemBeautifier.beautify("pies", text -> text.toUpperCase());
        poemBeautifier.beautify("kot",StaticPoemBeautifier::AddtoStartAndToEnd);
        poemBeautifier.beautify("Auto", CenterOfExpression::AddWordInCenter);
        poemBeautifier.beautify("AbCdEfGhIjKlMnOPrStuWxYz",SmalltoBigAndBigToSmall::change);

    }
}
