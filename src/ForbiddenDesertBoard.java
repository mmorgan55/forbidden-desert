import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ForbiddenDesertBoard {

  private static final int ROW_SIZE = 5;
  private static final int COLUMN_SIZE = 5;


  private List<BoardTile> board;
  private Storm storm;

  public ForbiddenDesertBoard() {
    board = new ArrayList<>();
    storm = new Storm(ROW_SIZE / 2, COLUMN_SIZE / 2);
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
    BoardTile stormPosition = board.stream()
        .filter(tile -> tile.getTile() instanceof Storm)
        .findFirst()
        .orElse(null);

    assert stormPosition != null;

    BoardTile nextTile = board.stream()
        .filter(tile -> tile.getROW() == stormPosition.getROW() + 1
            && tile.getCOLUMN() == stormPosition.getCOLUMN())
        .findFirst()
        .orElse(null);

    if (nextTile != null) {
      GameTile temp = nextTile.getTile();
      temp.setSandCounter(temp.getSandCounter() + 1);
      nextTile.setTile(storm);
      stormPosition.setTile(temp);
    }
  }

  private void moveStormUp() {
    BoardTile stormPosition = board.stream()
        .filter(tile -> tile.getTile() instanceof Storm)
        .findFirst()
        .orElse(null);

    assert stormPosition != null;

    BoardTile nextTile = board.stream()
        .filter(tile -> tile.getROW() == stormPosition.getROW() - 1
            && tile.getCOLUMN() == stormPosition.getCOLUMN())
        .findFirst()
        .orElse(null);

    if (nextTile != null) {
      GameTile temp = nextTile.getTile();
      temp.setSandCounter(temp.getSandCounter() + 1);
      nextTile.setTile(storm);
      stormPosition.setTile(temp);
    }

  }

  private void moveStormLeft() {
    BoardTile stormPosition = board.stream()
        .filter(tile -> tile.getTile() instanceof Storm)
        .findFirst()
        .orElse(null);

    assert stormPosition != null;

    BoardTile nextTile = board.stream()
        .filter(tile -> tile.getROW() == stormPosition.getROW()
            && tile.getCOLUMN() == stormPosition.getCOLUMN() - 1)
        .findFirst()
        .orElse(null);

    if (nextTile != null) {
      GameTile temp = nextTile.getTile();
      temp.setSandCounter(temp.getSandCounter() + 1);
      nextTile.setTile(storm);
      stormPosition.setTile(temp);
    }

  }

  private void moveStormRight() {
    BoardTile stormPosition = board.stream()
        .filter(tile -> tile.getTile() instanceof Storm)
        .findFirst()
        .orElse(null);

    assert stormPosition != null;

    BoardTile nextTile = board.stream()
        .filter(tile -> tile.getROW() == stormPosition.getROW()
            && tile.getCOLUMN() == stormPosition.getCOLUMN() + 1)
        .findFirst()
        .orElse(null);

    if (nextTile != null) {
      GameTile temp = nextTile.getTile();
      temp.setSandCounter(temp.getSandCounter() + 1);
      nextTile.setTile(storm);
      stormPosition.setTile(temp);
    }

  }

  public List<BoardTile> getBoard() {
    return board;
  }

  public void setBoard(List<BoardTile> board) {
    this.board = board;
  }
}
