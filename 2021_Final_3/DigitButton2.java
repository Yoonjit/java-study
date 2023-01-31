import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

// �Ʒ��� ��ư�� ����� ���� Ŭ����
// ������ ��ư 2���� ���� ���� ����: �� ��° ��ư�� ������ ù ��° ��ư�� ���� ���Ŀ� ���� �� �ֱ� ������
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