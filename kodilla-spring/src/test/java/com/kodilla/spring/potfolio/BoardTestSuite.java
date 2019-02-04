package com.kodilla.spring.potfolio;


import com.kodilla.spring.portfolio.Board;
import com.kodilla.spring.portfolio.BoardConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Autowired
    private Board board;

    @Test
    public void testTaskAdd() {
//        //Given
//        board.getToDoList().getTasks().add("New Task");
//        board.getInProgressList().getTasks().add("Task in progress");
//        board.getDoneList().getTasks().add("Task done");
//        //Then
//        Assert.assertEquals("New Task" , board.getToDoList().getTasks().get(0));
//        Assert.assertEquals("Task in progress" , board.getInProgressList().getTasks().get(0));
//        Assert.assertEquals("Task done" , board.getDoneList().getTasks().get(0));
//
//        System.out.println(board.getToDoList().getTasks().get(0));
//        System.out.println(board.getInProgressList().getTasks().get(0));
//        System.out.println(board.getDoneList().getTasks().get(0));


        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().getTasks().add("zadanie do wykonania");
        board.getInProgressList().getTasks().add("zadanie w trakcie wyknania");
        board.getDoneList().getTasks().add("zadanie wykonane");
        //Then
        Assert.assertEquals("zadanie do wykonania" , board.getToDoList().getTasks().get(0));
        Assert.assertEquals("zadanie w trakcie wyknania" , board.getInProgressList().getTasks().get(0));
        Assert.assertEquals("zadanie wykonane" , board.getDoneList().getTasks().get(0));

        System.out.println(board.getToDoList().getTasks().get(0));
        System.out.println(board.getInProgressList().getTasks().get(0));
        System.out.println(board.getDoneList().getTasks().get(0));

    }
}
