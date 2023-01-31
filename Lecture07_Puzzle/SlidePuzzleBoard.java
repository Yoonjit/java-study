public class SlidePuzzleBoard {
	// 퍼즐피스의 2차원 배열 필요함
	// 한 칸이 비워져야 함(null), 빈칸의 위치 정보 row와 col
	// 퍼즐 보드 세팅할 메소드 필요함, 오른쪽 맨 아래 빈칸으로 두기
	// 내가 선택한 퍼즐 피스가 움직일 수 있는 경우와 없는 경우 존재(불리언)
	
	private PuzzlePiece[][] board;
	private int empty_row;
	private int empty_col;
	
	public SlidePuzzleBoard(){
		// 퍼즐 피스 15개 만들기
		// 2차원 배열에 위치시키기
		// 중첩 for문을 사용하면 될 듯
		int number = 15; // 15번 피스부터 만들기
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
//				if(i == 3 && j == 3) { // 돌 때마다 확인해야 함(낭비)
//					board[i][j] = null;
//				}
//				else {
//					board[i][j] = new PuzzlePiece(number);
//				}
//				number -= 1; // 15번부터 1번까지
				
				board[i][j] = new PuzzlePiece(number);
				number -= 1;
			}
		}
		board[3][3] = null; // 오브젝트 만들었다가 그냥 버림
		empty_row = 3;
		empty_col = 3;
	}
	
	public boolean move(int n) { // 퍼즐 빈칸으로 움직이기
		// 번호(n)이 주어졌을 때, 움직일 수 있는지 없는지부터 확인
		// 그 번호가 빈칸 위, 아래, 왼쪽, 오른쪽에 있는지 알아보기 = 움직일 수 있음
		// ex) 빈칸 위에 있냐? = 빈칸 좌표가 (1,1)이면 그 피스는 (0,1)에 있겠지
		
//		// 방법 1
//		// 빈 칸 위에 있냐
//		if(found(n, empty_row-1, empty_col)) {
//			// 지금 빈칸 위치를 퍼즐 위치로 바꾸고
//			// 지금 퍼즐 위치를 빈칸 위치로 바꾸기
//			board[empty_row][empty_col] = board[empty_row-1][empty_col];
//			board[empty_row-1][empty_col] = null;
//			empty_col -= 1;
//		}
//		
//		// 아래
//		if(found(n, empty_row+1, empty_col)) {
//			board[empty_row][empty_col] = board[empty_row+1][empty_col];
//			board[empty_row+1][empty_col] = null;
//			empty_col -= 1;
//		}
//		
//		// 왼쪽
//		if(found(n, empty_row, empty_col-1)) {
//			board[empty_row][empty_col] = board[empty_row][empty_col-1];
//			board[empty_row][empty_col-1] = null;
//			empty_col -= 1;
//		}
//		
//		// 오른쪽
//		if(found(n, empty_row, empty_col+1)) {
//			board[empty_row][empty_col] = board[empty_row][empty_col+1];
//			board[empty_row][empty_col+1] = null;
//			empty_col -= 1;
//		}
		
		// 방법 2
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
		// found가 true: 움직일 수 있음
		// found가 false: 움직일 수 없음
		
		// found 메소드 만들다가 생각하게 된 점
		// 좌표가 -1이 될 수는 없음, 0부터 3 사이에 있어야 함
		if(0<=r && r<=3 && 0<=c && c<=3) {
//			if(board[r][c] != null) { // 약간 안전장치 느낌, 없어도 되긴 함
//				return board[r][c].face() == n;
//			}
			return board[r][c].face() == n;
		}
		else {
			return false;
		}
	}
	
}