import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class ClockWriter2 extends JPanel {
	// 필드 변수는 외부에서 접근이 불가능하게 해야 함 = private
	private final int SIZE; // final 변수: 한 번 설정되면 안 바뀜(대문자)
	
    public ClockWriter2(int size) { // 생성 메소드!!!
    	// 이제 모든 값을 SIZE를 이용해 나타낼 수 있음
    	SIZE = size;
    	JFrame frame = new JFrame(); // 창 생성, JFrame 객체인 frame 생성
        
        // 내가(this) JPanel 자체가 되겠다 = 모든 기능 갖고 있게 됨 = 그림 그릴 준비
        frame.getContentPane().add(this);
        
        frame.setTitle("Clock"); // 창 이름
        frame.setSize(SIZE + 50, SIZE + 150); // 창 크기 가로, 세로
        frame.setVisible(true); // 창 보여주기, false는 안 보여줌
        
        // 창을 닫아도 프로세서는 그대로 존재, 실행 중인 프로세스 완전히 종료
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    
    // 자동으로 창을 다시 그려주는(실행되는) 메소드: 창을 닫았다가 열었을 때, 창을 이동시킬 때...)
    // -> 그림 그린 거를 전부 이 메소드 안에 넣어놔야 함
    // "메소드 오버라이딩: 메소드 덧씌우기"
    // 똑같은 기능을 부모가 갖고 있지만 그거 안 쓰고 내 꺼 쓴다
    // 상속을 받아도 무효가 되는 것, 부모 꺼를 걍 내 꺼로 만듦
    public void paintComponent(Graphics g) {
    	// 도화지에 그림을 그릴 펜의 색상
    	g.setColor(Color.MAGENTA);
    	
    	// 왼쪽 상단으로부터 가로, 세로 떨어진 곳에서 메시지 시작
    	g.drawString("\"TIME IS GOLD\"", 105, 50); 
    	
    	// 안이 채워진 사각형 그리기 (가로 좌표, 세로 좌표, 가로 길이, 세로 길이)
    	g.setColor(Color.BLUE);
    	g.fillRect(25, 100, 250, 250);
    	
    	// 안이 비워진 사각형 그리기 (가로 좌표, 세로 좌표, 가로 길이, 세로 길이)
    	g.setColor(Color.RED);
    	g.drawRect(25, 100, 250, 250);
    	
    	// 안이 채워진 원, 타원 그리기 (가로 좌표, 세로 좌표, 가로 길이, 세로 길이)
    	g.setColor(Color.YELLOW);
    	g.fillOval(25, 100, 250, 250);
    	
    	// 안이 비워진 원, 타원 그리기 (가로 좌표, 세로 좌표, 가로 길이, 세로 길이)
    	g.setColor(Color.GREEN);
    	g.drawOval(25, 100, 250, 250);
    	
    	// 수평인 선 그리기 (점 x1 좌표, 점 y1 좌표, 점 x2 좌표, 점 y2 좌표)
    	g.setColor(Color.BLACK);
    	g.drawLine((25 + 250/2), (100 + 250/2) , (25 + 250/2), 100);
    	
    	// 대각선 그리기 (점 x1 좌표, 점 y1 좌표, 점 x2 좌표, 점 y2 좌표)
    	// 반지름의 길이가 2인 원주 = 2*PI, 반원의 원주는 PI
    	// 반원에서 PI/6, 그을 선분의 길이 125
    	int x1 = (25 + 250/2);
    	int y1 = (100 + 250/2);
    	int x2 = x1 + (int)(125 * Math.cos(Math.PI / 6)); // x 좌표 cos
    	int y2 = y1 + (int)(125 * Math.sin(Math.PI / 6)); // y 좌표 sin
    	g.setColor(Color.BLACK);
    	g.drawLine(x1, y1 , x2, y2);
    }

    
    // test code - 클래스를 테스트 해볼 수 있음
    public static void main(String[] args) { // 호출 메소드!!!
        new ClockWriter2(250); // ClockWriter2 객체 만듦 > 클래스 만들어짐 > 메소드 실행
    }
    
}