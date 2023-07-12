import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

// �ʴ� ���� �׸� �׸��� ����̶���
public class Drawing extends JPanel {

    private Counter counter; // �� �� �׸����� �����;� �ϴϱ� �ҷ�����

    public Drawing(Counter c) {
        counter = c;
        setSize(200, 200);
    }

    public void paintComponent(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(0, 0, 200, 200);
        g.setColor(Color.blue);
        int x = 0, y = 0;
        for (int i = 0; i != counter.count(); i++) {
            g.fillOval(x*25, y*25, 20, 20);
            x++;
            if (x > 7) {
                x = 0;
                y++;
            }
        }
    }
}