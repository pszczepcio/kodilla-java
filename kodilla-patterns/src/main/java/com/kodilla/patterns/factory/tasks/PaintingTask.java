package com.kodilla.patterns.factory.tasks;

import java.util.Random;

public class PaintingTask implements Task {
    private String taskName;
    private String color;
    private String whatToPaint;
    private boolean taskStatus;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
            taskStatus = true;
    }

    @Override
    public String getTaskName() {
        return this.taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return taskStatus;
    }
}
