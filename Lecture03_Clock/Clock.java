import java.time.LocalTime;

import javax.swing.JOptionPane;

class Model { // 1단계: 모델 설계 - 몇 시인지 파악
	
	LocalTime whatTimeIsIt() {
		return LocalTime.now();
	}

}

class View { // 2단계: 뷰 설계 - 시간 출력
	
	void show(LocalTime time) {
		System.out.println(time);
	}
	
	void showSwing(LocalTime time) {
		JOptionPane.showMessageDialog(null, time);
	}
	
}

class Controller { // 3단계: 컨트롤러 설계 - 모델과 뷰를 받음
	
	void control(Model m, View v) {
		LocalTime time = m.whatTimeIsIt();
		v.show(time);
		v.showSwing(time);
	}
	
}

public class Clock { // 4단계: 스타터 설계 - 메인 함수

	public static void main(String[] args) {
		Model model = new Model();
		View view = new View();
		new Controller().control(model, view);
	}

}