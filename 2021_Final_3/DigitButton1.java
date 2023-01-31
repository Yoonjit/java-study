import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

// ���� ��ư�� ����� ���� Ŭ����
public class DigitButton1 extends JButton implements ActionListener {
	
	private GugudanFrame frame;
	
	public DigitButton1(int d, GugudanFrame f) {
		super(Integer.toString(d));
		frame = f;
		addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		frame.clicked1(Integer.parseInt(getText()));
	}

}