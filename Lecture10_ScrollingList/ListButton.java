import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ListButton extends JButton implements ActionListener {
	
    private Counter2[] counters; // ī���� �˾ƾ� ��
    private ListFrame frame; // �����ӿ� ���ؼ��� �˾ƾ� ��

    public ListButton(String label, Counter2[] c, ListFrame v) {
        super(label);
        counters = c;
        frame = v;
        addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        int choice = frame.getSelection();
        if (choice != -1) { // �ƹ��͵� ������ �� �� ���¿����� �ƹ� ������ ����
            counters[choice].increment();
            frame.update();
        }
    }
    
}