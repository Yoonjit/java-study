import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class CounterFrame extends JFrame{ // 뷰 클래스
    private Counter counter;
    private JLabel label = new JLabel("count = 0");

    public CounterFrame(Counter c) { // 카운터 오브젝트 받아와야 함
        counter = c;
        
        Container cp = getContentPane(); // 내가 지금 JFrame
        
        cp.setLayout(new FlowLayout()); // 레이아웃 지정 - 수평으로 나란히 정렬
//      JLabel label = new JLabel("count = 0"); -> 다른 메소드에서 접근 가능해야 하므로 필드변수 밑으로 이동
        cp.add(label);
        
        JButton button = new CountButton(counter, this);
        cp.add(button);
//      button.addActionListener(new CounterController(counter, this)); // 자신을 버튼에 연결 (버튼 이벤트가 발생하면 처리 가능하도록)
        
        setTitle("Counter");
        setSize(200, 70);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    /** actionPerformed - '버튼 누르기' 액션 이벤트를 처리 */
    public void update() {
//      counter.increment(); // 카운터 오브젝트의 값을 1 저장
        label.setText("count = " + counter.count()); // 라벨(타이틀)의 내용도 바뀌어야 함, 현재 카운트 값
    }

}