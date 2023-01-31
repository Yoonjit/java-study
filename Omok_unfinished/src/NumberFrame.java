import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class NumberFrame extends JFrame{
	
	// 게임 실행시 플레이어 인원을 선택하는 버튼이 담긴 프레임에 대한 클래스
	
	public NumberButton button1;
	public NumberButton button2;

	public NumberFrame(GameMethod gm) { // Constructor (생성자)
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		
		button1 = new NumberButton("2인", gm, this);
		button2 = new NumberButton("3인", gm, this);
		cp.add(button1);
		cp.add(button2);
		
		setTitle("플레이어 수 선택");
		setSize(284, 80);
		setLocation(620, 340);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		while (true) {
//			System.out.println("으악!!!!!!!!!");
			if (button1.getReady() == 1 || button2.getReady() == 1) {
//				System.out.println("fucking 1");
				gm.timeLimit();
//				System.out.println("fucking 2");
			}
			
			if (gm.end == 1) {
				break;
			}
		}
	}
	
}