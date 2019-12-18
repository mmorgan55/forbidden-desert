public class BoardTile {

  private final int ROW;
  private final int COLUMN;

  private GameTile tile;

  public BoardTile(int row, int column) {
    ROW = row;
    COLUMN = column;
  }

  public GameTile getTile() {
    return tile;
  }

  public void setTile(GameTile tile) {
    this.tile = tile;
  }
  

}
