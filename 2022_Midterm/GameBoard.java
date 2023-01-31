import java.awt.Color; // 미완성
import java.util.Random;

public class GameBoard {
    
    private Cell[][] square; // 16칸 설정
    private int point; // 드러나있는 칸의 개수
    
    public Cell[][] square() { // 객체 만들었음 - 게임판
        return square; // 객체 반환
    }
    
    public int point() { // 객체 만들었음 - 짝꿍 찾았는지 저장
        return point; // 객체 반환
    }
    
    public void upgrade() { // 2개 같은 거 찾으면 드러나는 칸의 수가 2개니까 2점 더하기
        point += 2; 
    }
    
    public GameBoard() {
    	// 2차원 배열 생성
        square = new Cell[4][4];
        
        // 색깔 8가지를 지정해서 배열에 저장
        Color[] colors = {Color.BLUE, Color.CYAN, Color.PINK, Color.RED, 
                          Color.GRAY, Color.GREEN, Color.MAGENTA, Color.ORANGE};
        
        // 색깔별로 2개의 원(cell) 객체 만들어서 1차원 배열에 저장
        Cell[] twins = createTwinCells(colors);
        
        // 1차원 배열을 무작위로 섞은 뒤 2차원 배열에 다시 배치
        makeSquare(shuffle(twins));
    }
    
    private void makeSquare(Cell[] cells) {
        // to be filled... - 1차원 cell 배열을 필드 변수 square 2차원 배열에 다시 배치
    	for(int i=0; i<4; i++) {
    		for(int j=0; j<4; j++) {
    			square[i][j] = cells[];
    		}
    	}
    }
    
    private Cell[] createTwinCells(Color[] cs) {
        // to be filled... - 인수 배열로 주어진 색깔별로 2개씩 cell 객체를 만들어서 1차원 배열로 모아 리턴
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