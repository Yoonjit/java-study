import java.util.Scanner;

	/*
	 * 0��: 1    2    3    4    5... (14ȣ����)
	 * 1��: 1    3   "6"   10   15...
	 * 2��: 1   "4"  "10"  20   35...
	 * 3��: 1    5    15  '35'  70...
	 * 4��: 1    6   '21' '56'  126...
	 * 
	 * 6 + 4 = 10
	 * 21 + 35 = 56
	 * �̷� �迭 ���� Ǯ�� ���� ������
	 */

public class ImAgainstIt {

	public static void main(String[] args) {
		int[][] apart = new int[14][14]; // �׳� ���簢������ ��������
		
		for (int x = 0; x < 14; x++) { // ����
			for (int y = 0; y < 14; y++) { // ȣ��
				if (x == 0) { // 0���� 1ȣ�� 1��, 2ȣ�� 2��, 3ȣ�� 3��...
					apart[x][y] = y + 1;
				}
				else if (y == 0) { // ��� ���� 1ȣ���� 1���� ��� ����
					apart[x][y] = 1;
				}
				else {
					apart[x][y] = apart[x][y-1] + apart[x-1][y];
				}
			}
		}
		
//		for (int x = 0; x < 14; x++) { // ����Ʈ �ο��� üũ
//			System.out.print(x + "��: ");
//			for (int y = 0; y < 14; y++) {
//				System.out.print(apart[x][y] + " ");
//			}
//			System.out.println();
//		}
		
		System.out.println("�ݺ� Ƚ�� �Է��϶��");
		Scanner T = new Scanner(System.in);
		int test_case = T.nextInt();
		
		for (int i = 0; i < test_case; i++) {
			System.out.println("Q" + (i+1) +  ". ���� �Է��϶��");
			Scanner K = new Scanner(System.in);
			int k = K.nextInt();
			
			System.out.println("Q" + (i+1) +  ". ȣ�� �Է��϶��");
			Scanner N = new Scanner(System.in);
			int n = N.nextInt();
			
			System.out.println(apart[k][n-1]);
		}
		
	}

}