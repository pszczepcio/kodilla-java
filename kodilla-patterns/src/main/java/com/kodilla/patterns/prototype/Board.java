package com.kodilla.patterns.prototype;

import java.util.HashSet;
import java.util.Set;

public class Board extends Prototype{
    private String name; // dla płytkiego kolonwania usuwam final
    private Set<TasksList> lists = new HashSet<>(); // dla głębokiego klonowania usuwam final

    public Board(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<TasksList> getLists() {
        return lists;
    }

    @Override
    public String toString() {
        String s = "Board [" + name + "]\n";
        for(TasksList list : lists) {
            s = s + list.toString() + "\n";
        }
        return s;
    }
//płytkie klonowanie
    public Board shallowCopy() throws CloneNotSupportedException{
        return (Board)super.clone();
    }

//    głębokie klonowanie
    public Board deepCopy() throws CloneNotSupportedException{
        Board cloneBoard = (Board)super.clone();
        cloneBoard.lists = new HashSet<>();
        for(TasksList theList : lists){
            TasksList clonedList = new TasksList(theList.getName());
            for(Task task : theList.getTasks()) {
                clonedList.getTasks().add(task);
            }
            cloneBoard.getLists().add(clonedList);
        }
        return cloneBoard;
    }
}
