import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class PuzzleWriter extends JPanel implements PuzzleWriterInterface{
	private SlidePuzzleBoardInterface puzzle;
	private final int SIZE; // the size of a puzzle piece in pixel

	public PuzzleWriter(SlidePuzzleBoardInterface p) {
		puzzle = p;
		SIZE = 30;
		JFrame f = new JFrame();
		f.getContentPane().add(this);
		f.setLocation(550,100);
		f.setTitle("Slide Puzzle");
		f.setSize(SIZE*6, SIZE*6+28);
		f.setVisible(true);
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	public void paintComponent(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillRect(0, 0, SIZE*6, SIZE*6);
		PuzzlePiece[][] r = puzzle.board();
		for (int i = 0; i < 4; i = i + 1) {
			for (int j = 0; j < 4; j = j + 1) {
				paintPiece(g, r[i][j], i, j);
			}
		}
	}

	private void paintPiece(Graphics g, PuzzlePiece p, int i, int j) {
		int x = SIZE + (SIZE * j);
		int y = SIZE + (SIZE * i);
		if (p != null) {
			g.setColor(Color.WHITE);
			g.fillRect(x, y, SIZE, SIZE);
			g.setColor(Color.BLACK);
			g.drawRect(x, y, SIZE, SIZE);
			int face_value = p.face();
			if (face_value < 10)
				g.drawString(face_value + "", x+11, y+20);
			else
				g.drawString(face_value + "", x+7, y+20);
		}
		else {
			g.setColor(Color.BLACK);
			g.fillRect(x, y, SIZE, SIZE);
		}
	}

	public void displayPuzzleBoard() {
		this.repaint();
	}

	public void showNoMove(String s) {
		JOptionPane.showMessageDialog(null, "Error: " + s );
	}

}