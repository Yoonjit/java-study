public class Shape {
	
	private int x; // 도형의 위치 x축 좌표 
	private int y; // 도형의 위치 y축 좌표 - 위치의 원점 좌표 (0,0)은 화판의 좌상단 꼭지
	
	public Shape(int m, int n) {
		x = m; 
		y = n;
	}
	
	public int x() { return x; }
	public int y() { return y; }

}
