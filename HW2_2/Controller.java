import java.time.LocalDate;
import java.time.Period;

public class Controller {
	
	public void controlXmas(Model m, ViewOut o) {
		Period p = m.countdownXmas();
		o.showCountdownXmas(p);
	}
	
	public void control(Model m, ViewIn i, ViewOut o) {
		LocalDate d0 = i.getDate("년, 월, 일을 차례로 입력해주세요.");
		LocalDate d100 = m.hundredDaysFrom(d0);
		o.showDate(d0, d100);
	}
	
}