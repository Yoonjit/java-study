import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class GugudanFrame extends JFrame {
	
	private DigitButton1[] digits1 = new DigitButton1[8];
	private DigitButton2[] digits2 = new DigitButton2[8];
	private JLabel solution = new JLabel();
	private JLabel ox = new JLabel();
	private int first = 0; 
	// (first == 0) - DigitButton1�� ���� ������ �ʾ���
	// (first != 0) - DigitButton1�� ������ 
	
	public GugudanFrame() {
		Container cp = getContentPane();
		cp.setLayout(new GridLayout(7,1)); // ��ü�� ���η� 7�� ���η� 1��
		
		JPanel p1 = new JPanel(new GridLayout(1,8)); // �� ���� 1�� 8 ���̾ƿ�����
		for (int i = 2; i <= 9; i++)
			p1.add(new DigitButton1(i, this));
		cp.add(p1);
		
		JPanel p2 = new JPanel(new FlowLayout()); // x�� �ֱ�
		JLabel x = new JLabel();
		x.setText("X");
		p2.add(x);
		cp.add(p2);
		
		JPanel p3 = new JPanel(new GridLayout(1,8)); // �� ��° ��ư �� �����
		for (int i = 2; i <= 9; i++)
			p3.add(new DigitButton2(i, this));
		cp.add(p3);
		
		JPanel p4 = new JPanel(new FlowLayout()); // =�� �ֱ�
		p4.add(new JLabel("="));
		cp.add(p4);
		
		JPanel p5 = new JPanel(new FlowLayout()); // �ش� ����
		p5.add(solution);
		cp.add(p5);
		
		JPanel p6 = new JPanel(new FlowLayout()); // �������� �������� ����
		p6.add(ox);
		cp.add(p6);
		
		JPanel p7 = new JPanel(new FlowLayout()); // ����� ���� ����� ���� ����
		p7.add(new MoreButton(this));
		p7.add(new ExitButton());
		cp.add(p7);
		
		question();
		setTitle("������ ����");
		setSize(500,400);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public void question() {
		int first = (int)(Math.random() * 8) + 2; // 0���� 7 ���� ���� �ǵ� �ű⿡ 2 ���ϸ� ������
		int second = (int)(Math.random() * 8) + 2; // �Ҽ��� ������ ������ 0���� 7���� ������ ����
		// �ش��� ����
		solution.setText(Integer.toString(first * second));
		// ���� ���� ���δ� ��ĭ����
		ox.setText("");
	}
	
	public void clicked1(int digit) {
		// ������ ���ڸ� Ŭ��
		if(first == 0) // 0�� ���� �����ϵ��� �ؾ� ��
			first = digit;
	}
	
	public void clicked2(int digit) {
		// �Ʒ����� ���ڸ� Ŭ�� 
		// 0�� �ƴ� ���� �����ϵ��� �ؾ� ��
		if(first != 0) {
			int sol = digit * first;
			if(sol == Integer.parseInt(solution.getText()))
					ox.setText("����");
			else
					ox.setText("����");
		}
		first = 0; // ���� �������ϱ� �ٽ� 0���� �ٲپ���� ��
	}
	
	public static void main(String[] args) {
		new GugudanFrame();
	}

}
