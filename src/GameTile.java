public class GameTile extends Tile {

  private boolean isFlipped;
  private int sandCounter;
  private int row;
  private int column;

  public GameTile(int row, int column) {
    this.isFlipped = START_FLIPPED;
    this.sandCounter = STARTING_SAND;
    this.row = row;
    this.column = column;
  }

  @Override
  public String toString() {
    if (isFlipped) {
      return "O" + sandCounter;
    } else {
      return "X" + sandCounter;
    }
  }

  @Override
  void flipTile() {
    isFlipped = true;
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
