import javax.swing.JOptionPane;

public class DialogReader { // ������ �޾ƿ��� ������ �ϰ� �� �Ϸ�, ����ó���� �ϰ� �Ϸ�

	public String readString(String prompt) {
		return JOptionPane.showInputDialog(prompt);
	}
	
	public int readInt(String prompt) { // ���� ���� ó��
		int n;
		String input = readString(prompt);
		
		try {
			n = Integer.parseInt(input.trim());
		}
		catch (NumberFormatException e){
			JOptionPane.showMessageDialog(null, e.getMessage() + " ������ �ƴմϴ�.");
			n = readInt(prompt);
		}
		
		return n;
	}
	
	public double readDouble(String prompt) { // �Ǽ� ���� ó��
		double n;
		String input = readString(prompt);
		
		try {
			n = Double.parseDouble(input.trim());
		}
		catch (NumberFormatException e){
			JOptionPane.showMessageDialog(null, e.getMessage() + " �Ǽ��� �ƴմϴ�.");
			n = readDouble(prompt); // ��õ�
		}
		
		return n;
	}
	
}