import javax.swing.JOptionPane;

public class View {
	
	public static int inputP() {
		String message1 = "���� ������ �� ������ �Է����ּ���.";
    	String input1 = JOptionPane.showInputDialog(message1);
    	int p = Integer.parseInt(input1);
    	return p;
	}
    	
	public static int inputN() {
		String message2 = "���� �Ⱓ�� �� ������ �Է����ּ���.";
    	String input2 = JOptionPane.showInputDialog(message2);
    	int n = Integer.parseInt(input2);
    	return n;
	}
    	
	public static double inputI() {
		String message3 = "�� ���ͷ��� % ������ �Է����ּ���.";
    	String input3 = JOptionPane.showInputDialog(message3);
    	double i = (Double.parseDouble(input3)) / 100;
    	return i;
	}	
    
}