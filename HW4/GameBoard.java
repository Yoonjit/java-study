import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class GameBoard extends JPanel{ // 뷰 클래스 (output)

	private int size;
	private Player player1;
	private Player player2;
	private Player player;
	private Dice dice;
	
	public GameBoard(Player p1, Player p2) {
		player1 = p1;
		player2 = p2;
		
		JFrame f = new JFrame();
		
		f.getContentPane().add(this);
		f.setTitle("주사위 게임");
		f.setSize(300, 300);
		
		f.setVisible(true);
		
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);	
	}
	
	protected void paintComponent(Graphics g, Dice d, Player p) {
		dice = d;
		player = p;
		
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 300, 300);
		
		g.setColor(Color.BLACK);
		g.drawString(p.name(), 50, 50);
		
		String str = Integer.toString(d.sum());
		g.drawString(str, 50, 70);
		
		this.repaint();
	}

}