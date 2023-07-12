import java.awt.Shape;

// 부모 자식 클래스 공유에 대한 이해 문제
// instanceof를 사용해야 함

public class Canvas {
	
	private Shape[] shapes;
	private int counter = 0;
	
	public Canvas(int n) {
		shapes = new Shape[n];
	}
	
	public void add(Shape s) {
		if (counter == shapes.length) {
			Shape[] temp = new Shape[counter*2];
			for (int i = 0; i < counter; i++)
				temp[i] = shapes[i];
			shapes = temp;
		}
		shapes[counter] = s;
		counter += 1;
	}
	
	public double totalArea() { // 모든 면적의 합 
		double total = 0;
		for (int i = 0; i < counter; i++)
			// shapes[i]에 들어갈 수 있는 도형은 지금 2개
			// 근데 둘 다 area 메소드 가지고 있는데 뭘 쓰라는 거임 = 컴파일러 입장
			if(shapes[i] instanceof Rectangle)
				total += ((Rectangle)shapes[i]).area();
			else if(shapes[i] instanceof Circle)
			    total += ((Circle)shapes[i]).area();
			// 하라는 대로 다 해줬잖아 ㅅㅂ 근데 아직도 못 알아쳐듣는 이 컴파일러 샛기
			// 그래서 원래 저기 shapes[i]였는데 고친 거임, ((Rectangle)shapes[i])
		return total;
	}
	
	public static void main(String[] args) {
		new Canvas(4);
	}

}
