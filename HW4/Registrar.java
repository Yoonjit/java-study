import javax.swing.JOptionPane;

public class Registrar { // �� Ŭ���� (input)
						 // �ܺ� ����ڿ��Լ� ������ �޾Ƽ� �����ϴ� ����
	
    public String invitePlayer() {
        return JOptionPane.showInputDialog("�̸��� ����� �ּ���."); // �÷��̾� �̸�
    }
	
    public int wantToContnue() {
        return JOptionPane.showConfirmDialog(null, "�� �Ͻðھ��?"); // Yes ������ 0 ����
        														 // No ������ �ٸ� �� ����
    }

}