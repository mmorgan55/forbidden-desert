public class Main {

  public static void main(String[] args) {
    ForbiddenDesertBoard board = new ForbiddenDesertBoard();
    board.makeBoard();
    board.createPlayers();
    board.printBoard();
    board.moveStorm(1, "D");
    board.flipTile(2, 2);
    board.printBoard();
  }
}
