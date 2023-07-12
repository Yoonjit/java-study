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
	// (first == 0) - DigitButton1을 아직 누르지 않았음
	// (first != 0) - DigitButton1을 눌렀음 
	
	public GugudanFrame() {
		Container cp = getContentPane();
		cp.setLayout(new GridLayout(7,1)); // 전체는 가로로 7줄 세로로 1줄
		
		JPanel p1 = new JPanel(new GridLayout(1,8)); // 맨 위는 1대 8 레이아웃으로
		for (int i = 2; i <= 9; i++)
			p1.add(new DigitButton1(i, this));
		cp.add(p1);
		
		JPanel p2 = new JPanel(new FlowLayout()); // x를 넣기
		JLabel x = new JLabel();
		x.setText("X");
		p2.add(x);
		cp.add(p2);
		
		JPanel p3 = new JPanel(new GridLayout(1,8)); // 두 번째 버튼 또 만들고
		for (int i = 2; i <= 9; i++)
			p3.add(new DigitButton2(i, this));
		cp.add(p3);
		
		JPanel p4 = new JPanel(new FlowLayout()); // =를 넣기
		p4.add(new JLabel("="));
		cp.add(p4);
		
		JPanel p5 = new JPanel(new FlowLayout()); // 해답 적기
		p5.add(solution);
		cp.add(p5);
		
		JPanel p6 = new JPanel(new FlowLayout()); // 정답인지 오답인지 적기
		p6.add(ox);
		cp.add(p6);
		
		JPanel p7 = new JPanel(new FlowLayout()); // 계속할 건지 취소할 건지 적기
		p7.add(new MoreButton(this));
		p7.add(new ExitButton());
		cp.add(p7);
		
		question();
		setTitle("구구단 연습");
		setSize(500,400);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public void question() {
		int first = (int)(Math.random() * 8) + 2; // 0부터 7 사이 나올 건데 거기에 2 더하면 구구단
		int second = (int)(Math.random() * 8) + 2; // 소수점 버리기 때문에 0부터 7까지 나오는 거임
		// 해답을 쓰고
		solution.setText(Integer.toString(first * second));
		// 정답 오답 여부는 빈칸으로
		ox.setText("");
	}
	
	public void clicked1(int digit) {
		// 윗줄의 숫자를 클릭
		if(first == 0) // 0일 때만 동작하도록 해야 함
			first = digit;
	}
	
	public void clicked2(int digit) {
		// 아랫줄의 숫자를 클릭 
		// 0이 아닐 때만 동작하도록 해야 함
		if(first != 0) {
			int sol = digit * first;
			if(sol == Integer.parseInt(solution.getText()))
					ox.setText("정답");
			else
					ox.setText("오답");
		}
		first = 0; // 게임 끝났으니까 다시 0으로 바꾸어줘야 함
	}
	
	public static void main(String[] args) {
		new GugudanFrame();
	}

}
