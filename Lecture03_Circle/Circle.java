import java.text.DecimalFormat;

import javax.swing.JOptionPane;

// 메소드 오버로딩: 메소드 이름 같은 애들 쓸 수 있음
//             대신에 인자 수(파라미터 수)가 다르거나 메소드 반환값 타입이 달라야 함

class Model { // 1단계: 모델 설계 - 주어진 반지름을 갖는 원의 넓이 계산
	
	double areaCircle(double radius) {
		return Math.PI * Math.pow(radius, 2);
	}

}

class ViewIn { // 2단계: 뷰인 설계 - 반지름 입력받아서 정수 형태로 반환
	
	int getNumber(String message) {
		String input = JOptionPane.showInputDialog(message);
		return Integer.parseInt(input);
	}
	
}

class ViewOut { // 2단계: 뷰아웃 설계 - 결과값 입력창
	
	void show(int radius, double area) {
		DecimalFormat formatter = new DecimalFormat("0.00");
		System.out.print("반지름이 " + radius + "인 원의 면적은 ");
		System.out.println(formatter.format(area) + " 입니다.");
	}
	
}

class Controller { // 3단계: 컨트롤러 설계 - 모델과 뷰를 받음, 반지름 입력창
	
	void control(Model m, ViewIn i, ViewOut o) {
		int radius = i.getNumber("반지름을 주시면 원의 면적을 계산해드립니다.");
		double area = m.areaCircle(radius);
		o.show(radius, area);
	}
	
}

public class Circle { // 4단계: 스타터 설계 - 메인 함수

	public static void main(String[] args) {
		Model model = new Model();
		ViewIn input = new ViewIn();
		ViewOut output = new ViewOut();

		new Controller().control(model, input, output);
	}

}