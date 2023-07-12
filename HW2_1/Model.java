import java.time.LocalDate;
import java.time.Period;

// ���� 1: ���÷κ��� 100�� �ڴ� �� �� �� �� �� ������ �����ֱ�

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
	
}