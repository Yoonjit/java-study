import javax.swing.JOptionPane;

public class HumanPlayer extends CardPlayer implements CardPlayerBehavior{

//    public HumanPlayer(int max_cards) {
//        super(max_cards);
//    }

    public boolean wantsACard() {
        String response = JOptionPane.showInputDialog("한장 더 드릴까요? (Y/N)");
        return response.equals("Y");
    }
    
}