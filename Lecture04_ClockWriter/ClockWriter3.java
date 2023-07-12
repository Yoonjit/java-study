import java.awt.Color;
import java.awt.Graphics;
import java.time.LocalTime;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class ClockWriter3 extends JPanel {
	// �ʵ� ������ �ܺο��� ������ �Ұ����ϰ� �ؾ� �� = private
	private final int SIZE; // final ����: �� �� �����Ǹ� �� �ٲ�(�빮��)
	private int diameter; // ���ɿ��� ���� �ʵ� ����
	private final int MARGIN; // ����� ���Ǹ� ���� ����

    public ClockWriter3(int size, int rate) { // ���� �޼ҵ�!!!
    	// ���� ��� ���� SIZE�� �̿��� ��Ÿ�� �� ����
    	SIZE = size;
    	MARGIN = SIZE / rate;
    	
    	JFrame frame = new JFrame(); // â ����, JFrame ��ü�� frame ����
        
        // ����(this) JPanel ��ü�� �ǰڴ� = ��� ��� ���� �ְ� �� = �׸� �׸� �غ�
        frame.getContentPane().add(this);
        
        frame.setTitle("Clock"); // â �̸�
        frame.setSize(SIZE + 50, SIZE + 150); // â ũ�� ����, ����
        frame.setVisible(true); // â �����ֱ�, false�� �� ������
        
        // â�� �ݾƵ� ���μ����� �״�� ����, ���� ���� ���μ��� ������ ����
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    
    // �ڵ����� â�� �ٽ� �׷��ִ�(����Ǵ�) �޼ҵ�: â�� �ݾҴٰ� ������ ��, â�� �̵���ų ��...)
    // -> �׸� �׸� �Ÿ� ���� �� �޼ҵ� �ȿ� �־���� ��
    // "�޼ҵ� �������̵�: �޼ҵ� �������"
    // �Ȱ��� ����� �θ� ���� ������ �װ� �� ���� �� �� ����
    // ����� �޾Ƶ� ��ȿ�� �Ǵ� ��, �θ� ���� �� �� ���� ����
    public void paintComponent(Graphics g) {
    	// ��ȭ���� �׸��� �׸� ���� ����
    	// ���� ������κ��� ����, ���� ������ ������ �޽��� ����
    	g.setColor(Color.BLUE);
    	g.drawString("\"TIME IS GOLD\"", 105, 50); 
    	
    	// ���� ä���� ��, Ÿ�� �׸��� (���� ��ǥ, ���� ��ǥ, ���� ����, ���� ����)
    	g.setColor(Color.LIGHT_GRAY);
    	g.fillOval(25, 100, SIZE, SIZE);
    	
    	// ���� �ð� �˾ƺ���
    	LocalTime now = LocalTime.now();
    	
    	// �ð��� �߽� (���� �߽�)
    	int radius = SIZE / 2; // SIZE�� ���� ����
    	int x1 = 25 + radius;
    	int y1 = 100 + radius;
    	// int diff = radius / 5;
    	
    	// �ڶ󳪴� ���ɿ� �׸��� - ��ħ, ��ħ�� ������ �� �ǹǷ� �� ���� �׸���
     	// ���ɿ��� ũ�Ⱑ ��� Ŀ���� ������ ���� ������ ���¸� �����صξ�� ��
     	// ���� ���ɿ��� �������� �󸶳� �� Ŀ�� ���� �����صξ�� ��
     	// �̷� �� ����� ģ�� = �ʵ� ����!
    	int base = (SIZE - diameter) / 2;
    	g.setColor(Color.PINK);
    	g.fillOval(25+base, 100+base, diameter, diameter);
    	diameter = (diameter >= SIZE) ? 0 : diameter + MARGIN;
    	
    	// ��ħ �׸���
    	radius -= 30; // 30�ȼ� ��ŭ ª��
    	// now.getMinute() - 15: �ϴ� ������ ���ؾ� ��
    	// �� ��ü 1/60�� (60���̴ϱ�), 2PI�� 60���� ������ �� = PI�� 30���� ������ ��
    	// �׸��� �߽ɿ������� ������ ������ ������� ��ǥ ��ƾ� ��(sin, cos �����ﰢ��)
    	// >> 15�� ��ġ�������� ���ؾ� ��
    	// ����� sin, cos�� double Ÿ���� ��ȯ����
    	double minute_angle = (now.getMinute() - 15) * Math.PI / 30;
    	int x2 = x1 + (int)(radius * Math.cos(minute_angle));
     	int y2 = y1 + (int)(radius * Math.sin(minute_angle));
     	g.setColor(Color.RED);
     	g.drawLine(x1, y1, x2, y2);
     	
     	// ��ħ �׸���
     	radius -= 30; // ��ħ���� 30�ȼ� ��ŭ �� ª��
     	// now.getHour() - 3: �굵 ������ ���ؾ� ��
     	// �� ��ü 1/12�� (12�ð��̴ϱ�), 2PI�� 12�� ������ �� = PI�� 6���� ������ ��
     	// �׸��� �߽ɿ������� ������ ������ ������� ��ǥ ��ƾ� ��(sin, cos �����ﰢ��)
    	// >> 3�� ��ġ�������� ���ؾ� ��
     	double hour_angle = (now.getHour() - 3) * Math.PI / 6 + minute_angle / 12;
     	x2 = x1 + (int)(radius * Math.cos(hour_angle));
     	y2 = y1 + (int)(radius * Math.sin(hour_angle));
     	g.setColor(Color.YELLOW);
     	g.drawLine(x1, y1, x2, y2);	
    }

    
    // test code - Ŭ������ �׽�Ʈ �غ� �� ����
    public static void main(String[] args) { // ȣ�� �޼ҵ�!!!
        new ClockWriter3(250, 5); // ClockWriter3 ��ü ���� > Ŭ���� ������� > �޼ҵ� ����
    }
    
}