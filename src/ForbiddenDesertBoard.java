import java.util.ArrayList;
import java.util.List;

public class ForbiddenDesertBoard {
  private static final int ROW_SIZE = 5;
  private static final int COLUMN_SIZE = 5;

  private List<BoardTile> board;

  public ForbiddenDesertBoard() {
    board = new ArrayList<>();
    makeBoard();
    printBoard(board);
  }

  private void makeBoard() {
    for (int i = 0; i < ROW_SIZE; i++) {
      for (int j = 0; j < COLUMN_SIZE; j++) {
        board.add(new BoardTile(i, j));
        board.get(board.size() - 1).setTile(new GameTile());
      }
    }
  }

  private void printBoard(List<BoardTile> board) {
    int counter = 0;
    for (BoardTile tile : board) {
      System.out.print(tile + " ");
      counter++;
      if (counter % 5 == 0) {
        System.out.println();
      }
    }
  }
}
