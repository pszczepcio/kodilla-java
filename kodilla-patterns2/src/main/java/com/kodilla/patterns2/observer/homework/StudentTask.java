package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class StudentTask implements Observable1 {
    private final List<Observer1> observers;
    private final ArrayDeque<String> studentTaskList;
    private final String name;

    public StudentTask(String name) {
        studentTaskList = new ArrayDeque<String>();
        observers = new ArrayList<>();
        this.name = name;
    }

    public void addTask(String task){
        studentTaskList.offer(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer1 observer) {
        observers.add(observer);

    }

    @Override
    public void notifyObservers() {
        for (Observer1 observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer1 observer) {
        observers.remove(observer);
    }

    public ArrayDeque<String> getStudentTaskList() {
        return studentTaskList;
    }

    public String getName() {
        return name;
    }
}
