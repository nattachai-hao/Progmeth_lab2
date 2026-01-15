package logic.unit;

import java.util.ArrayList;

public class BaseUnit {
    private int row;
    private int column;
    private boolean isWhite;
    private String name;
    protected int hp;
    protected int power;
    protected boolean isFlying;

    public BaseUnit(int startColumn, int startRow, boolean isWhite, String name) {
        this.power = 1;
        this.isFlying = false;
        setHp(2);
        setColumn(startColumn);
        setRow(startRow);
        setWhite(isWhite);
        setName(name);
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getPower() {
        return power;
    }

    public boolean isFlying() {
        return isFlying;
    }

    public void setRow(int row) {
        if(row < 0) {
            this.row = 0;
        }else if(row <= 4) {
            this.row = row;
        }else {
            this.row = 4;
        }
    }

    public void setColumn(int column) {
        if(column < 0) {
            this.column = 0;
        }else if(column <= 4) {
            this.column = column;
        }else {
            this.column = 4;
        }
    }

    public void setWhite(boolean white) {
        isWhite = white;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public boolean move(int direction) {
        if(direction == 0) {
            if(row + 1 <= 4) {
                setRow(row + 1);
                return true;
            }
        }else if(direction == 1) {
            if(column + 1 <= 4) {
                setColumn(column + 1);
                return true;
            }
        }else if(direction == 2) {
            if(row - 1 >= 0) {
                setRow(row - 1);
                return true;
            }
        }else if(direction == 3) {
            if(column - 1 >= 0) {
                setColumn(column - 1);
                return true;
            }
        }
        return false;
    }

    public void attack(ArrayList<BaseUnit> targetPieces) {
        for(int i = 0; i < targetPieces.size(); i++) {
            if(!targetPieces.get(i).isFlying) {
                if((targetPieces.get(i).getRow() == getRow()) && (targetPieces.get(i).getColumn() == getColumn())) {
                    System.out.println(this.getName() + " attacks " + targetPieces.get(i).getName());
                    targetPieces.get(i).setHp(targetPieces.get(i).getHp() - getPower());
                }
            }
        }
    }
}
