import javax.swing.JOptionPane; // �ϼ�

public class Reader {
    
    public int readInput() {
        String input = JOptionPane.showInputDialog("��ȣ�� �����ϼ���.");
        int number = Integer.parseInt(input);
        while (number < 1 || number > 16) {
            input = JOptionPane.showInputDialog("��ȣ�� �����ϼ���.");
            number = Integer.parseInt(input);
        }
        return number;
    }

}