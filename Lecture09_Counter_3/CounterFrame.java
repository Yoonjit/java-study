import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class CounterFrame extends JFrame{ // �� Ŭ����
    private Counter counter;
    private JLabel label = new JLabel("count = 0");

    public CounterFrame(Counter c) { // ī���� ������Ʈ �޾ƿ;� ��
        counter = c;
        
        Container cp = getContentPane(); // ���� ���� JFrame
        
        cp.setLayout(new FlowLayout()); // ���̾ƿ� ���� - �������� ������ ����
//      JLabel label = new JLabel("count = 0"); -> �ٸ� �޼ҵ忡�� ���� �����ؾ� �ϹǷ� �ʵ庯�� ������ �̵�
        cp.add(label);
        
        JButton button = new CountButton(counter, this);
        cp.add(button);
//      button.addActionListener(new CounterController(counter, this)); // �ڽ��� ��ư�� ���� (��ư �̺�Ʈ�� �߻��ϸ� ó�� �����ϵ���)
        
        setTitle("Counter");
        setSize(200, 70);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    /** actionPerformed - '��ư ������' �׼� �̺�Ʈ�� ó�� */
    public void update() {
//      counter.increment(); // ī���� ������Ʈ�� ���� 1 ����
        label.setText("count = " + counter.count()); // ��(Ÿ��Ʋ)�� ���뵵 �ٲ��� ��, ���� ī��Ʈ ��
    }

}