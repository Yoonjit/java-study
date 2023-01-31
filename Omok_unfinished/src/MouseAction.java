import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;

public class MouseAction extends MouseAdapter{
	
	// 마우스 클릭 액션에 대한 정보를 담은 클래스
	
	private GameMethod gm;
	private MapSize ms;
	private ShowMap sm;
	private GameSize gs;
	public int winner; // 승리한 게임 플레이어를 기억
	public int[] score_2 = { 0, 0 }; // 순서대로 흑돌, 백돌의 스코어
	public int[] score_3 = { 0, 0, 0 }; // 순서대로 흑돌, 백돌, 적돌의 스코어
	
	public MouseAction(GameMethod gm, MapSize ms, ShowMap sm, GameSize gs) {
		
		// Constructor (생성자)
		
		this.gm = gm;
		this.ms = ms;
		this.sm = sm;
		this.gs = gs;
	}
	
	@Override
	public void mousePressed(MouseEvent me) { // 마우스 클릭시 보여줄 액션에 대한 메소드
		int x = (int)Math.round(me.getX()/(double) ms.getCell()) - 1;
		int y = (int)Math.round(me.getY()/(double) ms.getCell()) - 2;
		
		if (gm.checkInput(y, x) == false) {
			return;
		}
		
		Stone s = new Stone(y, x, gm.getCun_GamePlayer());
		gm.inputWord(s);
		gm.nextPlayer(gm.getCun_GamePlayer());
		sm.repaint();
		
		if (gm.endGame(s) == true) {
			String victory;
			
			if (s.getColor() == 1) {
				winner = 0;
				victory = "흑돌 승리!";
			}
			else if (s.getColor() == 2) {
				winner = 1;
				victory = "백돌 승리!";
			}
			else {
				winner = 2;
				victory = "적돌 승리!";
			}
			
			showWin(victory);
			scoreRecord(winner);
			showRecord();
			
			int replay = JOptionPane.showConfirmDialog(null, "게임을 다시 하시겠습니까?",
											"재시작", JOptionPane.YES_NO_OPTION);
			
			if (replay == JOptionPane.CLOSED_OPTION) { // X를 눌러 창을 닫았을 경우
				System.exit(0);
			}
			else if (replay == JOptionPane.YES_OPTION) { // Yes를 눌렀을 경우
				gm.init();
				sm.repaint();
				new NumberFrame(gm);
			}
			else { // No를 눌렀을 경우
				System.exit(0);
			}
			
		}
	}
	
	public void showWin(String s) { // 승리 플레이어를 창으로 띄워 보여줄 메소드
		JOptionPane.showMessageDialog(gs, s, "", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void scoreRecord(int w) { // 승리 플레이어의 점수를 증가시키는 메소드
		if (gm.getGamePlay_cnt() == 3) { // 세 명이서 플레이 했을 때
			score_3[w]++;
		}
		else if(gm.getGamePlay_cnt() == 2) { // 두 명이서 플레이 했을 때
			score_2[w]++;
		}
    }
	
	public void showRecord() { // 게임 결과(점수판)을 출력하는 메소드
		if (gm.getGamePlay_cnt() == 3) { // 세 명이서 플레이 했을 때
			System.out.println("3인 모드 결과: " 
								+ "흑돌 점수 " +  score_3[0] 
								+ " 백돌 점수 " + score_3[1] 
								+ " 적돌 점수 " + score_3[2]);
		}
		else if(gm.getGamePlay_cnt() == 2) { // 두 명이서 플레이 했을 때
			System.out.println("2인 모드 결과: "
								+ "흑돌 점수 " + score_2[0] 
								+ " 백돌 점수 " + score_2[1]);
		}
	}
	
}