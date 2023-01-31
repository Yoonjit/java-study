import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class CounterFrame extends JFrame{ // 뷰 클래스
    private Counter counter;
    private JLabel label = new JLabel("count = 0");
    private Drawing panel;

    public CounterFrame(Counter c, Drawing p) {
        counter = c;
        panel = p;
        
        Container cp = getContentPane();
        
        cp.setLayout(new BorderLayout()); // 레이아웃 지정 - 이번엔 다른 걸로
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

    /** actionPerformed - '버튼 누르기' 액션 이벤트를 처리 */
    public void update() {
        label.setText("count = " + counter.count());
        panel.repaint(); // 이 기능을 드로잉이 가져가도록 이동하기!!!!! 카운트 버튼이 해야 함, 
    }

}