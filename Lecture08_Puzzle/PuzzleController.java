import javax.swing.JOptionPane;

public class PuzzleController {

	private SlidePuzzleBoardInterface puzzle;
	private PuzzleWriterInterface writer;

	public PuzzleController(SlidePuzzleBoardInterface p, PuzzleWriterInterface w) {
		puzzle = p;
		writer = w;
	}

	public void play() {
		while (true) {
			writer.displayPuzzleBoard();
			String input = JOptionPane.showInputDialog("Your move:");
			int n = Integer.parseInt(input);
			if (! puzzle.move(n))
				writer.showNoMove("Cannot move.");				
		}
	}

}