import javax.swing.JOptionPane;

public class ComputerPlayer extends CardPlayer implements CardPlayerBehavior {

	public ComputerPlayer(int max_cards) {
		super(max_cards);
  }
	
	public boolean wantsACard() {
        String response = JOptionPane.showInputDialog("�� �� �� �帱���? (Y/N)");
        return response.equals("Y");
    }
}
