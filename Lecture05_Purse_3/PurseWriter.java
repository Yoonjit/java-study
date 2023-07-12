import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class PurseWriter extends JPanel {
	
	private Purse purse;
	String last_transaction;
	
	public PurseWriter(String title, int x, int y, Purse p) {
		purse = p;
		
		JFrame f = new JFrame();
		
		f.getContentPane().add(this);
		f.setTitle(title);
		f.setLocation(x, y);
		f.setSize(300, 200);
		
		f.setVisible(true);
		
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	protected void paintComponent(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 300, 222);
		
		g.setColor(Color.BLACK);
		g.drawString(last_transaction, 50, 50);
		g.drawString("ภÜพื = " + purse.getBalance(), 50, 70);
	}
	
	public void showTransaction(int amount, String message) {
		last_transaction = amount + " " + message;
		this.repaint();
	}
	
	public void showTransaction(String message) {
		last_transaction = message;
		this.repaint();
	}
	
// test
	public static void main(String[] args) {
		System.out.println();
	}
	
}