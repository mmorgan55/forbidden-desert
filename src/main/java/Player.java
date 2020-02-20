public class Player {

  private final int playerNumber;
  private final int maxWaterAmount;

  private int waterCounter;

  private int row;
  private int column;

  public Player(int playerNumber, int startRow, int startColumn) {
    this.playerNumber = playerNumber;
    maxWaterAmount = 5;
    row = startRow;
    column = startColumn;
  }

  public int getPlayerNumber() {
    return playerNumber;
  }

  public int getMaxWaterAmount() {
    return maxWaterAmount;
  }

  public int getRow() {
    return row;
  }

  public void setRow(int row) {
    this.row = row;
  }

  public int getColumn() {
    return column;
  }

  public void setColumn(int column) {
    this.column = column;
  }
}
