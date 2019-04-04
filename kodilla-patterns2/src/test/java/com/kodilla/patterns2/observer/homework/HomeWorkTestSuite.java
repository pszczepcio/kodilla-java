package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class HomeWorkTestSuite {
    @Test
    public void registerTask(){
        //Given
        StudentTask student1ListTask = new StudentTaskList1();
        StudentTask student2ListTask = new StudentTaskList2();
        StudentTask student3ListTask = new StudentTaskList3();

        Mentor mentor1 = new Mentor("mentor1");
        Mentor mentor2 = new Mentor("mentor2");

        student1ListTask.registerObserver(mentor1);
        student2ListTask.registerObserver(mentor2);
        student3ListTask.registerObserver(mentor1);

        //When
        student1ListTask.addTask("Task with ArrayList");
        student2ListTask.addTask("Learn loop 'for'");
        student3ListTask.addTask("First task with Java");
        student1ListTask.addTask("Task from loop while");
        student1ListTask.addTask("Task from loop forEach");
        student2ListTask.addTask("Hashmap");
        //then

        Assert.assertEquals(4, mentor1.getTaskToCheck());
        Assert.assertEquals(2, mentor2.getTaskToCheck());

        student1ListTask.removeObserver(mentor1);
        student1ListTask.addTask("Task from 'Switch' ");
        Assert.assertEquals(4,mentor1.getTaskToCheck());
    }
}
