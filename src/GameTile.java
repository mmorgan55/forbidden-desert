public class GameTile {

  private boolean isFlipped;

  private int sandCounter;

  public GameTile() {
    isFlipped = false;
    sandCounter = 0;
  }

  @Override
  public String toString() {
    if (isFlipped) {
      return "O" + sandCounter;
    } else {
      return "X" + sandCounter;
    }
  }

  protected void flipTile() {
    isFlipped = false;
  }

  public int getSandCounter() {
    return sandCounter;
  }

  public void setSandCounter(int sandCounter) {
    this.sandCounter = sandCounter;
  }


}
