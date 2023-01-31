import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class CounterFrame extends JFrame implements ActionListener { // ��, ��Ʈ�ѷ� Ŭ����
    private Counter counter;
    private JLabel label = new JLabel("count = 0");

    public CounterFrame(Counter c) { // ī���� ������Ʈ �޾ƿ;� ��
        counter = c;
        
        Container cp = getContentPane(); // ���� ���� JFrame
        
        cp.setLayout(new FlowLayout()); // ���̾ƿ� ���� - �������� ������ ����
//      JLabel label = new JLabel("count = 0"); -> �ٸ� �޼ҵ忡�� ���� �����ؾ� �ϹǷ� �ʵ庯�� ������ �̵�
        cp.add(label);
        
        JButton button = new JButton("OK");
        cp.add(button);
        button.addActionListener(this); // �ڽ��� ��ư�� ���� (��ư �̺�Ʈ�� �߻��ϸ� ó�� �����ϵ���)
        
        setTitle("Counter");
        setSize(200, 70);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    /** actionPerformed - '��ư ������' �׼� �̺�Ʈ�� ó�� */
    public void actionPerformed(ActionEvent e) {
        counter.increment(); // ī���� ������Ʈ�� ���� 1 ����
        label.setText("count = " + counter.count()); // ��(Ÿ��Ʋ)�� ���뵵 �ٲ��� ��, ���� ī��Ʈ ��
    }

}