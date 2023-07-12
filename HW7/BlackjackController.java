
public class BlackjackController {
	
	private Dealer dealer;
	private HumanPlayer hand_player;
	private ComputerPlayer hand_dealer;
	
	public BlackjackController(Dealer d) {
		dealer = d;
		hand_player = new HumanPlayer(11, "Doh");
		hand_dealer = new ComputerPlayer(11);
	}
	
	
	void manageBlackjack() {
		
		dealer.dealOneTo(hand_player);
		dealer.dealOneTo(hand_dealer);
		dealer.dealOneTo(hand_player);
		dealer.dealOneTo(hand_dealer);
		int score_player = hand_player.totalScore();
		if (score_player == 21)
			hand_player.youWin();
		else if (score_player < 21) {
			dealer.dealTo(hand_player);
			score_player = hand_player.totalScore();
		}
		if (score_player > 21)
			hand_player.youLose();
		else {
			dealer.dealTo(hand_dealer);
			int score_dealer = hand_dealer.totalScore();
			if (score_dealer > 21) 
				hand_player.youWin();
			else if (score_player == score_dealer)
				hand_player.youDraw();
			else if (score_player > score_dealer)
				hand_player.youWin();
			else
				hand_player.youLose();
		}
		
	}

}
