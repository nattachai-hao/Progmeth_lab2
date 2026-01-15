package logic.unit;

import java.util.ArrayList;

public class RangeUnit extends BaseUnit{
    public RangeUnit(int startColumn, int startRow, boolean isWhite, String name) {
        super(startColumn, startRow, isWhite, name);
        setHp(2);
    }

    public void attack(ArrayList<BaseUnit> targetPieces) {
        for(int i = 0; i < targetPieces.size(); i++) {
            if(isWhite()) {
                if(targetPieces.get(i).getRow() - 1 == this.getRow() && targetPieces.get(i).getColumn() == this.getColumn()) {
                    System.out.println(this.getName() + " attacks " + targetPieces.get(i).getName());
                    targetPieces.get(i).setHp(targetPieces.get(i).getHp() - this.getPower());
                }
            }else {
                if(targetPieces.get(i).getRow() + 1 == this.getRow() && targetPieces.get(i).getColumn() == this.getColumn()) {
                    System.out.println(this.getName() + " attacks " + targetPieces.get(i).getName());
                    targetPieces.get(i).setHp(targetPieces.get(i).getHp() - this.getPower());
                }
            }
        }
    }
}
