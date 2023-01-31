import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class ShowMap extends JPanel{
	
	// 마우스를 클릭하면 좌표값을 GameMethod 클래스에 전달하기 위해 존재하는 클래스
	
	private MapSize size;
	private GameMethod gm;
	private final int STONE_SIZE = 28; // 오목 돌 크기 설정
	
	public ShowMap(MapSize ms, GameMethod gm) { // Constructor (생성자)
		setBackground(new Color(206, 167, 61)); 
		size = ms;
		setLayout(null);
		this.gm = gm;
	}

	@Override
	public void paintComponent(Graphics g) { // 바둑판과 바둑돌을 그리는 메소드
		super.paintComponent(g);
		g.setColor(Color.BLACK); 
		board(g);
		drawStone(g); 
	}
	
	public void board(Graphics g) { // 바둑판을 그리기 위한 메소드
		for (int i = 1; i <= size.getSize(); i++){
			g.drawLine(size.getCell(), i*size.getCell(), 
					size.getCell()*size.getSize(), i*size.getCell()); 
			g.drawLine(i*size.getCell(), size.getCell(), 
					i*size.getCell() , size.getCell()*size.getSize()); 
		}
	}
	
	public void drawStone(Graphics g) { // 바둑돌을 그리기 위한 메소드
			for (int y = 0; y < size.getSize(); y++){
				for (int x = 0; x < size.getSize(); x++){
					if (gm.getMap()[y][x] == 1)
						drawBlack(g, x, y+1);
					else if (gm.getMap()[y][x] == 2)
						drawWhite(g, x, y+1);
					else if (gm.getMap()[y][x] == 3)
						drawRed(g, x, y+1);
				}
			}
	}
	
	public void drawBlack(Graphics g, int x, int y){ // 흑돌 그리기 메소드
		g.setColor(Color.BLACK);
		g.fillOval(x*size.getCell()+15, y*size.getCell()-15, STONE_SIZE, STONE_SIZE);
	}
	
	public void drawWhite(Graphics g, int x, int y){ // 백돌 그리기 메소드
		g.setColor(Color.WHITE);
		g.fillOval(x*size.getCell()+15, y*size.getCell()-15, STONE_SIZE, STONE_SIZE);
	}
	
	public void drawRed(Graphics g, int x, int y){ // 적돌 그리기 메소드
		g.setColor(Color.RED);
		g.fillOval(x*size.getCell()+15, y*size.getCell()-15, STONE_SIZE, STONE_SIZE);
	}
	
}