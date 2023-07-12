import java.time.LocalDate;
import java.time.Period;

// 올해 크리스마스까지 몇 달 몇 일 남았는지 콘솔창에 출력하기 - 모델, 뷰아웃, 컨트롤러, 캘린더
// 특정 날짜(n년 n월 n일)를 '입력받아' 오늘로부터 몇 년 몇 달 몇 일 남았는지 팝업으로 출력하기 - MVC 아키텍처에 뷰인 추가

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