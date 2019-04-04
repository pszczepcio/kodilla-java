package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer1 {
    private final String username;
    private int taskToCheck;

    public Mentor(String username) {
        this.username = username;
    }

    @Override
    public void update(StudentTask studentTask) {
        System.out.println("A new task on the " + studentTask.getName()+ " task list" + "\n" +
                "(Total tasks: " + studentTask.getStudentTaskList().size() + ")");
        taskToCheck++;
    }

    public String getUsername() {
        return username;
    }

    public int getTaskToCheck() {
        return taskToCheck;
    }
}
