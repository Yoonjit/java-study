/** PuzzlePiece - �����̵� ���� ���� ����  */
public class PuzzlePiece {
    private int face; // �ڱ� ��ȣ�� ����ϰ� ����

    /** Constructor - PuzzlePiece ���� ������ ����
     * @param value - ���� ���� ���� ǥ�õǴ� ��  */
    public PuzzlePiece(int value) {
        face = value;
    }

    /** face - ������ �׸� ���� ����  */
    public int face() {
        return face;
    }
}