import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterController implements ActionListener { // 컨트롤러 클래스
	
	private Counter model;
    private CounterFrame view;

    public CounterController(Counter m, CounterFrame v) {
    	model = m;
        view = v;
    }

    /** actionPerformed - '버튼 누르기' 액션 이벤트를 처리 */
    public void actionPerformed(ActionEvent e) {
    	model.increment(); // 카운터 오브젝트의 값을 1 저장
        view.update();
    }
    
}