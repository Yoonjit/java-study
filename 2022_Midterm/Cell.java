import java.awt.Color; // 완성

public class Cell {
    
    private Color color; // 원의 색깔
    private boolean revealed; // 숨어있으면 거짓, 드러났으면 참
    
    public Cell(Color c) { // 원의 색을 c로 지정함
        color = c;
    }
    
    public Color color() { // 원의 색이 무엇인지 알려줌
        return color; 
    }

    public boolean revealed() { // 드러났는지 숨어있는지 드러내는 메소드
        return revealed; 
    }
    
    public void reveal() { // 드러남
        revealed = true;
    }
    
    public void hide() { // 숨음
        revealed = false;
    }
    
    public boolean isATwinWith(Cell c) { // c의 색깔과 같은지 다른지 리턴하기
    	return color.equals(c.color());
    }

}