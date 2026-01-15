package logic.unit;

public class FlyingUnit extends BaseUnit{
    public FlyingUnit(int startColumn, int startRow, boolean isWhite, String name) {
        super(startColumn, startRow, isWhite, name);
        setHp(2);
        isFlying = true;
    }

    public boolean move(int direction) {
        if(direction == 0) {
            if(getRow() + 2 <= 4) {
                setRow(getRow() + 2);
                return true;
            }
        }else if(direction == 1) {
            if(getColumn() + 2 <= 4) {
                setColumn(getColumn() + 2);
                return true;
            }
        }else if(direction == 2) {
            if(getRow() - 2 >= 0) {
                setRow(getRow() - 2);
                return true;
            }
        }else if(direction == 3) {
            if(getColumn() - 2 >= 0) {
                setColumn(getColumn() - 2);
                return true;
            }
        }
        return false;
    }
}
