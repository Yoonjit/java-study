import javax.swing.JOptionPane;

public class PurseReader {
	
	public char readRequest(String message) {
		String input = JOptionPane.showInputDialog(message);
		return input.charAt(0);
	}
	
	public int readAmount(String message) {
		String input = JOptionPane.showInputDialog(message);
		input = input.trim();
		
		if (input.length() > 0) {
			return Integer.parseInt(input);
		}
		else {
			JOptionPane.showMessageDialog(null, "�ݾ� �Է� ����");
			return 0;
		}
	}
	
	// test
	public static void main(String[] args) {
		System.out.println();
	}
	
}