package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String DRIVING = "DRIVING_TASK";
    public static final String PAINTING = "PAINTING_TASK";
    public static final String SHOPPING = "SHOPPING_TASK";

    public final Task makeTask(final String taskType) {
        switch(taskType) {
            case DRIVING:
                return new DrivingTask("Morning ride", "Drive to school", " Audi");
            case PAINTING:
                return new PaintingTask("Afternoon painting", "Blue", "Sea");
            case SHOPPING:
                return new ShoppingTask("Night shopping", "Bread and milk", 2);

            default:
                return null;
        }
    }

}
