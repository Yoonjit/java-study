import javax.swing.JOptionPane;

public class Payroll {

    public static void main(String[] args) {
        String name_in = JOptionPane.showInputDialog("�Է� ���ϸ�");
        String name_out = JOptionPane.showInputDialog("��� ���ϸ�");
        
        if (name_in != null && name_out != null) // �ּ��� �Ѵ� ���ڿ��� �־��
            new PayrollController().processPayroll(name_in, name_out);
    }

}