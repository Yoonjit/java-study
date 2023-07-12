public class Rectangle extends Shape {
	
	private int garo; // 도형의 가로 길이 
	private int sero; // 도형의 세로 길이 
	
	public Rectangle(int m, int n, int g, int s) {
		super(m,n); // x = m; y = n; -> 이거 Shape에서 가져왔음
		garo = g;
		sero = s;
	}
	
	public int garo() { return garo; }
	public int sero() { return sero; }
	
	public int area() {
		return garo * sero;
	}

}
