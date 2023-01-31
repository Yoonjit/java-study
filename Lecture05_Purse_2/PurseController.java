public class PurseController {
	
	private PurseReader reader;
	
	private PurseWriter writer_won;
	private PurseWriter writer_yen;
	private PurseWriter writer; // 활성화된 writer 기억하기

	private Purse purse_won;
	private Purse purse_yen;
	private Purse purse; // 활성화된 purse 기억하기

	public PurseController(PurseReader r, PurseWriter w1, PurseWriter w2, Purse p1, Purse p2) {
		reader = r; 
		
		writer_won = w1;
		writer_yen = w2;
		writer = w1;
		
		purse_won = p1;
		purse_yen = p2;
		purse = p1;
		
		writer_won.showTransaction("활성");
		writer_yen.showTransaction("비활성");
	}
	
	public void processTransactions() {
		String message = "+, -, K, J, >, <, Q 키 중 하나를 누르고 OK 버튼을 누르세요.\n";
		message += "수입 +, 지출 -, 한화 K, 일화 J, 환전(한일 >, 일한 <), 종료 Q";
		char request = reader.readRequest(message);
		message = "금액을 입력하고 OK 버튼을 누르세요.";
		
		int amount;
		
		if (request == 'Q' || request == 'q' ) {
			writer_won.showTransaction("서비스를 마칩니다.");
			writer_yen.showTransaction("서비스를 마칩니다.");
			return;
		}
		else if (request == '+') {
			amount = reader.readAmount(message);
			
			if (purse.earn(amount)) {
				writer.showTransaction(amount, "수입");
			}
			else {
				writer.showTransaction("수입 실패");
			}
		}
		else if (request == '-') {
			amount = reader.readAmount(message);
			
			if (purse.spend(amount)) {
				writer.showTransaction(amount, "지출");
			}
			else {
				writer.showTransaction("지출 실패");
			}
		}	
		// 환전 기능 추가하기
		// 한국 1000원일 때 일본 100엔
		else if(request == '>') { // 한국 지갑의 돈이 일본 지갑의 돈으로 들어감 (지출, 수입)
			amount = reader.readAmount(message);
			int amount_in_yen = amount/10;
			
			if (purse_won.spend(amount) && purse_yen.earn(amount_in_yen)) {
				writer_won.showTransaction(amount, "환전 지출");
				writer_yen.showTransaction(amount_in_yen, "환전 수입");
			}
			else {
				writer_won.showTransaction("환전 실패");
				writer_yen.showTransaction("환전 실패");
			}
		}
		else if(request == '<') { // 일본 지갑의 돈이 한국 지갑의 돈으로 들어감 (수입, 지출)
			amount = reader.readAmount(message);
			int amount_in_won = amount*10;
			
			if (purse_yen.spend(amount) && purse_won.earn(amount_in_won)) {
				writer_yen.showTransaction(amount, "환전 지출");
				writer_won.showTransaction(amount_in_won, "환전 수입");
			}
			else {
				writer_yen.showTransaction("환전 실패");
				writer_won.showTransaction("환전 실패");
			}
		}
		else if (request == 'K' || request == 'k') {
			switchPurse(writer_won, purse_won);
		}
		else if (request == 'J' || request == 'j') {
			switchPurse(writer_yen, purse_yen);
		}
		else {
			writer.showTransaction("요청 오류");
		}
		
		this.processTransactions();
	}
	
	private void switchPurse(PurseWriter w, Purse p) {
		writer.showTransaction("비활성");
		writer = w;
		purse = p;
		writer.showTransaction("활성");
	}
	
	// test
	public static void main(String[] args) {
		System.out.println();
	}
	
}