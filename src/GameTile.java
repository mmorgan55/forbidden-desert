import java.util.ArrayList;
import java.util.List;

public class GameTile {

  private boolean isFlipped;
  private int sandCounter;
  private List<Player> playersOnTile;

  public GameTile() {
    playersOnTile = new ArrayList<>();
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
    isFlipped = true;
  }

  public int getSandCounter() {
    return sandCounter;
  }

  public void setSandCounter(int sandCounter) {
    this.sandCounter = sandCounter;
  }

  public List<Player> getPlayersOnTile() {
    return playersOnTile;
  }

  public Player getPlayerFromList() {
    
    return null;
  }
}
