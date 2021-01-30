package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task{

    private final String taskName;
    private final String where;
    private final String using;
    final static String TASKTYPE = "Driving Task - ";
    private static boolean isExecuted = false;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }


    @Override
    public void executeTask() {

        if(isExecuted == false){
            System.out.println(TASKTYPE + " Task: " + taskName+ " not executed");
        } else {
            System.out.println(TASKTYPE + " Task: " + taskName+ " executed");
        }

    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if(isExecuted == true) {
            return true;
        } else {
            return false;
        }
    }
}
