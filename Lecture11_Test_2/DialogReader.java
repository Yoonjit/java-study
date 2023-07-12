import javax.swing.JOptionPane;

public class DialogReader { // 데이터 받아오는 역할을 니가 다 하렴, 예외처리도 니가 하렴

	public String readString(String prompt) {
		return JOptionPane.showInputDialog(prompt);
	}
	
	public int readInt(String prompt) { // 정수 예외 처리
		int n;
		String input = readString(prompt);
		
		try {
			n = Integer.parseInt(input.trim());
		}
		catch (NumberFormatException e){
			JOptionPane.showMessageDialog(null, e.getMessage() + " 정수가 아닙니다.");
			n = readInt(prompt);
		}
		
		return n;
	}
	
	public double readDouble(String prompt) { // 실수 예외 처리
		double n;
		String input = readString(prompt);
		
		try {
			n = Double.parseDouble(input.trim());
		}
		catch (NumberFormatException e){
			JOptionPane.showMessageDialog(null, e.getMessage() + " 실수가 아닙니다.");
			n = readDouble(prompt); // 재시도
		}
		
		return n;
	}
	
}