package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task{

    private final String taskName;
    private final String whatToBuy;
    private final double quantity;
    final static String TASKTYPE = "Shopping Task - ";
    private static boolean isExecuted = true;

    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
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
