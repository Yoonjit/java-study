import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class GameMethod {
	
	// ���� ���� ������ ���� �˰����� �ִ� Ŭ����
	// ���콺�� ���� �� ��ǥ���� ���� ������ Map[][] ������ ���� �÷��̾��� �ٵϵ��� ��ġ��
	
	private int MaxSize = 20; // �ٵ����� ���� �Ǵ� ���� ����
	private int Map[][] = new int[MaxSize][MaxSize]; // �ٵ����� 20 * 20 ������
	private int GamePlay_cnt = 2; // ���� ����� ó�� �÷��̾� �ο� �� (����Ʈ ��)
	private int cun_GamePlayer = 1; // ó�� �ٵϵ��� ���� �÷��̾��� ��ȣ (����)
	public JLabel label_0 = new JLabel(); // Ÿ�̸Ӹ� ������ ��
	public int end = 0;

	public void init() { // �ٵ����� ����� �޼ҵ�
		for (int i = 0; i < MaxSize; i++) {
			for (int j = 0; j < MaxSize; j++) {
				Map[i][j] = 0;
			}
		}
	}

	public void nextPlayer(int cun_p) { // ���� �÷��̾�� ���� �Ѿ���� �ϴ� �޼ҵ�
		
		cun_p++;
		
		if (GamePlay_cnt < cun_p) {
			cun_GamePlayer = 1;
		} 
		else {
			cun_GamePlayer = cun_p;
		}
	}
	
	public boolean endGame(Stone s) { // ���� ���� �Ǵ��� ���� �޼ҵ�
		int nowColor = s.getColor();
		int dir[][] = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 }, 
						{ -1, 1 }, { 1, -1 }, { -1, -1 }, { 1, 1 } };

		for (int i = 0; i < 8; i = i + 2) {
			int same_cnt = 1; // same_cnt�� 5�� �Ǹ� (�� �ٿ� �ٵϵ� 5��) �¸�
			int cunY = s.getY();
			int cunX = s.getX();

			for (int j = 0; j < 5; j++) {
				cunY = cunY + dir[i][0];
				cunX = cunX + dir[i][1];
				
				if (cunY < 0 || cunY >= MaxSize || cunX < 0 || cunX >= MaxSize)
					break;
				if (nowColor != Map[cunY][cunX])
					break;

				same_cnt++;
			}
			
			cunY = s.getY();
			cunX = s.getX();

			for (int j = 0; j < 5; j++) {
				cunY = cunY + dir[i + 1][0];
				cunX = cunX + dir[i + 1][1];
				
				if (cunY < 0 || cunY >= MaxSize || cunX < 0 || cunX >= MaxSize)
					break;
				if (nowColor != Map[cunY][cunX])
					break;
				
				same_cnt++;
			}

			if (same_cnt >= 5) {
				end = 1;
				return true;
			}
		}
		
		return false;
	}

	public void inputWord(Stone s) { // ���콺 Ŭ���� ���� �޾ƿ� �ٵϵ��� ������ ���� �޼ҵ�
		Map[s.getY()][s.getX()] = s.getColor();
	}

	public boolean checkInput(int y, int x) { // �ٵϵ��� ������ �� �ִ� ������ ���� �޼ҵ�
		if (Map[y][x] != 0 || y < 0 || y >= MaxSize || x < 0 || x >= MaxSize) {
			return false;
		}
		
		return true;
	}
	
	public void setGameMode(int max) { // �÷��̾� ���� ���� ������ �����ϴ� �޼ҵ�
		this.GamePlay_cnt = max;
	}
	
	public int getGamePlay_cnt() { // ���� �÷��̾��� ���� ��ȯ�ϴ� �޼ҵ�
		return GamePlay_cnt;
	}
	
	public int[][] getMap() { // �ٵ��� ������ ��ȯ�ϴ� �޼ҵ�
		return Map;
	}
	
	public int getCun_GamePlayer() { // �÷��̾��� ���� ������ ��ȯ�ϴ� �޼ҵ�
		return cun_GamePlayer;
	}
	
	public void timeLimit() { // ���� �ð��� �����ְ� �ð� �ʰ��� ���� �÷��̾� ������ �Ѿ�� �޼ҵ�
		int count = 0;
		
		if (cun_GamePlayer == 1) {
			for (int i = 11; i >= 1; i--) {
				if (cun_GamePlayer == 1) {
					try {
						Thread.sleep(1000);
					}
					catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					count++;
					Font font = new Font("���� ���", Font.PLAIN, 20);
					label_0.setFont(font);
					label_0.setText("���� �ð� " + (11-count) + "�� ���ҽ��ϴ�...");
				}
			}
				
			if (count == 11) {
				JOptionPane.showMessageDialog(null, "�ð� �ʰ�! ���� ������� �Ѿ�ϴ�.");		
				nextPlayer(cun_GamePlayer);
			}
		}
		
		else if (cun_GamePlayer == 2) {
			for (int i = 11; i >= 1; i--) {
				if (cun_GamePlayer == 2) {
					try {
						Thread.sleep(1000);
					} 
					catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					count++;
					label_0.setText("���� �ð� " + (11-count) + "�� ���ҽ��ϴ�...");
				}
			}
				
			if (count == 11) {
				JOptionPane.showMessageDialog(null, "�ð� �ʰ�! ���� ������� �Ѿ�ϴ�.");
				nextPlayer(cun_GamePlayer);
			}
		}
		
		else if (cun_GamePlayer == 3) {
			for (int i = 11; i >= 1; i--) {
				if (cun_GamePlayer == 3) {
					try {
						Thread.sleep(1000);
					}
					catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					count++;
					label_0.setText("���� �ð� " + (11-count) + "�� ���ҽ��ϴ�...");
				}
			}
				
			if (count == 11) {
				JOptionPane.showMessageDialog(null, "�ð� �ʰ�! ���� ������� �Ѿ�ϴ�.");
				nextPlayer(cun_GamePlayer);
			}
		}
	}
	
}