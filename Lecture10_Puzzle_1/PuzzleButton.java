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
		String s = getText(); // ���� ���� ��ư�� �ؽ�Ʈ�� ��
		
		// move �޼ҵ�� ������ ����, ������ �ٲ��ֱ�
		// ������ ���� �ٲ���� ���� ������Ʈ
		if(! s.equals("") && board.move(Integer.parseInt(s))) {
			frame.update();
		}
	}
	
}