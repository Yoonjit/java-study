import java.time.LocalTime;

import javax.swing.JOptionPane;

class Model { // 1�ܰ�: �� ���� - �� ������ �ľ�
	
	LocalTime whatTimeIsIt() {
		return LocalTime.now();
	}

}

class View { // 2�ܰ�: �� ���� - �ð� ���
	
	void show(LocalTime time) {
		System.out.println(time);
	}
	
	void showSwing(LocalTime time) {
		JOptionPane.showMessageDialog(null, time);
	}
	
}

class Controller { // 3�ܰ�: ��Ʈ�ѷ� ���� - �𵨰� �並 ����
	
	void control(Model m, View v) {
		LocalTime time = m.whatTimeIsIt();
		v.show(time);
		v.showSwing(time);
	}
	
}

public class Clock { // 4�ܰ�: ��Ÿ�� ���� - ���� �Լ�

	public static void main(String[] args) {
		Model model = new Model();
		View view = new View();
		new Controller().control(model, view);
	}

}