import java.awt.Container;

import javax.swing.JFrame;

public class GameSize extends JFrame {
	
	// 게임 화면 크기를 설정하는 클래스
	
	private Container c;
	MapSize size = new MapSize();
	GameMethod gm;

	public GameSize(String title, GameMethod gm) { // Constructor (생성자)
		setTitle(title);
		setBounds(200, 20, 644, 720);
		setLocation(440, 70);
		
		c = getContentPane();
		c.setLayout(null);
		
		ShowMap sm = new ShowMap(size, gm);
		setContentPane(sm);
		
		add(gm.label_0);
		gm.label_0.setBounds(195, 600, 1000, 80);
		
		MouseAction mc = new MouseAction(gm, size, sm, this);
		addMouseListener(mc);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}