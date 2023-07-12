import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class PuzzleFrame extends JFrame {
	
    private SlidePuzzleBoard board;
    private PuzzleButton[][] button_board;

    public PuzzleFrame(SlidePuzzleBoard b) {
        board = b;
        button_board = new PuzzleButton[4][4]; // 퍼즐 배열 담을 수 있는 2차원 배열
        
        Container cp = getContentPane(); // 그림 그리려면 컨테이너부터 만들어야 함
        cp.setLayout(new GridLayout(4, 4)); // 레이아웃 세팅, 4등분, 4등분
        
        // 퍼즐 버튼 오브젝트 만들어서 채우기
        for (int row = 0; row < 4; row++) {
        	for (int col = 0; col < 4; col++) {
                button_board[row][col] = new PuzzleButton(board, this); // 프레임은 나(this)
                cp.add(button_board[row][col]);
            }
        }
            
        update();
        
        setTitle("지수가 좋아하는 슬라이드 퍼즐");
        setSize(250, 250);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
    }

    // 버튼을 옮길 수는 없으니까 버튼에 적힌 숫자(텍스트)만 바꾸면 됨 = 그림을 새로 그림 = 업데이트
    // 그 텍스트 정보를 슬라이드 퍼즐 보드가 갖고 있음
    public void update() {
    	for (int row = 0; row < 4; row++) {
        	for (int col = 0; col < 4; col++) {
                PuzzlePiece pp = board.getPuzzlePiece(row, col);
                
                if(pp != null) {
                	String n = Integer.toString(pp.face()); // 번호 물어보기, 정수를 문자열로
                    button_board[row][col].setText(n);
                }
                else {
                    button_board[row][col].setText("");

                }
        	}    
        }  
    }

}