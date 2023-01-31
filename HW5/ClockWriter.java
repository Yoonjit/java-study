import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.WindowConstants;

public class ClockWriter extends JPanel {
	String digital;  
	String h = "";  
    String m = "";  
    String s = "";  

	private final int SIZE;
	private final int MARGIN;
	private int diameter; 
    
    public ClockWriter(int size) {
    	Calendar now = Calendar.getInstance();
    	int second = now.get(Calendar.SECOND);
    	
    	SIZE = size;
    	MARGIN = SIZE / 60;
       	diameter = (SIZE / 60) * second;
    	
    	JFrame frame = new JFrame();
        
        frame.getContentPane().add(this);
        
        frame.setTitle("Clock");
        frame.setSize(SIZE + 62, SIZE + 160);
        frame.setLocation(618, 200);
        frame.setVisible(true);
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    
        Timer timer = new Timer(1000, new ActionListener(){  
            public void actionPerformed(ActionEvent e) {  
                repaint();  
            }  
        });  
        
        timer.start();
    }
    
    public void Digital(String digitime) {  
        this.digital = digitime;  
    } 
    
    public void paintComponent(Graphics g) {   
    	Calendar rite = Calendar.getInstance();
    	int hour = rite.get(Calendar.HOUR_OF_DAY);  
        int minute = rite.get(Calendar.MINUTE);  
        int second = rite.get(Calendar.SECOND);
        
        super.paintComponent(g);
        
    	// 디지털 시계
        if (hour < 10) {this.h = "0";}  
        if (hour >= 10) {this.h = "";}
        
        if (minute < 10) {this.m = "0";}  
        if (minute >= 10) {this.m = "";}  
        
        if (second < 10) {this.s = "0";}  
        if (second >= 10) {this.s = "";}  
        
        Digital(h + hour + " :" + m + minute + " :" + s + second);
        
    	g.setColor(Color.MAGENTA);
    	g.drawString(digital, 118, 64); 
    	
    	// 아날로그 시계판
    	g.setColor(Color.LIGHT_GRAY);
    	g.fillOval(24, 100, SIZE, SIZE);
    	
    	// 아날로그 시계판의 중심
    	int radius = SIZE / 2;
    	int x1 = 24 + radius;
    	int y1 = 100 + radius;
    	
    	// 자라나는 동심원 그리기
    	int base = (SIZE - diameter) / 2;
    	g.setColor(Color.PINK);
    	g.fillOval(24+base, 100+base, diameter, diameter);
    	diameter = (diameter >= SIZE) ? 0 : diameter + MARGIN;
    	
    	// 분침 그리기
    	radius -= 30;
    	double minute_angle = (minute - 15) * Math.PI / 30;
    	int x2 = x1 + (int)(radius * Math.cos(minute_angle));
     	int y2 = y1 + (int)(radius * Math.sin(minute_angle));
     	g.setColor(Color.RED);
     	g.drawLine(x1, y1, x2, y2);
     	
     	// 시침 그리기
     	radius -= 30;
     	double hour_angle = (hour - 3) * Math.PI / 6 + minute_angle / 12;
     	x2 = x1 + (int)(radius * Math.cos(hour_angle));
     	y2 = y1 + (int)(radius * Math.sin(hour_angle));
     	g.setColor(Color.YELLOW);
     	g.drawLine(x1, y1, x2, y2);	
     	
    	// 시간 눈금 그리기
    	g.setColor(Color.BLUE);
    	g.drawLine(x1, 114, x1, 100); // 12시
    	g.drawLine(264, y1, 250, y1); // 3시
    	g.drawLine(x1, 340, x1, 326); // 6시
    	g.drawLine(26, y1, 40, y1); // 9시
    	
    	int a1 = x1 + (int)(120 * Math.cos(Math.PI*2 - Math.PI / 3)); // 1시
    	int b1 = y1 + (int)(120* Math.sin(Math.PI*2 - Math.PI / 3));
    	int aa1 = x1 + (int)(110 * Math.cos(Math.PI*2 - Math.PI / 3)); 
    	int bb1 = y1 + (int)(110 * Math.sin(Math.PI*2 - Math.PI / 3));
    	g.drawLine(a1, b1, aa1, bb1);
    	
    	int a2 = x1 + (int)(120 * Math.cos(Math.PI*2 - Math.PI / 6)); // 2시
    	int b2 = y1 + (int)(120 * Math.sin(Math.PI*2 - Math.PI / 6));
    	int aa2 = x1 + (int)(110 * Math.cos(Math.PI*2 - Math.PI / 6)); 
    	int bb2 = y1 + (int)(110 * Math.sin(Math.PI*2 - Math.PI / 6));
    	g.drawLine(a2, b2, aa2, bb2);
    	
    	int a4 = x1 + (int)(120 * Math.cos(Math.PI / 6)); // 4시
    	int b4 = y1 + (int)(120 * Math.sin(Math.PI / 6));
    	int aa4 = x1 + (int)(110 * Math.cos(Math.PI / 6)); 
    	int bb4 = y1 + (int)(110 * Math.sin(Math.PI / 6));
    	g.drawLine(a4, b4, aa4, bb4);
    	
    	int a5 = x1 + (int)(120 * Math.cos(Math.PI / 3)); // 5시
    	int b5 = y1 + (int)(120 * Math.sin(Math.PI / 3));
    	int aa5 = x1 + (int)(110 * Math.cos(Math.PI / 3)); 
    	int bb5 = y1 + (int)(110 * Math.sin(Math.PI / 3));
    	g.drawLine(a5, b5, aa5, bb5);
    	
    	int a7 = x1 + (int)(120 * Math.cos(Math.PI * 2 / 3)); // 7시
    	int b7 = y1 + (int)(120 * Math.sin(Math.PI * 2 / 3));
    	int aa7 = x1 + (int)(110 * Math.cos(Math.PI * 2 / 3)); 
    	int bb7 = y1 + (int)(110 * Math.sin(Math.PI * 2 / 3));
    	g.drawLine(a7, b7, aa7, bb7);
    	
    	int a8 = x1 + (int)(120 * Math.cos(Math.PI * 5 / 6)); // 8시
    	int b8 = y1 + (int)(120 * Math.sin(Math.PI * 5 / 6));
    	int aa8 = x1 + (int)(110 * Math.cos(Math.PI * 5 / 6)); 
    	int bb8 = y1 + (int)(110 * Math.sin(Math.PI * 5 / 6));
    	g.drawLine(a8, b8, aa8, bb8);
    	
    	int a10 = x1 + (int)(120 * Math.cos(Math.PI + Math.PI / 6)); // 10시
    	int b10 = y1 + (int)(120 * Math.sin(Math.PI + Math.PI / 6));
    	int aa10 = x1 + (int)(110 * Math.cos(Math.PI + Math.PI / 6)); 
    	int bb10 = y1 + (int)(110 * Math.sin(Math.PI + Math.PI / 6));
    	g.drawLine(a10, b10, aa10, bb10);
    	
    	int a11 = x1 + (int)(120 * Math.cos(Math.PI + Math.PI / 3)); // 11시
    	int b11 = y1 + (int)(120 * Math.sin(Math.PI + Math.PI / 3));
    	int aa11 = x1 + (int)(110 * Math.cos(Math.PI + Math.PI / 3)); 
    	int bb11 = y1 + (int)(110 * Math.sin(Math.PI + Math.PI / 3));
    	g.drawLine(a11, b11, aa11, bb11);    
    }
    
    public static void main(String[] args) {
        new ClockWriter(240);
    }
    
}