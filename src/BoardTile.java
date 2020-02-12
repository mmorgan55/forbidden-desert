public class BoardTile {

  private final int ROW;

  private final int COLUMN;

  private GameTile gameTile;

  public BoardTile(int row, int column) {
    ROW = row;
    COLUMN = column;
  }

  public GameTile getGameTile() {
    return gameTile;
  }

  public void setTile(GameTile tile) {
    this.gameTile = tile;
  }

  @Override
  public String toString() {
    return gameTile.toString();
  }

  public int getROW() {
    return ROW;
  }

  public int getCOLUMN() {
    return COLUMN;
  }
}
