import java.time.LocalDate;
import java.time.Period;

// 문제 2: 특정 날짜를 입력받아 그 날짜로부터 100일 뒤는 몇 년 몇 월 몇 일인지 보여주기

public class Model {
	
	public Period countdownXmas() {
		LocalDate today = LocalDate.now();
		int year = today.getYear();
		LocalDate xmas = LocalDate.of(year, 12, 25);
		return Period.between(today, xmas);
	}
	
	public Period countdown(LocalDate d) {
		LocalDate today = LocalDate.now();
		return Period.between(today, d);
	}
	
	public LocalDate hundredDaysFromToday() {
		LocalDate today = LocalDate.now();
		LocalDate hundred = today.plusDays(100);
		return hundred;
	}
	
	public LocalDate hundredDaysFrom(LocalDate d0) {
		LocalDate d100 = d0.plusDays(100);
		return d100;
	}
	
}