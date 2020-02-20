import java.util.ArrayList;
import java.util.List;

public class ForbiddenDesertBoard {

  private static final int ROW_SIZE = 5;
  private static final int COLUMN_SIZE = 5;


  private List<BoardTile> board;
  private List<Player> players;
  private Storm storm;

  public ForbiddenDesertBoard() {
    board = new ArrayList<>();
    storm = new Storm(ROW_SIZE / 2, COLUMN_SIZE / 2);
    players = new ArrayList<>();
  }

  public void createPlayers() {
    for (int i = 0; i < 2; i++) {
      players.add(new Player(i, i, 0));
    }

    for (Player player : players) {
      placePlayer(player);
    }
  }

  private void placePlayer(Player player) {
    BoardTile playerTile = findBoardTile(player.getRow(), player.getColumn());
    playerTile.getGameTile().putPlayerInPlayerMap(player);
  }

  public void makeBoard() {
    for (int i = 0; i < ROW_SIZE; i++) {
      for (int j = 0; j < COLUMN_SIZE; j++) {

        board.add(new BoardTile(i, j));
        if (i == 2 && j == 2) {
          board.get(board.size() - 1).setTile(storm);
          continue;
        }
        board.get(board.size() - 1).setTile(new GameTile());
      }
    }
  }

  public void printBoard() {
    int counter = 0;
    for (BoardTile tile : board) {
      System.out.print(tile + " ");
      counter++;
      if (counter % 5 == 0) {
        System.out.println();
      }
    }
    System.out.println();
  }

  public void moveStorm(int spacesMoved, String direction) {
    for (int i = 0; i < spacesMoved; i++) {
      switch (direction) {
        case "U":
          moveStormUp();
          break;
        case "D":
          moveStormDown();
          break;
        case "R":
          moveStormRight();
          break;
        case "L":
          moveStormLeft();
          break;
      }
    }
  }

  private void moveStormDown() {
    BoardTile stormPosition = findStormPosition();
    BoardTile nextTile = findBoardTile(stormPosition.getROW() + 1, stormPosition.getCOLUMN());

    if (nextTile != null) {
      GameTile temp = nextTile.getGameTile();
      temp.setSandCounter(temp.getSandCounter() + 1);
      nextTile.setTile(storm);
      stormPosition.setTile(temp);
    }
  }

  private void moveStormUp() {
    BoardTile stormPosition = findStormPosition();
    BoardTile nextTile = findBoardTile(stormPosition.getROW() - 1, stormPosition.getCOLUMN());

    if (nextTile != null) {
      GameTile temp = nextTile.getGameTile();
      temp.setSandCounter(temp.getSandCounter() + 1);
      nextTile.setTile(storm);
      stormPosition.setTile(temp);
    }
  }

  private void moveStormLeft() {
    BoardTile stormPosition = findStormPosition();
    BoardTile nextTile = findBoardTile(stormPosition.getROW(), stormPosition.getCOLUMN() - 1);

    if (nextTile != null) {
      GameTile temp = nextTile.getGameTile();
      temp.setSandCounter(temp.getSandCounter() + 1);
      nextTile.setTile(storm);
      stormPosition.setTile(temp);
    }
  }

  private void moveStormRight() {
    BoardTile stormPosition = findStormPosition();
    BoardTile nextTile = findBoardTile(stormPosition.getROW(), stormPosition.getCOLUMN() + 1);

    if (nextTile != null) {
      GameTile temp = nextTile.getGameTile();
      temp.setSandCounter(temp.getSandCounter() + 1);
      nextTile.setTile(storm);
      stormPosition.setTile(temp);
    }
  }

  public void flipTile(int row, int column) {
    BoardTile boardTile = findBoardTile(row, column);

    if (boardTile.getGameTile().getSandCounter() == 0 && !(boardTile
        .getGameTile() instanceof Storm)) {
      boardTile.getGameTile().flipTile();
    }
  }

  private BoardTile findBoardTile(int row, int column) {
    return board.stream()
        .filter(tile -> tile.getROW() == row && tile.getCOLUMN() == column)
        .findFirst()
        .orElse(null);
  }

  private BoardTile findStormPosition() {
    return board.stream()
        .filter(tile -> tile.getGameTile() instanceof Storm)
        .findFirst()
        .orElse(null);
  }

  public List<BoardTile> getBoard() {
    return board;
  }

  public void setBoard(List<BoardTile> board) {
    this.board = board;
  }
}
