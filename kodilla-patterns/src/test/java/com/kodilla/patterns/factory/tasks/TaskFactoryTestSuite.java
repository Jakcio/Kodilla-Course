package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskFactoryTestSuite {

    @Test
    void testDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task driving = taskFactory.makeTask(TaskFactory.DRIVING);
        driving.executeTask();
        //Then
        assertEquals("Morning ride", driving.getTaskName());
        assertEquals(false, driving.isTaskExecuted());
    }
    @Test
    void testPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task painting = taskFactory.makeTask(TaskFactory.PAINTING);
        painting.executeTask();

        //Then
        assertEquals("Afternoon painting", painting.getTaskName());
        assertEquals(true, painting.isTaskExecuted());
    }

    @Test
    void testShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shopping = taskFactory.makeTask(TaskFactory.SHOPPING);
        shopping.executeTask();
        //Then
        assertEquals("Night shopping", shopping.getTaskName());
        assertEquals(true, shopping.isTaskExecuted());
    }



}
