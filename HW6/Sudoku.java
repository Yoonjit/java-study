import java.util.Random; // �� (�̿ϼ�)

public class Sudoku {

    private int[][] solution = new int[9][9]; // ������ ����
    private int hole_count; // ä���� �� ĭ�� ��
    private int[][] puzzle_board = new int[9][9]; // ������ ��

    /** ��ü �ʱ�ȭ �޼ҵ�
     *
     * @param count - ��ĭ�� ����
     */
    public Sudoku(int count) {
        createSolutionBoard(); // ������ ���� �����ϴ� ��ü
        hole_count = count; // ä���� �� ĭ�� �� = count
        createPuzzleBoard(count); // ��ĭ �� ��ŭ �վ���� ������ ���� 
    }

    /** ���� ���� �迭�� ���� �Ѵ�.
     *
     * @return ���� ���� �迭
     */
    public int[][] getPuzzleBoard() {
        return puzzle_board;
    }

    /** ��ĭ�� ������ ���� �Ѵ�.
     *
     * @return ��ĭ�� ����
     */
    public int countHoles() {
        return hole_count;
    }

    // [���� = 0.5/2.0]
    /** �ش� ������ ������ solution �迭�� �������� ��� �����. */
    private void createSolutionBoard() {
        // 1~9 ������ ������ ������ {n1,n2,n3,n4,n5,n6,n7,n8,n9}�� �����,
        // �̸� ������ ÷���� �׸� 1�� ���� solution �迭�� ��ġ �Ѵ�.
    	int arr[] = generateRandomPermutation(9);

    	for(int i=0; i<arr.length; i++) {
    		arr[i] += 1;
    	}
    	
    	
    	for(int i=0; i<9; i++) {
    		for(int j=0; j<9; j++) {
    			solution[j][i] = arr[i];
    		}
    	}
    	
    
        // ������ ÷���� �׸� 2�� ���� ������ �ٲٱ�� ������ �ٲٱ⸦ �������� �Ѵ�.
        // �������� �� �ٲٱ⸦ �Ѵٴ� ���� �ٲ��� ������ �������� �����Ѵٴ� �ǹ��̴�.
    	
        // ������ �ٲٱ�
        shuffleRibbons();
        
        // ������ �ٲٱ�
        transpose();
        shuffleRibbons();
        transpose();
        
        // �׽�Ʈ�� �޼ҵ�
        showBoard(solution);
    }

    /** 0~n-1 ������ ���� ������ �������� ���� �迭�� ���� �Ѵ�.
     *
     * @param n - ������ ����
     * @return 0~n-1 ������ ������ �������� ���� ���� �迭
     */
    private int[] generateRandomPermutation(int n) {
        Random random = new Random();
        int[] permutation = new int[n];
        for (int i = 0; i < n; i++) {
            int d = random.nextInt(i+1);
            permutation[i] = permutation[d];
            permutation[d] = i;
        }
        return permutation;
    }

    /** ������ ÷���� �׸� 2�� ���� �������� solution �迭�� �������� �������� ���´�. */
    private void shuffleRibbons() {
        int[][] shuffled = new int[9][9];
        int[] random_index;
        for (int i = 0; i < 3; i++) {
            random_index = generateRandomPermutation(3);
            for (int j = 0; j < 3; j++)
                shuffled[i*3+random_index[j]] = solution[i*3+j];
        }
        solution = shuffled;
    }

    /** solution �迭�� ��� ���� �ٲ۴�. */
    private void transpose() {
        int[][] transposed = new int[9][9];
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                transposed[i][j] = solution[j][i];
        solution = transposed;
    }

    /** 2���� �迭 b�� �ܼ� �����쿡 �����ش�. (�׽�Ʈ�� �޼ҵ�)
     *
     * @param b - 2���� �迭
     */
    private void showBoard(int[][] b) {
        System.out.println("������ ����");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++)
                System.out.print(b[i][j] + " ");
            System.out.println();
        }
    }

    // [���� = 0.5/2.0]
    /** solution �迭���� count ��ŭ �������� ��ĭ�� ä�� puzzle_board �迭�� ����� �����Ѵ�.
     *  
     * @param count - ��ĭ�� ����
     */
    private void createPuzzleBoard(int count) {
        // solution ���带 �״�� puzzle_board�� �����Ѵ�.



        // �������� ��ĭ�� �����Ѵ�. ��ĭ�� ������ ���ؼ� 0���� ä���.
        // new Random().nextInt(n) �޼ҵ带 ȣ���ϸ�
        // 0~n-1 ������ ���� �߿��� �������� �ϳ��� �� �� �ִ�.










    }

    // [���� 0.5/2.0]
    /** row�� ������, col�� �����ٿ� digit�� ä�� �� �ִ��� �˻��Ͽ�,
     *  �����ϸ� ä��� true�� �����ϰ�, �Ұ����ϸ� false�� ���� �Ѵ�.
     *
     * @param digit - ��ĭ�� ä�� �� (1~9 �� �ϳ�)
     * @param row - ������ ��ȣ
     * @param col - ������ ��ȣ
     * @return ���� ���� ���ǿ� �����Ͽ� ��ĭ�� ä������ true, �������� ������ false
     */
    public boolean check(int digit, int row, int col) {







    }
}