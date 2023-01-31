import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class ChessBoardWriter extends JPanel {
	
	private int number_of_rows;
	private int square_size;
	private int panel_width;
	private int offset = 20;
	
	/* Constructor ChessBoardWriter - �г��� ����� �������� ����
	* @param rows - �� ���� ĭ�� ����
	* @param size - �� ĭ�� ���� */
	public ChessBoardWriter(int rows, int size) {
		number_of_rows = rows;
		square_size = size;
		panel_width = number_of_rows * square_size + 2 * offset;
		JFrame f = new JFrame();
		f.getContentPane().add(this);
		f.setTitle("Chess Board");
		f.setSize(panel_width, panel_width + 28);
		f.setVisible(true);
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	/* paintComponent - �гο� �׸��� �׸�
	* @param g - �׷��Ƚ� �� */
	public void paintComponent(Graphics g) {
		g.setColor(Color.gray);
		g.fillRect(0, 0, panel_width, panel_width);
		paintBoard(offset, offset, number_of_rows, square_size, g);
	}
	
	/* paintBoard - ü�����带 �׸�
	* @param start_x - ü�������� �»�� ������ x ��ǥ
	* @param start_y - ü�������� �»�� ������ y ��ǥ
	* @param rows - ü������ ���� ����
	* @param size - ü������ ĭ�� �ʺ�
	* @param g - �׷��Ƚ� �� */
	private void paintBoard(int start_x, int start_y,
							int rows, int size, Graphics g) {
		for (int x = 0; x < rows; x = x + 1) {
	// loop invariant: x������ �׷��� (x ���� ��)
			int x_position = start_x + x * size;
			for (int y = 0; y < rows; y = y + 1) {
				// loop invariant: x���� yĭ���� �׷��� (x ���� ��, y ���� ��)
				int y_position = start_y + y * size;
				if ((x + y) % 2 == 0) // ������ ĥ�� ����
					g.setColor(Color.black);
				else
					g.setColor(Color.white);
				g.fillRect(x_position, y_position, size, size);
			}
		}
	}
	public static void main(String[] args) {
		new ChessBoardWriter(8, 40);
	}
	
}