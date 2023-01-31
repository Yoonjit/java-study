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

	// �ٸ� Ŭ���� ���� �� Ŭ���� �ܵ����� ��� �����Ѱ�?
	// �׽�Ʈ�� �ʿ���, main �Լ��� �߰���, �׽�Ʈ �� ����
	
	// test
	public static void main(String[] args) {
		Purse p = new Purse();
		
		// ��� ��츦 ���Ƿ� �׽�Ʈ �غ�, ����� �۵��Ǵ��� Ȯ��
		System.out.println(p.earn(50000));
		System.out.println(p.earn(30000));
		System.out.println(p.earn(-30000));
		
		System.out.println(p.spend(25000));
		System.out.println(p.spend(-75000));
		System.out.println(p.spend(75000));

		System.out.println(p.getBalance());
	}
	
}

// �� Ŭ����(��Ʈ�ѷ�)�� �׽�Ʈ �غ��� �ϴµ� ������ �� �������
// �� �׷� �׽�Ʈ �� �غ���? ���� �׽�Ʈ ���� ���� Ŭ����!
// ���� ���� ���� Ŭ���� ���� �׽�Ʈ �غ��� ��
// ������ ����!!! ���� Ŭ���� ���� ���� �� �־�� ��

// dummy class for test
//public class Purse {
//	
//	private int balance; // no field variables
//
//	public boolean earn(int amount) {
//		System.out.println("�Ա� = " + + "��")
//		return true;
//	}
//	
//	public boolean spend(int amount) {
//		System.out.println("��� = " + + "��")
//		return true;
//	}
//	
//	public int getBalance() {
//		return 0;
//	}
//
//}