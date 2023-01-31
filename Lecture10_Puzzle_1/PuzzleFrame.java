import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class PuzzleFrame extends JFrame {
	
    private SlidePuzzleBoard board;
    private PuzzleButton[][] button_board;

    public PuzzleFrame(SlidePuzzleBoard b) {
        board = b;
        button_board = new PuzzleButton[4][4]; // ���� �迭 ���� �� �ִ� 2���� �迭
        
        Container cp = getContentPane(); // �׸� �׸����� �����̳ʺ��� ������ ��
        cp.setLayout(new GridLayout(4, 4)); // ���̾ƿ� ����, 4���, 4���
        
        // ���� ��ư ������Ʈ ���� ä���
        for (int row = 0; row < 4; row++) {
        	for (int col = 0; col < 4; col++) {
                button_board[row][col] = new PuzzleButton(board, this); // �������� ��(this)
                cp.add(button_board[row][col]);
            }
        }
            
        update();
        
        setTitle("������ �����ϴ� �����̵� ����");
        setSize(250, 250);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
    }

    // ��ư�� �ű� ���� �����ϱ� ��ư�� ���� ����(�ؽ�Ʈ)�� �ٲٸ� �� = �׸��� ���� �׸� = ������Ʈ
    // �� �ؽ�Ʈ ������ �����̵� ���� ���尡 ���� ����
    public void update() {
    	for (int row = 0; row < 4; row++) {
        	for (int col = 0; col < 4; col++) {
                PuzzlePiece pp = board.getPuzzlePiece(row, col);
                
                if(pp != null) {
                	String n = Integer.toString(pp.face()); // ��ȣ �����, ������ ���ڿ���
                    button_board[row][col].setText(n);
                }
                else {
                    button_board[row][col].setText("");

                }
        	}    
        }  
    }

}