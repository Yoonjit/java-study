import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ExitButton extends JButton implements ActionListener {

    /** ExitButton - ���� ��Ʈ�ѷ�
     * @param label - ��ư�� �ٴ� �� */
    public ExitButton(String label) {
        super(label);
        addActionListener(this);
    }

    /** actionPerformed - '��ư ������' �׼� �̺�Ʈ�� ó��
     * @param e - �̺�Ʈ  */
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }

}