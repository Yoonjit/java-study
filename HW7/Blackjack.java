import javax.swing.JOptionPane;

public class Blackjack {

	public static void main(String[] args) {
		
      Dealer d = new Dealer();
      
      String input = JOptionPane.showInputDialog("�÷��̾��� �̸��� �Է��ϼ���");      
      HumanPlayer p = new HumanPlayer(1, input);
      
      d.dealTo(p);
      
      Card[] hand = p.hand();
      
      for (int i = 0; i < hand.length; i++) {
          System.out.println(hand[i].suit() + " " + hand[i].rank());
      }
      
	}

}