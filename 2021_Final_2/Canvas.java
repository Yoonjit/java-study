import java.awt.Shape;

// �θ� �ڽ� Ŭ���� ������ ���� ���� ����
// instanceof�� ����ؾ� ��

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
	
	public double totalArea() { // ��� ������ �� 
		double total = 0;
		for (int i = 0; i < counter; i++)
			// shapes[i]�� �� �� �ִ� ������ ���� 2��
			// �ٵ� �� �� area �޼ҵ� ������ �ִµ� �� ����� ���� = �����Ϸ� ����
			if(shapes[i] instanceof Rectangle)
				total += ((Rectangle)shapes[i]).area();
			else if(shapes[i] instanceof Circle)
			    total += ((Circle)shapes[i]).area();
			// �϶�� ��� �� �����ݾ� ���� �ٵ� ������ �� �˾��ĵ�� �� �����Ϸ� ����
			// �׷��� ���� ���� shapes[i]���µ� ��ģ ����, ((Rectangle)shapes[i])
		return total;
	}
	
	public static void main(String[] args) {
		new Canvas(4);
	}

}
