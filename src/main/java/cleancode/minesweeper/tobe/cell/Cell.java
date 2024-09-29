package cleancode.minesweeper.tobe.cell;

public interface Cell {

    String FLAG_SIGN = "⚑";
    String UNCHECKED_SIGN = "□";

    String getSign();

    boolean isLandMine();

    boolean hasLandMineCount();

    void open();
    void flag();


    boolean isChecked();

    boolean isOpened();

}
