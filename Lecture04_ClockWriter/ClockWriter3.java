import java.awt.Color;
import java.awt.Graphics;
import java.time.LocalTime;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class ClockWriter3 extends JPanel {
	// 필드 변수는 외부에서 접근이 불가능하게 해야 함 = private
	private final int SIZE; // final 변수: 한 번 설정되면 안 바뀜(대문자)
	private int diameter; // 동심원을 위한 필드 변수
	private final int MARGIN; // 사용자 편의를 위해 설정

    public ClockWriter3(int size, int rate) { // 생성 메소드!!!
    	// 이제 모든 값을 SIZE를 이용해 나타낼 수 있음
    	SIZE = size;
    	MARGIN = SIZE / rate;
    	
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
    	// 왼쪽 상단으로부터 가로, 세로 떨어진 곳에서 메시지 시작
    	g.setColor(Color.BLUE);
    	g.drawString("\"TIME IS GOLD\"", 105, 50); 
    	
    	// 안이 채워진 원, 타원 그리기 (가로 좌표, 세로 좌표, 가로 길이, 세로 길이)
    	g.setColor(Color.LIGHT_GRAY);
    	g.fillOval(25, 100, SIZE, SIZE);
    	
    	// 현재 시간 알아보기
    	LocalTime now = LocalTime.now();
    	
    	// 시계의 중심 (원의 중심)
    	int radius = SIZE / 2; // SIZE는 원의 지름
    	int x1 = 25 + radius;
    	int y1 = 100 + radius;
    	// int diff = radius / 5;
    	
    	// 자라나는 동심원 그리기 - 분침, 시침을 가리면 안 되므로 그 전에 그리기
     	// 동심원의 크기가 계속 커지기 때문에 현재 지름의 상태를 저장해두어야 함
     	// 다음 동심원은 이전보다 얼마나 더 커질 건지 설정해두어야 함
     	// 이런 걸 기억할 친구 = 필드 변수!
    	int base = (SIZE - diameter) / 2;
    	g.setColor(Color.PINK);
    	g.fillOval(25+base, 100+base, diameter, diameter);
    	diameter = (diameter >= SIZE) ? 0 : diameter + MARGIN;
    	
    	// 분침 그리기
    	radius -= 30; // 30픽셀 만큼 짧게
    	// now.getMinute() - 15: 일단 각도를 구해야 함
    	// 원 전체 1/60도 (60분이니까), 2PI를 60으로 나누면 됨 = PI를 30으로 나누면 됨
    	// 그리고 중심에서부터 오른쪽 수직인 방향부터 좌표 잡아야 함(sin, cos 직각삼각형)
    	// >> 15분 위치에서부터 구해야 함
    	// 참고로 sin, cos은 double 타입을 반환해줌
    	double minute_angle = (now.getMinute() - 15) * Math.PI / 30;
    	int x2 = x1 + (int)(radius * Math.cos(minute_angle));
     	int y2 = y1 + (int)(radius * Math.sin(minute_angle));
     	g.setColor(Color.RED);
     	g.drawLine(x1, y1, x2, y2);
     	
     	// 시침 그리기
     	radius -= 30; // 분침에서 30픽셀 만큼 더 짧게
     	// now.getHour() - 3: 얘도 각도를 구해야 함
     	// 원 전체 1/12도 (12시간이니까), 2PI를 12로 나누면 됨 = PI를 6으로 나누면 됨
     	// 그리고 중심에서부터 오른쪽 수직인 방향부터 좌표 잡아야 함(sin, cos 직각삼각형)
    	// >> 3시 위치에서부터 구해야 함
     	double hour_angle = (now.getHour() - 3) * Math.PI / 6 + minute_angle / 12;
     	x2 = x1 + (int)(radius * Math.cos(hour_angle));
     	y2 = y1 + (int)(radius * Math.sin(hour_angle));
     	g.setColor(Color.YELLOW);
     	g.drawLine(x1, y1, x2, y2);	
    }

    
    // test code - 클래스를 테스트 해볼 수 있음
    public static void main(String[] args) { // 호출 메소드!!!
        new ClockWriter3(250, 5); // ClockWriter3 객체 만듦 > 클래스 만들어짐 > 메소드 실행
    }
    
}