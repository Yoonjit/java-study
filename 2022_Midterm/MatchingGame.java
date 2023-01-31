public class MatchingGame { // ¿Ï¼º

    public static void main(String[] args) {
        GameBoard board = new GameBoard();
        BoardWriter writer = new BoardWriter(board);
        Reader reader = new Reader();
        new GameController(board,writer,reader).play();
    }

}