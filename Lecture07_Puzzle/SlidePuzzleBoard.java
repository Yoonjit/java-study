public class SlidePuzzleBoard {
	// �����ǽ��� 2���� �迭 �ʿ���
	// �� ĭ�� ������� ��(null), ��ĭ�� ��ġ ���� row�� col
	// ���� ���� ������ �޼ҵ� �ʿ���, ������ �� �Ʒ� ��ĭ���� �α�
	// ���� ������ ���� �ǽ��� ������ �� �ִ� ���� ���� ��� ����(�Ҹ���)
	
	private PuzzlePiece[][] board;
	private int empty_row;
	private int empty_col;
	
	public SlidePuzzleBoard(){
		// ���� �ǽ� 15�� �����
		// 2���� �迭�� ��ġ��Ű��
		// ��ø for���� ����ϸ� �� ��
		int number = 15; // 15�� �ǽ����� �����
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
//				if(i == 3 && j == 3) { // �� ������ Ȯ���ؾ� ��(����)
//					board[i][j] = null;
//				}
//				else {
//					board[i][j] = new PuzzlePiece(number);
//				}
//				number -= 1; // 15������ 1������
				
				board[i][j] = new PuzzlePiece(number);
				number -= 1;
			}
		}
		board[3][3] = null; // ������Ʈ ������ٰ� �׳� ����
		empty_row = 3;
		empty_col = 3;
	}
	
	public boolean move(int n) { // ���� ��ĭ���� �����̱�
		// ��ȣ(n)�� �־����� ��, ������ �� �ִ��� ���������� Ȯ��
		// �� ��ȣ�� ��ĭ ��, �Ʒ�, ����, �����ʿ� �ִ��� �˾ƺ��� = ������ �� ����
		// ex) ��ĭ ���� �ֳ�? = ��ĭ ��ǥ�� (1,1)�̸� �� �ǽ��� (0,1)�� �ְ���
		
//		// ��� 1
//		// �� ĭ ���� �ֳ�
//		if(found(n, empty_row-1, empty_col)) {
//			// ���� ��ĭ ��ġ�� ���� ��ġ�� �ٲٰ�
//			// ���� ���� ��ġ�� ��ĭ ��ġ�� �ٲٱ�
//			board[empty_row][empty_col] = board[empty_row-1][empty_col];
//			board[empty_row-1][empty_col] = null;
//			empty_col -= 1;
//		}
//		
//		// �Ʒ�
//		if(found(n, empty_row+1, empty_col)) {
//			board[empty_row][empty_col] = board[empty_row+1][empty_col];
//			board[empty_row+1][empty_col] = null;
//			empty_col -= 1;
//		}
//		
//		// ����
//		if(found(n, empty_row, empty_col-1)) {
//			board[empty_row][empty_col] = board[empty_row][empty_col-1];
//			board[empty_row][empty_col-1] = null;
//			empty_col -= 1;
//		}
//		
//		// ������
//		if(found(n, empty_row, empty_col+1)) {
//			board[empty_row][empty_col] = board[empty_row][empty_col+1];
//			board[empty_row][empty_col+1] = null;
//			empty_col -= 1;
//		}
		
		// ��� 2
		int row, col;
		
		if(found(n, empty_row-1, empty_col)) {
			row = empty_row-1;
			col = empty_col;
		}
		else if(found(n, empty_row+1, empty_col)) {
			row = empty_row+1;
			col = empty_col;
		}
		else if(found(n, empty_row, empty_col-1)) {
			row = empty_row;
			col = empty_col-1;
		}
		else if(found(n, empty_row, empty_col+1)) {
			row = empty_row;
			col = empty_col+1;
		}
		else {
			return false;
		}
		
		board[empty_row][empty_col] = board[row][col];
		board[row][col] = null;
		empty_row = row;
		empty_col = col;
		return true;
	}
	
	public boolean found(int n, int r, int c) {
		// found�� true: ������ �� ����
		// found�� false: ������ �� ����
		
		// found �޼ҵ� ����ٰ� �����ϰ� �� ��
		// ��ǥ�� -1�� �� ���� ����, 0���� 3 ���̿� �־�� ��
		if(0<=r && r<=3 && 0<=c && c<=3) {
//			if(board[r][c] != null) { // �ణ ������ġ ����, ��� �Ǳ� ��
//				return board[r][c].face() == n;
//			}
			return board[r][c].face() == n;
		}
		else {
			return false;
		}
	}
	
}