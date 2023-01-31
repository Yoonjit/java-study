import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class NumberButton extends JButton implements ActionListener{
	
	// 게임 실행시 플레이어 인원을 선택하는 버튼에 대한 클래스
	
	public GameMethod gm;
	private NumberFrame nf;
	public int ready = 0; // 타이머가 준비 상태
	
	public NumberButton(String s, GameMethod g, NumberFrame n) { // Constructor (생성자)
		super(s);
		gm = g;
		nf = n;
		addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae) { // 버튼 클릭시 보여줄 이벤트에 대한 메소드
		String player_cnt = getText();
		
		if (player_cnt == "2인") {
			gm.setGameMode(2);
			gm.init();
			nf.setVisible(false);
//			System.out.println("while stop 1");
			ready = 1; // 타이머 활성화
//			System.out.println("while stop 2");
		}
		else if (player_cnt == "3인") {
			gm.setGameMode(3);
			gm.init();
			nf.setVisible(false);
//			System.out.println("while stop 3");
			ready = 1; // 타이머 활성화
//			System.out.println("while stop 4");
		}
	}
	
	public int getReady() { // 타이머가 준비 상태임을 반환
		return ready;
	}

}