import javax.swing.JOptionPane;

public class Test {
	
	public static void main(String[] args) {
		int n = new DialogReader().readInt("������ �ּ���. 100���� ������ �帳�ϴ�.");
		
		try {
			String answer = "100���� ������ " + Integer.toString(n) + " = " + (100 / n);
			JOptionPane.showMessageDialog(null, answer);
		}
		catch (ArithmeticException e) {
			JOptionPane.showMessageDialog(null, e.getMessage() + " : 0���� ���� �� �����ϴ�.");
		}
	}
	
}