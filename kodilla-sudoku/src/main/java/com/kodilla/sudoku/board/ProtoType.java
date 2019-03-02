package com.kodilla.sudoku.board;

public class ProtoType<T> implements Cloneable {
    @Override
    public T clone() throws CloneNotSupportedException {
        return (T)super.clone();
    }
}
