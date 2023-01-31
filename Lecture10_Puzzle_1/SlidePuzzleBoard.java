public class SlidePuzzleBoard {

    private PuzzlePiece[][] board; // ���� �ǽ� ������Ʈ�� 2���� �迭�� ���
    // ��ĭ�� ��ǥ
    private int empty_row; // ��
    private int empty_col; // ��
    // representation invariant: board[empty_row][empty_col] == null

    /** Constructor - SlidePuzzleBoard �ʱ� ���� ���� ���� - �����ϴ� ������ ����
     *  */
    public SlidePuzzleBoard() {
        // 4 x 4 ���� �����
        board = new PuzzlePiece[4][4];
        // ���� ���� 1~15�� ���忡 �������� �����
        int number = 1;
        for (int row = 0; row < 4; row++)
            for (int col = 0; col < 4; col++) {
                board[row][col] = new PuzzlePiece(number);
                number += 1;
            }
        board[3][3] = null; // ��ĭ
        empty_row = 3;
        empty_col = 3;
    }

    /** getPuzzlePiece - ���� ������ ����
     * @param row - ������ �ε���
     * @param col - ������ �ε���
     * @return ���� ����  */
    public PuzzlePiece getPuzzlePiece(int row, int col) {
        return board[row][col];
    }

    /** �̵��� �����ϸ�, ���� ������ ��ĭ���� �̵�
     * @param w - �̵��ϱ� ���ϴ� ���� ������ ��ȣ
     * @return �̵� �����ϸ� true�� �����ϰ�, �̵��� �Ұ����ϸ� false�� ���� */
    public boolean move(int w) {
        int row, col; // w�� ��ġ
        // ��ĭ�� �ֺ����� w�� ��ġ�� ã��
        if (found(w, empty_row - 1, empty_col)) {
            row = empty_row - 1;
            col = empty_col;
        }
        else if (found(w, empty_row + 1, empty_col)) {
            row = empty_row + 1;
            col = empty_col;
        }
        else if (found(w, empty_row, empty_col - 1)) {
            row = empty_row;
            col = empty_col - 1;
        }
        else if (found(w, empty_row, empty_col + 1)) {
            row = empty_row;
            col = empty_col + 1;
        }
        else
            return false; // �̵� ����
        // w�� ��ĭ�� ����
        board[empty_row][empty_col] = board[row][col];
        // ��ĭ ��ġ�� ���� �����ϰ�, w�� ����
        empty_row = row;
        empty_col = col;
        board[empty_row][empty_col] = null;
        return true; // �̵� ����
    }

    /** found - board[row][col]�� ���� ���� v�� �ִ��� Ȯ��  */
    private boolean found(int v, int row, int col) {
        if (row >= 0 && row <= 3 && col >= 0 && col <= 3)
            return board[row][col].face() == v;
        else
            return false;
    }
}