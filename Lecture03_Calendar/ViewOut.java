import java.time.LocalDate;
import java.time.Period;

public class ViewOut {
	
	void showCountdownXmas(Period p) {
		int months = p.getMonths();
        int days = p.getDays();
        
        String message = "금년 크리스마스까지 " + months + "달 하고 " + days + "일 남았다!";
        System.out.println(message);
	}
	
	void showCountdown(LocalDate d, Period p) {
		int year = d.getYear();
		int month = d.getMonthValue();
        int day = d.getDayOfMonth();
        
        int years = p.getYears();
        int months = p.getMonths();
        int days = p.getDays();
        
        String message = year + "년 " + month + "월 " + day + "일까지 ";
        message += years + "년 " + months + "달 " + days + "일 남았습니다.";
        System.out.println(message);
	}
	
}