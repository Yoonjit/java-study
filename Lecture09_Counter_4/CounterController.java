import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterController implements ActionListener { // ��Ʈ�ѷ� Ŭ����
	
	private Counter model;
    private CounterFrame view;

    public CounterController(Counter m, CounterFrame v) {
    	model = m;
        view = v;
    }

    /** actionPerformed - '��ư ������' �׼� �̺�Ʈ�� ó�� */
    public void actionPerformed(ActionEvent e) {
    	model.increment(); // ī���� ������Ʈ�� ���� 1 ����
        view.update();
    }
    
}