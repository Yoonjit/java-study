import javax.swing.JOptionPane;

public class Test {
	
	public static void main(String[] args) {
		int n = new DialogReader().readInt("정수를 주세요. 100에서 나누어 드립니다.");
		
		try {
			String answer = "100에서 나누기 " + Integer.toString(n) + " = " + (100 / n);
			JOptionPane.showMessageDialog(null, answer);
		}
		catch (ArithmeticException e) {
			JOptionPane.showMessageDialog(null, e.getMessage() + " : 0으로 나눌 수 없습니다.");
		}
	}
	
}