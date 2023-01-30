package entities;

import entities.enums.CellType;

import java.util.LinkedList;


// To represent a snake
public class Snake {
    // Atributes
    private LinkedList<Cell> snakePartList = new LinkedList<>();
    private Cell head;

    // Constructors
    public Snake(Cell initPos) {
        head = initPos;
        snakePartList.add(head);
        head.setCellType(CellType.SNAKE_NODE);
    }

    // Methods
    public void grow() {
        snakePartList.add(head);
    }

    public void move(Cell nextCell) {
        System.out.println("Snake is moving to "
                + nextCell.getRow()
                + " " + nextCell.getCol());
        Cell tail = snakePartList.removeLast();
        tail.setCellType(CellType.EMPTY);
    }

    public boolean checkCrash(Cell nextCell) {
        System.out.println("Going to check for Crash");
        for (Cell cell : snakePartList) {
            if (cell == nextCell) {
                return true;
            }
        }
        return false;
    }


    // Getters and setters

    public LinkedList<Cell> getSnakePartList() {
        return snakePartList;
    }
    public void setSnakePartList(LinkedList<Cell> snakePartList) {
        this.snakePartList = snakePartList;
    }
    public Cell getHead() {
        return head;
    }
    public void setHead(Cell head) {
        this.head = head;
    }


}
