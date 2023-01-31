import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class DemoInput {
	
    public static void main(String[] args) {
        String message = "�������� �ֽø� ���� ������ ����ص帳�ϴ�.";
        String input = JOptionPane.showInputDialog(message);
        int radius = Integer.parseInt(input);
        double area = Math.PI * Math.pow(radius,2);
        DecimalFormat f = new DecimalFormat("0.00"); // �Ҽ��� �� ��° �ڸ�����
        System.out.print("�������� " + radius + "�� ���� ������ ");
        System.out.println(f.format(area) + " �Դϴ�.");
    }
    
}