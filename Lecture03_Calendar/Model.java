import java.time.LocalDate;
import java.time.Period;

// ���� ũ������������ �� �� �� �� ���Ҵ��� �ܼ�â�� ����ϱ� - ��, ��ƿ�, ��Ʈ�ѷ�, Ķ����
// Ư�� ��¥(n�� n�� n��)�� '�Է¹޾�' ���÷κ��� �� �� �� �� �� �� ���Ҵ��� �˾����� ����ϱ� - MVC ��Ű��ó�� ���� �߰�

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
	
}