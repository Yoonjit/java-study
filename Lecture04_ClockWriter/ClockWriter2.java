import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class ClockWriter2 extends JPanel {
	// �ʵ� ������ �ܺο��� ������ �Ұ����ϰ� �ؾ� �� = private
	private final int SIZE; // final ����: �� �� �����Ǹ� �� �ٲ�(�빮��)
	
    public ClockWriter2(int size) { // ���� �޼ҵ�!!!
    	// ���� ��� ���� SIZE�� �̿��� ��Ÿ�� �� ����
    	SIZE = size;
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
    	g.setColor(Color.MAGENTA);
    	
    	// ���� ������κ��� ����, ���� ������ ������ �޽��� ����
    	g.drawString("\"TIME IS GOLD\"", 105, 50); 
    	
    	// ���� ä���� �簢�� �׸��� (���� ��ǥ, ���� ��ǥ, ���� ����, ���� ����)
    	g.setColor(Color.BLUE);
    	g.fillRect(25, 100, 250, 250);
    	
    	// ���� ����� �簢�� �׸��� (���� ��ǥ, ���� ��ǥ, ���� ����, ���� ����)
    	g.setColor(Color.RED);
    	g.drawRect(25, 100, 250, 250);
    	
    	// ���� ä���� ��, Ÿ�� �׸��� (���� ��ǥ, ���� ��ǥ, ���� ����, ���� ����)
    	g.setColor(Color.YELLOW);
    	g.fillOval(25, 100, 250, 250);
    	
    	// ���� ����� ��, Ÿ�� �׸��� (���� ��ǥ, ���� ��ǥ, ���� ����, ���� ����)
    	g.setColor(Color.GREEN);
    	g.drawOval(25, 100, 250, 250);
    	
    	// ������ �� �׸��� (�� x1 ��ǥ, �� y1 ��ǥ, �� x2 ��ǥ, �� y2 ��ǥ)
    	g.setColor(Color.BLACK);
    	g.drawLine((25 + 250/2), (100 + 250/2) , (25 + 250/2), 100);
    	
    	// �밢�� �׸��� (�� x1 ��ǥ, �� y1 ��ǥ, �� x2 ��ǥ, �� y2 ��ǥ)
    	// �������� ���̰� 2�� ���� = 2*PI, �ݿ��� ���ִ� PI
    	// �ݿ����� PI/6, ���� ������ ���� 125
    	int x1 = (25 + 250/2);
    	int y1 = (100 + 250/2);
    	int x2 = x1 + (int)(125 * Math.cos(Math.PI / 6)); // x ��ǥ cos
    	int y2 = y1 + (int)(125 * Math.sin(Math.PI / 6)); // y ��ǥ sin
    	g.setColor(Color.BLACK);
    	g.drawLine(x1, y1 , x2, y2);
    }

    
    // test code - Ŭ������ �׽�Ʈ �غ� �� ����
    public static void main(String[] args) { // ȣ�� �޼ҵ�!!!
        new ClockWriter2(250); // ClockWriter2 ��ü ���� > Ŭ���� ������� > �޼ҵ� ����
    }
    
}