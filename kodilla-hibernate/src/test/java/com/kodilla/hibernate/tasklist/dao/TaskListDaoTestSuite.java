package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import com.sun.xml.internal.org.jvnet.mimepull.CleanUpExecutorFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "Hibernate";

    @Test
    public void testFindByListName() {
        //given
        TaskList taskList = new TaskList("Learn java", DESCRIPTION);
        taskListDao.save(taskList);
        int id = taskList.getId();
        System.out.println(id);
        String listName = taskList.getListName();

        //When
        List<TaskList> readTaskList = taskListDao.findByListName(listName);
        System.out.println("readTasklisr size:" + readTaskList.size());
        //Then
        Assert.assertEquals(1,readTaskList.size());

        //        CleanUp
        taskListDao.delete(id);
    }

}
