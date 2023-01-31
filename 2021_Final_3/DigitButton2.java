import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

// 아랫줄 버튼을 만들기 위한 클래스
// 디지털 버튼 2개를 따로 만든 이유: 두 번째 버튼은 무조건 첫 번째 버튼이 눌린 이후에 만들 수 있기 때문에
public class DigitButton2 extends JButton implements ActionListener {
	
	private GugudanFrame frame;
	
	public DigitButton2(int d, GugudanFrame f) {
		super(Integer.toString(d));
		frame = f;
		addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		frame.clicked2(Integer.parseInt(getText()));
	}

}