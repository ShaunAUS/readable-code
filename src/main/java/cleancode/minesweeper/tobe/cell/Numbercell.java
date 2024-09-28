package cleancode.minesweeper.tobe.cell;

public class Numbercell extends Cell {
    private int nearbyLandMineCount;

    @Override
    public String getSign() {
        if(isOpened){
            return String.valueOf(nearbyLandMineCount);
        }
        if(isFlagged){
            return FLAG_SIGN;
        }
        return UNCHECKED_SIGN;

    }
    public Numbercell(int nearbyLandMineCount) {
        this.nearbyLandMineCount = nearbyLandMineCount;
    }


    @Override
    public boolean isLandMine() {
        return false;
    }

    @Override
    public boolean hasLandMineCount() {
        return true;
    }
}
