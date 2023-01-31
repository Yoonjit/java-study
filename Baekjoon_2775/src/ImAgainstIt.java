import java.util.Scanner;

	/*
	 * 0층: 1    2    3    4    5... (14호까지)
	 * 1층: 1    3   "6"   10   15...
	 * 2층: 1   "4"  "10"  20   35...
	 * 3층: 1    5    15  '35'  70...
	 * 4층: 1    6   '21' '56'  126...
	 * 
	 * 6 + 4 = 10
	 * 21 + 35 = 56
	 * 이런 배열 만들어서 풀면 되지 않을까
	 */

public class ImAgainstIt {

	public static void main(String[] args) {
		int[][] apart = new int[14][14]; // 그냥 정사각형으로 만들어버렷
		
		for (int x = 0; x < 14; x++) { // 층수
			for (int y = 0; y < 14; y++) { // 호수
				if (x == 0) { // 0층의 1호는 1명, 2호는 2명, 3호는 3명...
					apart[x][y] = y + 1;
				}
				else if (y == 0) { // 모든 층의 1호에는 1명이 살고 있음
					apart[x][y] = 1;
				}
				else {
					apart[x][y] = apart[x][y-1] + apart[x-1][y];
				}
			}
		}
		
//		for (int x = 0; x < 14; x++) { // 아파트 인원수 체크
//			System.out.print(x + "층: ");
//			for (int y = 0; y < 14; y++) {
//				System.out.print(apart[x][y] + " ");
//			}
//			System.out.println();
//		}
		
		System.out.println("반복 횟수 입력하라고");
		Scanner T = new Scanner(System.in);
		int test_case = T.nextInt();
		
		for (int i = 0; i < test_case; i++) {
			System.out.println("Q" + (i+1) +  ". 층수 입력하라고");
			Scanner K = new Scanner(System.in);
			int k = K.nextInt();
			
			System.out.println("Q" + (i+1) +  ". 호수 입력하라고");
			Scanner N = new Scanner(System.in);
			int n = N.nextInt();
			
			System.out.println(apart[k][n-1]);
		}
		
	}

}