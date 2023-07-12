import java.util.Scanner;

public class fucking {
	
	/* 
	 * 1층 = 1, 출력값: 1
	 * 2층(6개의 방): 2 ~ 7, 출력값: 2
	 * 3층(12개의 방): 8 ~ 19, 출력값: 3
	 * 4층(18개의 방): 20 ~ 37, 출력값: 4 
	 */
	
	/* 
	 * 각 층의 제일 마지막 값만 살펴보겠음 -> 1, 7, 19, 37...
	 * 1은 1
	 * 7은 이전 항(1) 더하기 6 (6*1)
	 * 19는 이전 항(7) 더하기 12 (6*2)
	 * 37은 이전 항(19) 더하기 18 (6*3)
	 * (TMI: 이거 깨닫고 충격받아서 스스로 천재라고 생각함)
	 */
	
	/* 
	 * 덧셈을 6, 12, 18... 이런 식으로 한다는 거는 반대로 생각할 수 있음
	 *  19는 다음 항(37) 빼기 18 (6*3)
	 *  7은 다음 항(19) 빼기 12 (6*2)
	 *  1은 다음 항(7) 빼기 6 (6*1)
	 *  덧셈으로 뭔가 해보려다가 안 돼서 뺄셈 과정으로 풀어봐야겠다고 생각함
	 */
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // 스캐너를 통해 입력받을 거임
		int room_num = scanner.nextInt(); // 입력받을 값을 정수로 바꿔줄 거임
		
		if (room_num == 1) { // 1을 입력하면 1이 나와야 해서 따로 빼놨음
			System.out.println(1);
		}
		
		else {
			int cnt = 1; 
			room_num -= 1;
			
			while(room_num > 0) {
				room_num -= cnt * 6;
				cnt += 1;
			}
			
			System.out.println(cnt);
		}
		
		/*
		 * ex) room_num = 58
		 * 
		 * cnt = 1, room_num = 57
		 * 
		 * while문 만족 -> room_num = 57 - 6*1 = 51, cnt = 2
		 * while문 만족 -> room_num = 51 - 6*2 = 39, cnt = 3
		 * while문 만족 -> room_num = 39 - 6*3 = 21, cnt = 4
		 * while문 만족 -> room_num = 21 - 6*4 = -3, cnt = 5, while문 탈출
		 */
					
	}

}