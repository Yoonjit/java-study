/** PuzzlePiece - 슬라이드 퍼즐 게임 조각  */
public class PuzzlePiece {
    private int face; // 자기 번호를 기억하고 있음

    /** Constructor - PuzzlePiece 퍼즐 조각을 만듬
     * @param value - 퍼즐 조각 위에 표시되는 값  */
    public PuzzlePiece(int value) {
        face = value;
    }

    /** face - 조각의 액면 값을 리턴  */
    public int face() {
        return face;
    }
}