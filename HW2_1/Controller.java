import java.time.LocalDate;
import java.time.Period;

public class Controller {
	
	public void controlXmas(Model m, ViewOut o) {
		Period p = m.countdownXmas();
		o.showCountdownXmas(p);
	}
	
	public void control(Model m, ViewIn i, ViewOut o) {
		LocalDate h = m.hundredDaysFromToday();
		o.showDate(h);
	}
	
}