package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;

    private static final String listName = "Test List";


    @Test
    public void testFindByListName() {

        //Given
        TaskList taskList = new TaskList(listName, "anything");
        taskListDao.save(taskList);
        String name = taskList.getListName();

        //When
        List<TaskList> readName = taskListDao.findByListName(name);

        //Then

        assertEquals(1, readName.size());

        //CleanUp
        int id = readName.get(0).getId();
        taskListDao.deleteById(id);

    }




}
