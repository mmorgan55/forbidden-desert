public abstract class Tile {
  static final boolean START_FLIPPED = false;
  static final int STARTING_SAND = 0;

  abstract void flipTile();

  protected int addSand() {
    return 1;
  }

  protected int removeSand() {
    return -1;
  }
}
