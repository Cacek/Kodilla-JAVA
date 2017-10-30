package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
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

    @Test
    public void testTaskListDaoSave() {
        //Given
        TaskList taskList = new TaskList("TestList", "Lista Testowa");

        //When
        taskListDao.save(taskList);
        List<TaskList> readTasks = taskListDao.findByListName("TestList");

        //Then
        Assert.assertEquals(1, readTasks.size());
        int id = taskList.getId();

        //CleanUp
        taskListDao.delete(id);
    }


}
