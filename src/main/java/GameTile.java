import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameTile {

  private boolean isFlipped;
  private int sandCounter;
  private Map<Integer, Player> playersOnTile;

  public GameTile() {
    playersOnTile = new HashMap<>();
    isFlipped = false;
    sandCounter = 0;
  }

  @Override
  public String toString() {
    if (isFlipped) {
      return "O" + sandCounter + playersOnTile.size();
    } else {
      return "X" + sandCounter + playersOnTile.size();
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

  public Map<Integer, Player> getPlayersOnTile() {
    return playersOnTile;
  }

  public void putPlayerInPlayerMap(Player player) {
    playersOnTile.put(player.getPlayerNumber(), player);
  }
  public Player getPlayerFromPlayerMap() {

    return null;
  }
}
