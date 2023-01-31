import javax.swing.JOptionPane;
// java 파일명과 같은 클래스만 public을 붙일 수 있음
// 그렇지 않을 경우 오류

class Model { // 1단계: 모델 설계 - 메시지 생성
	
	String createMessage() {
		return "Hello, World!";
	}

}

class View { // 2단계: 뷰 설계 - 메시지 출력
	
	void show(String message) {
		System.out.println(message);
	}
	
	void showSwing(String message) {
		JOptionPane.showMessageDialog(null, message);
	}
	
}

class Controller { // 3단계: 컨트롤러 설계 - 모델과 뷰를 받음
	
	void control(Model m, View v) {
		String message = m.createMessage();
		v.show(message);
		v.showSwing(message);
	}
	
}

public class HelloWorld { // 4단계: 스타터 설계 - 메인 함수

	public static void main(String[] args) {
		Model model = new Model();
		View view = new View();
		new Controller().control(model, view);
	}

}