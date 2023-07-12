import java.text.DecimalFormat;

import javax.swing.JOptionPane;

// �޼ҵ� �����ε�: �޼ҵ� �̸� ���� �ֵ� �� �� ����
//             ��ſ� ���� ��(�Ķ���� ��)�� �ٸ��ų� �޼ҵ� ��ȯ�� Ÿ���� �޶�� ��

class Model { // 1�ܰ�: �� ���� - �־��� �������� ���� ���� ���� ���
	
	double areaCircle(double radius) {
		return Math.PI * Math.pow(radius, 2);
	}

}

class ViewIn { // 2�ܰ�: ���� ���� - ������ �Է¹޾Ƽ� ���� ���·� ��ȯ
	
	int getNumber(String message) {
		String input = JOptionPane.showInputDialog(message);
		return Integer.parseInt(input);
	}
	
}

class ViewOut { // 2�ܰ�: ��ƿ� ���� - ����� �Է�â
	
	void show(int radius, double area) {
		DecimalFormat formatter = new DecimalFormat("0.00");
		System.out.print("�������� " + radius + "�� ���� ������ ");
		System.out.println(formatter.format(area) + " �Դϴ�.");
	}
	
}

class Controller { // 3�ܰ�: ��Ʈ�ѷ� ���� - �𵨰� �並 ����, ������ �Է�â
	
	void control(Model m, ViewIn i, ViewOut o) {
		int radius = i.getNumber("�������� �ֽø� ���� ������ ����ص帳�ϴ�.");
		double area = m.areaCircle(radius);
		o.show(radius, area);
	}
	
}

public class Circle { // 4�ܰ�: ��Ÿ�� ���� - ���� �Լ�

	public static void main(String[] args) {
		Model model = new Model();
		ViewIn input = new ViewIn();
		ViewOut output = new ViewOut();

		new Controller().control(model, input, output);
	}

}