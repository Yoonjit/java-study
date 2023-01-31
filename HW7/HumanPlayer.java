import javax.swing.JOptionPane;

public class HumanPlayer extends CardPlayer implements CardPlayerBehavior {

	public String name;
	private int chips;
	CardPlayer c;
	
	public HumanPlayer(int max_cards, String n) {
		super(max_cards);
		name = n;
	}
	
	public boolean wantsACard() {
        String response = JOptionPane.showInputDialog("�� �� �� �帱���? (Y/N)");
        return response.equals("Y");
    }
	
	public void youWin() {
		if (c.totalScore() == 21) {
			JOptionPane.showMessageDialog(null, "����! �մ� �¸�");
		}
		
	}
	
	public void youWinBlackjack() {
		
	}
	
	public void youlose() {
		
	}
	
	public void youDraw() {
		
	}
	
	public int chips() {
		return chips;
	}
	
}
