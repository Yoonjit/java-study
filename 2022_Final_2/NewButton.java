import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

// 완성 - 새로 시작 버튼
public class NewButton extends JButton implements ActionListener {

    private ScoreBoard score_board;

    public NewButton(ScoreBoard b) {
        super("New");
        score_board = b;
        addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        score_board.begin();
    }

}