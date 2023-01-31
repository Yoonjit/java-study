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
			
			String input = JOptionPane.showInputDialog("������ ���� ���� �̸��� �Է��ϼ�");
			int n = Integer.parseInt(input);
			
			if(! board.move(n)) {
				writer.showNoMove("�ȵ�");
			}
		}
		
	}
	
}