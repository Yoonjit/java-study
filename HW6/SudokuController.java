public class SudokuController { // 컨트롤러 (미완성)

    private Sudoku sudoku;
    private PlayerInput reader;
    private SudokuWriter writer;

    /** Sudoku, PlayerInput, SudokuWriter 객체를 생성하여 필드 변수에 지정한다. */
    public SudokuController() {
        reader = new PlayerInput();
        int hole_count = reader.selectLevel();
        sudoku = new Sudoku(hole_count);
        writer = new SudokuWriter(sudoku);
    }

    // [배점 0.5/2.0]
    /** 스도쿠 퍼즐 게임을 진행한다. */
    public void playSudokuPuzzle() {







    }
}