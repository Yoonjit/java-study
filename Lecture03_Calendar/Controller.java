import java.time.LocalDate;
import java.time.Period;

public class Controller {
	
	public void controlXmas(Model m, ViewOut o) {
		Period p = m.countdownXmas();
		o.showCountdownXmas(p);
	}
	
	public void control(Model m, ViewIn i, ViewOut o) {
		LocalDate d = i.getDate("��, ��, ���� ���ʷ� �Է����ּ���.");
		Period p = m.countdown(d);
		o.showCountdown(d, p);
	}
	
}