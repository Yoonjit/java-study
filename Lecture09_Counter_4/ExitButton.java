import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

// 너는 이제 취소 버튼 담당이란다
public class ExitButton extends JButton implements ActionListener {

    /** ExitButton - 종료 컨트롤러
     * @param label - 버튼에 붙는 라벨 */
    public ExitButton() {
        super("Exit");
        addActionListener(this);
    }

    /** actionPerformed - '버튼 누르기' 액션 이벤트를 처리
     * @param e - 이벤트  */
    public void actionPerformed(ActionEvent e) {
        System.exit(0); // 프로그램 종료
    }

}