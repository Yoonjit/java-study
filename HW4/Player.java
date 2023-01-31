public class Player { // 모델 클래스 2
	
	private String name; // 플레이어 이름
	private int points; // 이긴 총 횟수
	private Dice rolled; // 방금 굴린 주사위
	private boolean wins; // 방금 굴린 주사위로 이겼으면 TRUE, 졌으면 FALSE
	
	public String name() { return name; }
	public int points() { return points; }
	public Dice rolled() { return rolled; }
	public boolean wins() { return wins; }
	
	public Player(String n) { // 플레이어의 이름을 인수로 받아 기억하는 메소드
		name = n;
	}
	
	public void play(Dice d) { // 주사위를 굴린 결과를 인수로 받아 기억하는 메소드
		d.rollDice();
		rolled = d;
	}
	
	public void receivePoint() { // point 값을 1 증가시킴
		points += 1;
		wins = true; // wins를 true로 지정하여 이겼음을 기억하는 메소드
	}
	
	public void reset() { 
		wins = false; // 다음 게임을 위해 wins를 false로 다시 지정하여 이긴 기록 삭제
	}

}