public class SlidePuzzleBoard implements SlidePuzzleBoardInterface{

	private PuzzlePiece[][] board;
	private int empty_row;
	private int empty_col;

	public PuzzlePiece[][] board() { return board; }

	public SlidePuzzleBoard() {
		board = new PuzzlePiece[4][4];
		int number = 15;
		for (int i = 0; i < 4; i++)
			for (int j = 0; j < 4; j++) {
				board[i][j] = new PuzzlePiece(number);
				number -= 1;
			}
		board[3][3] = null;
		empty_row = 3;
		empty_col = 3;
	}

	public boolean move(int n) {
		int row, col;
		if (found(n,empty_row-1, empty_col)) {
			row = empty_row-1;
			col = empty_col;
		}
		else if (found(n,empty_row+1, empty_col)) {
			row = empty_row+1;
			col = empty_col;
		}
		else if (found(n,empty_row, empty_col-1)) {
			row = empty_row;
			col = empty_col-1;
		}
		else if (found(n,empty_row, empty_col+1)) {
			row = empty_row;
			col = empty_col+1;
		}
		else
			return false;
		board[empty_row][empty_col] = board[row][col];
		board[row][col] = null;
		empty_row = row;
		empty_col = col;
		return true;
	}

	private boolean found(int n, int r, int c) {
		if (r >= 0 && r <= 3 && c >= 0 && c <= 3)
			return board[r][c].face() == n;
		else
			return false;
	}

}