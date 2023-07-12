import javax.swing.JOptionPane;

public class Test {
	
	/* Exception ��ü�� ó�� ������ �޼ҵ�
	1) String getMessage() : �߻��� ������ �����ϴ� �޽��� ����
	2) String toString() : ���� ��ü�� ���� ���ڿ� ����, ���� Ŭ���� �̸��� ������ �����ϴ� �޽����� ��� ����
	3) paintStackTrace() : ������ �߻��� ������ �̿� �����ϱ� ���� �޼ҵ� ȣ�� ������ �ܼ�â�� ����Ʈ */
	
	public static void main(String[] args) {
		int n = readInt();
		
		// ArithmeticException ���� ó�� - ������� ������ ������ �� ��� ó���� ������
		try { // ���� �߻� ��� - ���� �߻��� �� ���� ����
			String answer = "100���� ������ " + Integer.toString(n) + " = " + (100 / n);
			JOptionPane.showMessageDialog(null, answer);
		}
		catch (ArithmeticException e) { // ���� ó�� ��� - ���� �߻����� �� ��� ó���� ������
			JOptionPane.showMessageDialog(null, e.getMessage() + " : 0���� ���� �� �����ϴ�.");
		}
	}
	
	private static int readInt() {
		int n;
		String input = JOptionPane.showInputDialog("������ �ּ���. 100���� ������ �帳�ϴ�.");
		
		// NumberFormatException ���� ó�� - ������ �ƴ� �� ��� ó���� ������
		try {
			n = Integer.parseInt(input.trim());
		}
		catch (NumberFormatException e){
			JOptionPane.showMessageDialog(null, e.getMessage() + " ������ �ƴմϴ�.");
			n = readInt(); // ��õ�
		}
		return n;
	}
	
}