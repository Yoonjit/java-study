import javax.swing.JOptionPane;

public class Test {
	
	/* Exception 객체가 처리 가능한 메소드
	1) String getMessage() : 발생한 오류를 설명하는 메시지 리턴
	2) String toString() : 예외 객체의 간판 문자열 리턴, 예외 클래스 이름과 오류를 설명하는 메시지를 통상 포함
	3) paintStackTrace() : 오류가 발생한 지점과 이에 도달하기 전의 메소드 호출 지점을 콘솔창에 프린트 */
	
	public static void main(String[] args) {
		int n = readInt();
		
		// ArithmeticException 예외 처리 - 산수에서 오류가 생겼을 때 어떻게 처리할 것인지
		try { // 예외 발생 블록 - 오류 발생할 것 같은 구간
			String answer = "100에서 나누기 " + Integer.toString(n) + " = " + (100 / n);
			JOptionPane.showMessageDialog(null, answer);
		}
		catch (ArithmeticException e) { // 예외 처리 블록 - 오류 발생했을 시 어떻게 처리할 것인지
			JOptionPane.showMessageDialog(null, e.getMessage() + " : 0으로 나눌 수 없습니다.");
		}
	}
	
	private static int readInt() {
		int n;
		String input = JOptionPane.showInputDialog("정수를 주세요. 100에서 나누어 드립니다.");
		
		// NumberFormatException 예외 처리 - 정수가 아닐 때 어떻게 처리할 것인지
		try {
			n = Integer.parseInt(input.trim());
		}
		catch (NumberFormatException e){
			JOptionPane.showMessageDialog(null, e.getMessage() + " 정수가 아닙니다.");
			n = readInt(); // 재시도
		}
		return n;
	}
	
}