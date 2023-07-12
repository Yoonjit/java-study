import javax.swing.JOptionPane; // ��ǲ ��

public class PlayerInput {

    /** �÷��̾�� ���̵��� �����ϰ� �Ͽ� ���̵��� ���� ��ĭ�� ������ ���Ͽ� �����Ѵ�.
     *
     * @return ��ĭ�� ����
     */
    public int selectLevel() {
        String message = "���̵� ���� �Է�  = �ʱ� 1, �߱� 2, ��� 3";
        String input = JOptionPane.showInputDialog(message);
        while (! (input.equals("1") || input.equals("2") || input.equals("3")))
            input = JOptionPane.showInputDialog(message);
        int level = Integer.parseInt(input);
        if (level == 1)
            return 27;
        else if (level == 2)
            return 36;
        else // level must be 3
            return 45;
    }

    /** 1~9 ������ ���� �÷��̾�Լ� �Է¹޾Ƽ� ������ �����Ѵ�.
     *
     * @param message - ��ǲ �޽��� �����쿡 ������ �޽��� ���ڿ�   
     * @return ��ǲ ���� 1~9 ������ ����
     */
    public int selectNumber(String message) {
        String input = JOptionPane.showInputDialog(message);
        while (! (input.equals("1") || input.equals("2") || input.equals("3") ||
                  input.equals("4") || input.equals("5") || input.equals("6") ||
                  input.equals("7") || input.equals("8") || input.equals("9")))
            input = JOptionPane.showInputDialog(message);
        return Integer.parseInt(input);
    }
}