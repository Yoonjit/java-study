public class Circle extends Shape {
	
	private int radius; // 원의 반지름  
	
	public Circle(int m, int n, int r) {
		super(m,n); // x = m; y = n; -> 이거 Shape에서 가져왔음
		radius = r;
	}
	
	public int radius() { return radius; }
	
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}

}
