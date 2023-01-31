public class Omok {
	
	// 오목 게임을 실행하는 클래스
	
	public static void main(String[] args) {
		GameMethod gm = new GameMethod();
		GameSize gs = new GameSize("오목", gm);
		NumberFrame nf = new NumberFrame(gm);
	}
	
}