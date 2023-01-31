// 문제 3: HW1 프로그램을 MVC로 재구성하기

public class Model {
	
	public static int calculation(int p, int n, double i) {
		int total = (int)(p * Math.pow(1+i, n));
		return total;
	}
	
}