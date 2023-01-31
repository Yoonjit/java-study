import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;

public class MouseAction extends MouseAdapter{
	
	// ���콺 Ŭ�� �׼ǿ� ���� ������ ���� Ŭ����
	
	private GameMethod gm;
	private MapSize ms;
	private ShowMap sm;
	private GameSize gs;
	public int winner; // �¸��� ���� �÷��̾ ���
	public int[] score_2 = { 0, 0 }; // ������� �浹, �鵹�� ���ھ�
	public int[] score_3 = { 0, 0, 0 }; // ������� �浹, �鵹, ������ ���ھ�
	
	public MouseAction(GameMethod gm, MapSize ms, ShowMap sm, GameSize gs) {
		
		// Constructor (������)
		
		this.gm = gm;
		this.ms = ms;
		this.sm = sm;
		this.gs = gs;
	}
	
	@Override
	public void mousePressed(MouseEvent me) { // ���콺 Ŭ���� ������ �׼ǿ� ���� �޼ҵ�
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
				victory = "�浹 �¸�!";
			}
			else if (s.getColor() == 2) {
				winner = 1;
				victory = "�鵹 �¸�!";
			}
			else {
				winner = 2;
				victory = "���� �¸�!";
			}
			
			showWin(victory);
			scoreRecord(winner);
			showRecord();
			
			int replay = JOptionPane.showConfirmDialog(null, "������ �ٽ� �Ͻðڽ��ϱ�?",
											"�����", JOptionPane.YES_NO_OPTION);
			
			if (replay == JOptionPane.CLOSED_OPTION) { // X�� ���� â�� �ݾ��� ���
				System.exit(0);
			}
			else if (replay == JOptionPane.YES_OPTION) { // Yes�� ������ ���
				gm.init();
				sm.repaint();
				new NumberFrame(gm);
			}
			else { // No�� ������ ���
				System.exit(0);
			}
			
		}
	}
	
	public void showWin(String s) { // �¸� �÷��̾ â���� ��� ������ �޼ҵ�
		JOptionPane.showMessageDialog(gs, s, "", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void scoreRecord(int w) { // �¸� �÷��̾��� ������ ������Ű�� �޼ҵ�
		if (gm.getGamePlay_cnt() == 3) { // �� ���̼� �÷��� ���� ��
			score_3[w]++;
		}
		else if(gm.getGamePlay_cnt() == 2) { // �� ���̼� �÷��� ���� ��
			score_2[w]++;
		}
    }
	
	public void showRecord() { // ���� ���(������)�� ����ϴ� �޼ҵ�
		if (gm.getGamePlay_cnt() == 3) { // �� ���̼� �÷��� ���� ��
			System.out.println("3�� ��� ���: " 
								+ "�浹 ���� " +  score_3[0] 
								+ " �鵹 ���� " + score_3[1] 
								+ " ���� ���� " + score_3[2]);
		}
		else if(gm.getGamePlay_cnt() == 2) { // �� ���̼� �÷��� ���� ��
			System.out.println("2�� ��� ���: "
								+ "�浹 ���� " + score_2[0] 
								+ " �鵹 ���� " + score_2[1]);
		}
	}
	
}