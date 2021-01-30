package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task{

    private final String taskName;
    private final String color;
    private final String whatToPaint;
    private static boolean isExecuted = true;
    final static String TASKTYPE = "Painting Task - ";

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
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
        if (isExecuted == true) {
            return true;
        } else {
            return false;
        }
    }
}
