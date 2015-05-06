package com.zuir.sudokuclient.game;

/**
 * Representation of a Cell Group
 * This is a 3x3 group of cells
 */
public class CellGroup {

    private Cell[][] value;

    public CellGroup() {
        this.value = new Cell[3][3];
    }

    /**
     * Constructor based on grid of cells
     * Will fail poorly if not 3x3
     * @param cells
     */
    public CellGroup(Cell[][] cells) {
        if(cells != null) {
            this.value = cells.clone();
        }
    }

}
