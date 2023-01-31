public class Purse {
	
	private int balance;
	
	public boolean earn(int amount) {
		if(amount < 0) {
			return false;
		}
		else {
			balance += amount;
			return true;
		}
	}
	
	public boolean spend(int amount) {
		if(amount < 0 || amount > balance) {
			return false;
		}
		else {
			balance -= amount;
			return true;
		}
	}
	
	public int getBalance() {
		return balance;
	}

	// 다른 클래스 없이 그 클래스 단독으로 사용 가능한가?
	// 테스트가 필요함, main 함수를 추가함, 테스트 후 삭제
	
	// test
	public static void main(String[] args) {
		Purse p = new Purse();
		
		// 모든 경우를 임의로 테스트 해봄, 제대로 작동되는지 확인
		System.out.println(p.earn(50000));
		System.out.println(p.earn(30000));
		System.out.println(p.earn(-30000));
		
		System.out.println(p.spend(25000));
		System.out.println(p.spend(-75000));
		System.out.println(p.spend(75000));

		System.out.println(p.getBalance());
	}
	
}

// 내 클래스(컨트롤러)를 테스트 해봐야 하는데 팀원이 안 만들어줌
// 나 그럼 테스트 못 해보나? ㄴㄴ 테스트 전용 더미 클래스!
// 내가 직접 더미 클래스 만들어서 테스트 해봐야 함
// 교수님 강조!!! 더미 클래스 직접 만들 수 있어야 함

// dummy class for test
//public class Purse {
//	
//	private int balance; // no field variables
//
//	public boolean earn(int amount) {
//		System.out.println("입금 = " + + "원")
//		return true;
//	}
//	
//	public boolean spend(int amount) {
//		System.out.println("출금 = " + + "원")
//		return true;
//	}
//	
//	public int getBalance() {
//		return 0;
//	}
//
//}