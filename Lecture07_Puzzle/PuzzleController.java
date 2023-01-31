import javax.swing.JOptionPane;

public class PuzzleController {

	private SlidePuzzleBoard board;
	private PuzzleWriter writer;
	
	public PuzzleController(SlidePuzzleBoard b, PuzzleWriter w) {
		
		board = b;
		writer = w;
		
	}
	
	public void play() {
		
		while(true) {
			writer.displayPuzzleBoard();
			
			String input = JOptionPane.showInputDialog("움직일 퍼즐 조각 이름을 입력하셈");
			int n = Integer.parseInt(input);
			
			if(! board.move(n)) {
				writer.showNoMove("안돼");
			}
		}
		
	}
	
}