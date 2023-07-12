public class GameController { // 미완성
    
    private GameBoard board;
    private BoardWriter writer;
    private Reader reader;
    
    public GameController(GameBoard b, BoardWriter w, Reader r) {
        board = b;
        writer = w;
        reader = r;
    }
    
    public void play() {
        Cell[][] square = board.square();
        // to be filled...
        if(board.point() < 16) {
        	square
        }
        
    }
    
    /** delay - how_long millisecond 동안 실행 정지  */
    private void delay(int how_long) { 
        try { Thread.sleep(how_long); }
        catch (InterruptedException e) { }
    }

}