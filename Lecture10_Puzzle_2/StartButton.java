import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class StartButton extends JButton implements ActionListener{

	private SlidePuzzleBoard board;
	private PuzzleFrame frame;
	
	public StartButton(SlidePuzzleBoard b, PuzzleFrame f) {
		super("Start"); // super - 내가 상속받은 클래스, 버튼 이름을 세팅할 건데 위에 JButton이 이미 갖고 있음
		board = b;
		frame = f;
		addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		board.createPuzzleBoard();
		frame.update();
	}
}
