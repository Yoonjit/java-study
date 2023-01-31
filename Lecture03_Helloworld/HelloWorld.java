import javax.swing.JOptionPane;
// java ���ϸ�� ���� Ŭ������ public�� ���� �� ����
// �׷��� ���� ��� ����

class Model { // 1�ܰ�: �� ���� - �޽��� ����
	
	String createMessage() {
		return "Hello, World!";
	}

}

class View { // 2�ܰ�: �� ���� - �޽��� ���
	
	void show(String message) {
		System.out.println(message);
	}
	
	void showSwing(String message) {
		JOptionPane.showMessageDialog(null, message);
	}
	
}

class Controller { // 3�ܰ�: ��Ʈ�ѷ� ���� - �𵨰� �並 ����
	
	void control(Model m, View v) {
		String message = m.createMessage();
		v.show(message);
		v.showSwing(message);
	}
	
}

public class HelloWorld { // 4�ܰ�: ��Ÿ�� ���� - ���� �Լ�

	public static void main(String[] args) {
		Model model = new Model();
		View view = new View();
		new Controller().control(model, view);
	}

}