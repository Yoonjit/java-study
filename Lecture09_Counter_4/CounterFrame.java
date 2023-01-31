import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class CounterFrame extends JFrame{ // �� Ŭ����
    private Counter counter;
    private JLabel label = new JLabel("count = 0");
    private Drawing panel;

    public CounterFrame(Counter c, Drawing p) {
        counter = c;
        panel = p;
        
        Container cp = getContentPane();
        
        cp.setLayout(new BorderLayout()); // ���̾ƿ� ���� - �̹��� �ٸ� �ɷ�
        JPanel p1 = new JPanel(new FlowLayout());
        JPanel p2 = new JPanel(new FlowLayout());
        
        p1.add(label);
        p2.add(new CountButton(counter, this));
        p2.add(new ExitButton());
        
        cp.add(p1, BorderLayout.NORTH);
        cp.add(panel, BorderLayout.CENTER);
        cp.add(p2, BorderLayout.SOUTH);
        
        setTitle("Counter");
        setSize(210, 300);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    /** actionPerformed - '��ư ������' �׼� �̺�Ʈ�� ó�� */
    public void update() {
        label.setText("count = " + counter.count());
        panel.repaint(); // �� ����� ������� ���������� �̵��ϱ�!!!!! ī��Ʈ ��ư�� �ؾ� ��, 
    }

}