import javax.swing.JOptionPane;

public class View {
	
	public static int inputP() {
		String message1 = "투자 원금을 원 단위로 입력해주세요.";
    	String input1 = JOptionPane.showInputDialog(message1);
    	int p = Integer.parseInt(input1);
    	return p;
	}
    	
	public static int inputN() {
		String message2 = "투자 기간을 월 단위로 입력해주세요.";
    	String input2 = JOptionPane.showInputDialog(message2);
    	int n = Integer.parseInt(input2);
    	return n;
	}
    	
	public static double inputI() {
		String message3 = "월 수익률을 % 단위로 입력해주세요.";
    	String input3 = JOptionPane.showInputDialog(message3);
    	double i = (Double.parseDouble(input3)) / 100;
    	return i;
	}	
    
}