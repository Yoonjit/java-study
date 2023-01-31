public class Stone {
	
	// 바둑돌의 정보를 저장하는 클래스
	// get과 set을 이용
	
	private int x; // 현재 바둑돌 x축 위치
	private int y; // 현재 바둑돌 y축 위치
	private int color; // 현재 바둑돌 색상 (누구 차례인지 나타냄)
	
	public Stone(int y, int x, int color) { // Constructor (생성자)
		this.y = y;
		this.x = x;
		this.color = color;
	}
	
	public int getX() { // x축 정보를 받아오는 메소드
		return x;
	}
	
	public void setX(int x) { // x축 정보를 세팅하는 메소드
		this.x = x;
	}
	
	public int getY() { // y축 정보를 받아오는 메소드
		return y;
	}
	
	public void setY(int y) { // y축 정보를 세팅하는 메소드
		this.y = y;
	}
	
	public int getColor() { // 바둑돌 색상을 받아오는 메소드
		return color;
	}
	
	public void setColor(int color) { // 바둑돌 색상을 세팅하는 메소드
		this.color = color;
	}
	
}