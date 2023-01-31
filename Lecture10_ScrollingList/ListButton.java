import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ListButton extends JButton implements ActionListener {
	
    private Counter2[] counters; // 카운터 알아야 함
    private ListFrame frame; // 프레임에 대해서도 알아야 함

    public ListButton(String label, Counter2[] c, ListFrame v) {
        super(label);
        counters = c;
        frame = v;
        addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        int choice = frame.getSelection();
        if (choice != -1) { // 아무것도 선택이 안 된 상태에서는 아무 반응이 없다
            counters[choice].increment();
            frame.update();
        }
    }
    
}