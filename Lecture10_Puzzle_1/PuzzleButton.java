import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class PuzzleButton extends JButton implements ActionListener{

	private SlidePuzzleBoard board;
	private PuzzleFrame frame;
	
	public PuzzleButton(SlidePuzzleBoard b, PuzzleFrame f) {
		board = b;
		frame = f;
		addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		String s = getText(); // 내가 누른 버튼의 텍스트를 줌
		
		// move 메소드는 정수를 받음, 정수로 바꿔주기
		// 실제로 값이 바뀌었을 때만 업데이트
		if(! s.equals("") && board.move(Integer.parseInt(s))) {
			frame.update();
		}
	}
	
}