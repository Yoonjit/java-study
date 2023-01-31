public class Player { // �� Ŭ���� 2
	
	private String name; // �÷��̾� �̸�
	private int points; // �̱� �� Ƚ��
	private Dice rolled; // ��� ���� �ֻ���
	private boolean wins; // ��� ���� �ֻ����� �̰����� TRUE, ������ FALSE
	
	public String name() { return name; }
	public int points() { return points; }
	public Dice rolled() { return rolled; }
	public boolean wins() { return wins; }
	
	public Player(String n) { // �÷��̾��� �̸��� �μ��� �޾� ����ϴ� �޼ҵ�
		name = n;
	}
	
	public void play(Dice d) { // �ֻ����� ���� ����� �μ��� �޾� ����ϴ� �޼ҵ�
		d.rollDice();
		rolled = d;
	}
	
	public void receivePoint() { // point ���� 1 ������Ŵ
		points += 1;
		wins = true; // wins�� true�� �����Ͽ� �̰����� ����ϴ� �޼ҵ�
	}
	
	public void reset() { 
		wins = false; // ���� ������ ���� wins�� false�� �ٽ� �����Ͽ� �̱� ��� ����
	}

}