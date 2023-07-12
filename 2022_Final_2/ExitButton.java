import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

// �ϼ� - ��� ��ư
public class ExitButton extends JButton implements ActionListener {

    public ExitButton() {
        super("Exit");
        addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }

}