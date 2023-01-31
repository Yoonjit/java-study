import javax.swing.JOptionPane;

public class Controller {
	
	public void control() {
		int p = View.inputP();
		int n = View.inputN();
		double i = View.inputI();
		int total = Model.calculation(p, n, i);
    	JOptionPane.showMessageDialog(null, n + "개월 후 받으실 금액은 " + total + "원 입니다.");
	}
	
}