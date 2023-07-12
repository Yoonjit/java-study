public class PurseController {
	
	private PurseReader reader;
	
	private PurseWriter writer_won;
	private PurseWriter writer_yen;
	private PurseWriter writer; // Ȱ��ȭ�� writer ����ϱ�

	private Purse purse_won;
	private Purse purse_yen;
	private Purse purse; // Ȱ��ȭ�� purse ����ϱ�

	public PurseController(PurseReader r, PurseWriter w1, PurseWriter w2, Purse p1, Purse p2) {
		reader = r; 
		
		writer_won = w1;
		writer_yen = w2;
		writer = w1;
		
		purse_won = p1;
		purse_yen = p2;
		purse = p1;
		
		writer_won.showTransaction("Ȱ��");
		writer_yen.showTransaction("��Ȱ��");
	}
	
	public void processTransactions() {
		String message = "+, -, K, J, Q Ű �� �ϳ��� ������ OK ��ư�� ��������.\n";
		message += "���� +, ���� -, ��ȭ K, ��ȭ J, ���� Q";
		char request = reader.readRequest(message);
		message = "�ݾ��� �Է��ϰ� OK ��ư�� ��������.";
		
		int amount;
		
		if (request == 'Q' || request == 'q' ) {
			writer_won.showTransaction("���񽺸� ��Ĩ�ϴ�.");
			writer_yen.showTransaction("���񽺸� ��Ĩ�ϴ�.");
			return;
		}
		else if (request == '+') {
			amount = reader.readAmount(message);
			
			if (purse.earn(amount)) {
				writer.showTransaction(amount, "����");
			}
			else {
				writer.showTransaction("���� ����");
			}
		}
		else if (request == '-') {
			amount = reader.readAmount(message);
			
			if (purse.spend(amount)) {
				writer.showTransaction(amount, "����");
			}
			else {
				writer.showTransaction("���� ����");
			}
		}	
		else if (request == 'K' || request == 'k') {
			switchPurse(writer_won, purse_won);
		}
		else if (request == 'J' || request == 'j') {
			switchPurse(writer_yen, purse_yen);
		}
		else {
			writer.showTransaction("��û ����");
		}
		
		this.processTransactions();
	}
	
	private void switchPurse(PurseWriter w, Purse p) {
		writer.showTransaction("��Ȱ��");
		writer = w;
		purse = p;
		writer.showTransaction("Ȱ��");
	}
	
	// test
	public static void main(String[] args) {
		System.out.println();
	}
	
}