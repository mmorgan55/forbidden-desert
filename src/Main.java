public class Main {

  public static void main(String[] args) {
    ForbiddenDesertBoard board = new ForbiddenDesertBoard();
    board.makeBoard();
    board.printBoard();
    board.moveStorm(3, "U");
    board.moveStorm(3, "R");
    board.moveStorm(4, "L");
    board.moveStorm(1, "D");
    board.printBoard();
  }
}
