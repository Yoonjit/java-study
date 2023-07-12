import javax.swing.JOptionPane;

/** VoteCount ��ǥ ���ø����̼� */
public class VoteCount {

    public static void main(String[] args) {
        int num_candidates = 4;
        int[] votes = new int[num_candidates]; // 0���� �ڵ� �ʱ�ȭ

        boolean processing = true;
    while (processing) {
        /* loop invariant: ��ǥ���� �ش� �迭�� �ĺ��ں��� �����Ǿ��� */
        String input = JOptionPane.showInputDialog("���ϴ� �ĺ��� ��ǥ�ϼ���: 0, 1, 2, 3");
        if (input == null)
            processing = false;
        else {
            char vote = input.charAt(0);
            if ('0' <= vote && vote <= '3') {
                int voted = vote - '0';
                votes[voted] += 1;
            }
            else
                System.out.println(input + "�� �ĺ��ڰ� �ƴմϴ�.");
        }
    }
    for (int i = 0; i != votes.length; i = i + 1)
        System.out.println("�ĺ� " + i + "���� " + votes[i] + "ǥ�� ��ǥ�Ͽ����ϴ�.");
    }

}