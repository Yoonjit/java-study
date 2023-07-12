
public class BlackjackCardGame {

	public static void main(String[] args) {
		
		Dealer dealer = new Dealer();
		new BlackjackController(dealer).manageBlackjack();

	}

}
