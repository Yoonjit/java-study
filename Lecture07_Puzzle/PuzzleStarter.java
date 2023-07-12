public class PuzzleStarter {
	
	static void main(String[] args) {
		SlidePuzzleBoard b = new SlidePuzzleBoard();
		PuzzleWriter w = new PuzzleWriter(b, 30);
		new PuzzleController(b, w).play();
	}
	
}