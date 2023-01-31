import java.util.Random;

public class SlidePuzzleBoard {

    private PuzzlePiece[][] board; // ���� �ǽ� ������Ʈ�� 2���� �迭�� ���
    // ��ĭ�� ��ǥ
    private int empty_row; // ��
    private int empty_col; // ��
    private boolean on = false; // ���� ���� ��
    // representation invariant: board[empty_row][empty_col] == null

    /** Constructor - SlidePuzzleBoard �ʱ� ���� ���� ���� - �����ϴ� ������ ����
     *  */
    public SlidePuzzleBoard() {
        // 4 x 4 ���� �����
        board = new PuzzlePiece[4][4];
        // ���� ���� 1~15�� ���忡 �������� �����
        int number = 15;
        for (int row = 0; row < 4; row++)
            for (int col = 0; col < 4; col++) {
                board[row][col] = new PuzzlePiece(number);
                number -= 1;
            }
        board[3][3] = null; // ��ĭ
        empty_row = 3;
        empty_col = 3;
    }

    /** getPuzzlePiece - ���� ������ ����
     * @param row - ������ �ε���
     * @param col - ������ �ε���
     * @return ���� ����  */
    public PuzzlePiece getPuzzlePiece(int row, int col) {
        return board[row][col];
    }

    /** �̵��� �����ϸ�, ���� ������ ��ĭ���� �̵�
     * @param w - �̵��ϱ� ���ϴ� ���� ������ ��ȣ
     * @return �̵� �����ϸ� true�� �����ϰ�, �̵��� �Ұ����ϸ� false�� ���� */
    public boolean move(int w) {
        int row, col; // w�� ��ġ
        // ��ĭ�� �ֺ����� w�� ��ġ�� ã��
        if (found(w, empty_row - 1, empty_col)) {
            row = empty_row - 1;
            col = empty_col;
        }
        else if (found(w, empty_row + 1, empty_col)) {
            row = empty_row + 1;
            col = empty_col;
        }
        else if (found(w, empty_row, empty_col - 1)) {
            row = empty_row;
            col = empty_col - 1;
        }
        else if (found(w, empty_row, empty_col + 1)) {
            row = empty_row;
            col = empty_col + 1;
        }
        else
            return false; // �̵� ����
        // w�� ��ĭ�� ����
        board[empty_row][empty_col] = board[row][col];
        // ��ĭ ��ġ�� ���� �����ϰ�, w�� ����
        empty_row = row;
        empty_col = col;
        board[empty_row][empty_col] = null;
        return true; // �̵� ����
    }

    /** found - board[row][col]�� ���� ���� v�� �ִ��� Ȯ��  */
    private boolean found(int v, int row, int col) {
        if (row >= 0 && row <= 3 && col >= 0 && col <= 3)
            return board[row][col].face() == v;
        else
            return false;
    }
    
    /** createPuzzleBoard - ���� ���� �ʱ� ���� ���� */
    public void createPuzzleBoard() {
        int[] numbers = generateRandomPermutation(15);
        int i = 0;
        
        for (int row = 0; row < 4; row++) {
        	for (int col = 0; col < 4; col++) {
            	
                // PuzzlePiece ����� ä���
            	if(row != 3 || col != 3) { // ���ǹ��� &&���� �ϸ� ��ĭ �ʹ� ������
            		board[row][col] = new PuzzlePiece(numbers[i] + 1); // 0���� 14�ϱ� +1
                	i++;
            	}
            	else {
            		board[row][col] = null;
            		empty_row = 3;
            		empty_col = 3;
            	}
            }
        }
            
        on = true;
    }
    
    public boolean on() {
    	return on;
    }

    /** generateRandomPermutation - 0~n-1 ������ ���� ������ �������� ���� �迭�� ���� �Ѵ�.
     * @param n - ������ ����
     * @return 0~n-1 ������ ������ �������� ���� ���� �迭
     */
    private int[] generateRandomPermutation(int n) {
        Random random = new Random();
        int[] permutation = new int[n];
        for (int i = 0; i < n; i++) {
            int d = random.nextInt(i+1);
            permutation[i] = permutation[d];
            permutation[d] = i;
        }
        return permutation;
    }

    /** gameOver - ���� ������ ���������� Ȯ��  
     * @return ��ǥ�� �޼������� true, ���� �� �����ؾ� �ϸ� false
     */
    public boolean gameOver() {
    	if(empty_row != 3 || empty_col != 3) {
    		return false; // ���� ���� �� ������
    	}
    	else {
    		int number = 1; // ����
    		
    		for (int row = 0; row < 4; row++) {
            	for (int col = 0; col < 4; col++) {
            		if (row != 3 || col != 3){
            			if (board[row][col].face() != number) {
                    		return false;
                    	}
                    	else {
                    		number += 1;
                    	} 
            		}
                }
            }
    		on = false;
    		return true;
    	}
    }

}