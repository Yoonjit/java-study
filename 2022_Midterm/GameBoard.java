import java.awt.Color; // �̿ϼ�
import java.util.Random;

public class GameBoard {
    
    private Cell[][] square; // 16ĭ ����
    private int point; // �巯���ִ� ĭ�� ����
    
    public Cell[][] square() { // ��ü ������� - ������
        return square; // ��ü ��ȯ
    }
    
    public int point() { // ��ü ������� - ¦�� ã�Ҵ��� ����
        return point; // ��ü ��ȯ
    }
    
    public void upgrade() { // 2�� ���� �� ã���� �巯���� ĭ�� ���� 2���ϱ� 2�� ���ϱ�
        point += 2; 
    }
    
    public GameBoard() {
    	// 2���� �迭 ����
        square = new Cell[4][4];
        
        // ���� 8������ �����ؼ� �迭�� ����
        Color[] colors = {Color.BLUE, Color.CYAN, Color.PINK, Color.RED, 
                          Color.GRAY, Color.GREEN, Color.MAGENTA, Color.ORANGE};
        
        // ���򺰷� 2���� ��(cell) ��ü ���� 1���� �迭�� ����
        Cell[] twins = createTwinCells(colors);
        
        // 1���� �迭�� �������� ���� �� 2���� �迭�� �ٽ� ��ġ
        makeSquare(shuffle(twins));
    }
    
    private void makeSquare(Cell[] cells) {
        // to be filled... - 1���� cell �迭�� �ʵ� ���� square 2���� �迭�� �ٽ� ��ġ
    	for(int i=0; i<4; i++) {
    		for(int j=0; j<4; j++) {
    			square[i][j] = cells[];
    		}
    	}
    }
    
    private Cell[] createTwinCells(Color[] cs) {
        // to be filled... - �μ� �迭�� �־��� ���򺰷� 2���� cell ��ü�� ���� 1���� �迭�� ��� ����
    	Cell cell1;
    	Cell cell2;
    	Cell cells;
    	for(int i=0; i<8; i++) {
    		cells
    	}
    	return cells;
    }
    
    private Cell[] shuffle(Cell[] twins) {
        int index;
        Cell temp;
        Random random = new Random();
        for (int i = twins.length - 1; i > 0; i--) {
            index = random.nextInt(i+1);
            temp = twins[index];
            twins[index] = twins[i];
            twins[i] = temp;
        }
        return twins;
    }

}