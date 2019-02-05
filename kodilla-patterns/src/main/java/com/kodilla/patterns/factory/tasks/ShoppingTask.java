package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task{
    private String taskName;
    private String whatToBuy;
    private double quantity;
    private double quantityProductInShop = 100.0;
    private boolean taskStatus;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public void executeTask() {
        if(quantityProductInShop - quantity >= 0){
            taskStatus = true;
        }else if(quantityProductInShop - quantity < 0){
            taskStatus = false;
        }
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
