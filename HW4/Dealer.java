public class Dealer { // 컨트롤러

	private Player player1;
	private Player player2;
	private Player player;
	
	private GameBoard gameboard;
	
	private Registrar registrar;

	void dealDiceGame(Player p1, Player p2, GameBoard b, Registrar r) {
		player1 = p1;
		player2 = p2;
		player = p1;
		
		gameboard = b;
		registrar = r;
		
		p1.rolled();
	}

}