package cleancode.minesweeper.tobe.cell;

public class CellState {

    protected boolean isFlagged;
    protected boolean isOpened;

    public CellState(boolean isFlagged, boolean isOpened) {
        this.isFlagged = isFlagged;
        this.isOpened = isOpened;
    }

    public static CellState initialize() {
        return new CellState(true, false);
    }

    public void flag() {
        this.isFlagged = true;
    }

    public boolean isChecked() {
        return isFlagged || isOpened;
    }


    public void open() {
        this.isOpened = true;
    }

    public boolean isOpened() {
        return isOpened;
    }

}
