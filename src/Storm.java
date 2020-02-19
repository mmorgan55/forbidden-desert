public class Storm extends GameTile {

  private int stormRow;
  private int stormColumn;

  public Storm(int stormRow, int stormColumn) {
    this.stormRow = stormRow;
    this.stormColumn = stormColumn;
  }

  @Override
  public String toString() {
    return "STR";
  }

  public int getStormRow() {
    return stormRow;
  }

  public void setStormRow(int stormRow) {
    this.stormRow = stormRow;
  }

  public int getStormColumn() {
    return stormColumn;
  }

  public void setStormColumn(int stormColumn) {
    this.stormColumn = stormColumn;
  }
}
