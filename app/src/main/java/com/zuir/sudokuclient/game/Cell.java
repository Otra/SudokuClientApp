package com.zuir.sudokuclient.game;

/**
 * Representation of an individual sudoku cell
 * This means this is a single digit within the board
 * Should not contain any information about whether it is editable or not
 * That should be handled at a higher level
 */
public class Cell {
    private int value;

    public Cell() {
        this.value = -1;
    }

    public Cell(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
