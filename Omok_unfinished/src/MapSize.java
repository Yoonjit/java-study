public class MapSize {
	
	// 게임 화면에 대한 정보가 담겨있는 클래스
	
	private final int CELL = 30; // 해당 값을 변경하면 화면에서 보여지는 영역 크기가 달라짐
	private final int SIZE = 20; // 해당 값을 변경하면 오류 발생
	
	public int getCell() { // cell을 받아오는 메소드
		return CELL;
	}
	
	public int getSize() { // size를 받아오는 메소드
		return SIZE;
	}
	
}