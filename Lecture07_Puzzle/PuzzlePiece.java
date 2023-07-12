public class PuzzlePiece {
	// 퍼즐 한 조각의 번호(이름)
	// face 필드변수 필요함
	// 번호를 주고 퍼즐피스 오브젝트 만들어지도록 하기
	
	private int face;
	
	public int face() { return face; }
	
	public PuzzlePiece(int n){
		face = n;
	}

}