package entities;

import entities.enums.CellType;

// To represent a cell of display board
public class Cell {
    // Atributes
    private final int row, col;
    private CellType cellType;

    // Constructor
    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
    }

    // Getters and setters
    public CellType getCellType() {
        return cellType;
    }

    public void setCellType(CellType cellType) {
        this.cellType = cellType;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}
