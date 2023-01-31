import javax.swing.JOptionPane;

public class ComputerPlayer extends CardPlayer implements CardPlayerBehavior {

	public ComputerPlayer(int max_cards) {
		super(max_cards);
  }
	
	public boolean wantsACard() {
        String response = JOptionPane.showInputDialog("한 장 더 드릴까요? (Y/N)");
        return response.equals("Y");
    }
}
