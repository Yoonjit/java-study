import java.time.LocalDate;

import javax.swing.JOptionPane;

public class ViewIn {
	
	public LocalDate getDate(String message) {
		String input = JOptionPane.showInputDialog(message + "\n��?");
		int year = Integer.parseInt(input);
		
		input = JOptionPane.showInputDialog(message + "\n��?");
		int month = Integer.parseInt(input);
		
		input = JOptionPane.showInputDialog(message + "\n��?");
		int day = Integer.parseInt(input);
		
		return LocalDate.of(year, month, day);
	}
	
}