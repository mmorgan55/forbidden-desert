public class GameTile extends Tile {

  private boolean isFlipped;
  private int sandCounter;

  public GameTile() {
    this.isFlipped = START_FLIPPED;
    this.sandCounter = STARTING_SAND;
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

}
