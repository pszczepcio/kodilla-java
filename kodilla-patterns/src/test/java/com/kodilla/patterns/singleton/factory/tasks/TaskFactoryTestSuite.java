package com.kodilla.patterns.singleton.factory.tasks;

import com.kodilla.patterns.factory.tasks.ShoppingTask;
import com.kodilla.patterns.factory.tasks.Task;
import com.kodilla.patterns.factory.tasks.TaskFactory;
import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testShoppingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPINGTASK);
        shoppingTask.executeTask();
        //Then
        Assert.assertEquals("Buy clothes" , shoppingTask.getTaskName());
        Assert.assertEquals(true , shoppingTask.isTaskExecuted());
    }

    @Test
    public void testPaintingTask(){
        //given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.makeTask(TaskFactory.PAINTINGTASK);
        paintingTask.executeTask();
        //Then
        Assert.assertEquals("Paint a elephant" , paintingTask.getTaskName());
        Assert.assertEquals(true , paintingTask.isTaskExecuted());
    }

    @Test
    public void testDrivingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.makeTask(TaskFactory.DRIVINGTASK);
        drivingTask.executeTask();
        //Then
        Assert.assertEquals("Transport wood" , drivingTask.getTaskName());
        Assert.assertEquals(false , drivingTask.isTaskExecuted());
    }
}
