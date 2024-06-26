import java.awt.Color; // �ϼ�
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants; 

public class BoardWriter extends JPanel {
    
    private GameBoard board;
    private final int SIZE = 30;
    
    public BoardWriter(GameBoard b) {
        board = b;
        JFrame f = new JFrame();
        f.getContentPane().add(this);
        f.setLocation(550,80);
        f.setTitle("Matching Game");
        f.setSize(SIZE*6, SIZE*7+28);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    
    public void paintComponent(Graphics g) { 
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, SIZE*6, SIZE*7); 
        paintCellNumbers(g); 
        paintRevealedCells(g);
    }
    
    private void paintCellNumbers(Graphics g) { 
        int number = 1;
        for (int i = 0; i < 4; i = i + 1)
            for (int j = 0; j < 4; j = j + 1) { 
                int x = SIZE + (SIZE * j); 
                int y = SIZE + (SIZE * i);
                g.setColor(Color.BLACK);
                g.drawRect(x, y, SIZE, SIZE);
                if (number < 10) 
                    g.drawString(number + "", x+11, y+20);
                else
                    g.drawString(number + "", x+7, y+20);
                number += 1;
            }
    }
    
    private void paintRevealedCells(Graphics g) {
        Cell[][] square = board.square();
        for (int i = 0; i < 4; i = i + 1)
            for (int j = 0; j < 4; j = j + 1) { 
                Cell cell = square[i][j];
                if (cell.revealed()) {
                    int x = SIZE + (SIZE * j); 
                    int y = SIZE + (SIZE * i);
                    g.setColor(cell.color());
                    g.fillOval(x+3, y+3, SIZE-6, SIZE-6);
                }
            }
    }

}