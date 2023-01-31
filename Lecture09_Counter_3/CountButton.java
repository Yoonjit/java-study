import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

// �ʴ� ���� ī��Ʈ ��ư ����̶���
public class CountButton extends JButton implements ActionListener {
	private Counter model;
    private CounterFrame view;

    /** CountButton - ��ư ��Ʈ�ѷ�
     * @param label - ��ư�� �ٴ� ��
     * @param m - ������ ��
     * @param v - ������ �� */
    public CountButton(Counter m, CounterFrame v) {
//    	1) setText("OK");
//    	2)
    	super("OK"); // ������Ʈ �����ϴ� �� �ƴ϶� �θ� �޼ҵ带 ���⼭ ���� ����
        model = m;
        view = v;
        addActionListener(this); // �ڽ��� ��ư�� ���� (��ư �̺�Ʈ�� �߻��ϸ� ó�� �����ϵ���)
        						 // �����ӿ� �ִ� �޼ҵ� ���� ��, �갡 ���� �� ����� �����ؾ� �ϴϱ�
       
    }

    /** actionPerformed - '��ư ������' �׼� �̺�Ʈ�� ó��
     * @param e - �̺�Ʈ */
    public void actionPerformed(ActionEvent e) {
        model.increment();
        view.update();
    }

}