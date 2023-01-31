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
	
}