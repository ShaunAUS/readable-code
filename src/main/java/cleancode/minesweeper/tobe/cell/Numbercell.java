package cleancode.minesweeper.tobe.cell;

public class Numbercell implements Cell {
    private int nearbyLandMineCount;
    private final CellState cellState = CellState.initialize();


    @Override
    public String getSign() {
        if(cellState.isOpened()){
            return String.valueOf(nearbyLandMineCount);
        }
        if(cellState.isFlagged){
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


    @Override
    public void open() {
        cellState.open();
    }

    @Override
    public void flag() {
        cellState.flag();
    }

    @Override
    public boolean isChecked() {
        return cellState.isChecked();
    }

    @Override
    public boolean isOpened() {
        return cellState.isOpened();
    }

}
