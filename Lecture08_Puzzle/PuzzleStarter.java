public class PuzzleStarter {

	public static void main(String[] args) {
		SlidePuzzleBoard puzzle = new SlidePuzzleBoard();
		PuzzleWriter writer = new PuzzleWriter(puzzle);
		new PuzzleController(puzzle,writer).play();
	}

}