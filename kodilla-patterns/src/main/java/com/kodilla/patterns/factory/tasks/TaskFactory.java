package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";

    public final Task makeTask(final String taskClass){
            switch(taskClass){
                case SHOPPINGTASK:
                    return new ShoppingTask("Buy clothes" , "t-shirt" , 3.0);
                case PAINTINGTASK:
                    return  new PaintingTask("Paint a elephant" , "grey" , "elephant");
                case DRIVINGTASK:
                    return new DrivingTask("Transport wood","Rzeszow" , "Tractor");
                default:
                    return null;
        }
    }
}
