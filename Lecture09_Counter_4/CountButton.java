import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

// 너는 이제 카운트 버튼 담당이란다
public class CountButton extends JButton implements ActionListener {
	private Counter model;
    private CounterFrame view;

    /** CountButton - 버튼 컨트롤러
     * @param label - 버튼에 붙는 라벨
     * @param m - 협조할 모델
     * @param v - 갱신할 뷰 */
    public CountButton(Counter m, CounterFrame v) {
//    	1) setText("OK");
//    	2)
    	super("OK"); // 오브젝트 생성하는 게 아니라 부모 메소드를 여기서 쓰는 거임
        model = m;
        view = v;
        addActionListener(this); // 자신을 버튼에 연결 (버튼 이벤트가 발생하면 처리 가능하도록)
        						 // 프레임에 있던 메소드 갖고 옴, 얘가 이제 이 기능을 수행해야 하니까
       
    }

    /** actionPerformed - '버튼 누르기' 액션 이벤트를 처리
     * @param e - 이벤트 */
    public void actionPerformed(ActionEvent e) {
        model.increment();
        view.update();
    }

}