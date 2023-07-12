import java.time.LocalDate;
import java.time.Period;

public class ViewOut {
	
	void showCountdownXmas(Period p) {
		int months = p.getMonths();
        int days = p.getDays();
        
        String message = "�ݳ� ũ������������ " + months + "�� �ϰ� " + days + "�� ���Ҵ�!";
        System.out.println(message);
	}
	
	void showCountdown(LocalDate d, Period p) {
		int year = d.getYear();
		int month = d.getMonthValue();
        int day = d.getDayOfMonth();
        
        int years = p.getYears();
        int months = p.getMonths();
        int days = p.getDays();
        
        String message = year + "�� " + month + "�� " + day + "�ϱ��� ";
        message += years + "�� " + months + "�� " + days + "�� ���ҽ��ϴ�.";
        System.out.println(message);
	}
	
	void showDate(LocalDate d0, LocalDate d100) {
		int year = d0.getYear();
		int month = d0.getMonthValue();
        int day = d0.getDayOfMonth();
        
        int years = d100.getYear();
		int months = d100.getMonthValue();
        int days = d100.getDayOfMonth();
        
        String message = year + "�� " + month + "�� " + day + "�Ϸκ��� 100�� �ڴ� ";
        message += years + "�� " + months + "�� " + days + "���Դϴ�.";
        System.out.println(message);
	}
	
}