public class SudokuController { // ��Ʈ�ѷ� (�̿ϼ�)

    private Sudoku sudoku;
    private PlayerInput reader;
    private SudokuWriter writer;

    /** Sudoku, PlayerInput, SudokuWriter ��ü�� �����Ͽ� �ʵ� ������ �����Ѵ�. */
    public SudokuController() {
        reader = new PlayerInput();
        int hole_count = reader.selectLevel();
        sudoku = new Sudoku(hole_count);
        writer = new SudokuWriter(sudoku);
    }

    // [���� 0.5/2.0]
    /** ������ ���� ������ �����Ѵ�. */
    public void playSudokuPuzzle() {







    }
}