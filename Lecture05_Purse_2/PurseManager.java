public class PurseManager {
	
	public static void main(String[] args) {
		PurseReader r = new PurseReader();

		Purse p1 = new Purse();
		Purse p2 = new Purse();

		PurseWriter w1 = new PurseWriter("����ī(��ȭ)", 460, 0, p1);
		PurseWriter w2 = new PurseWriter("����ī(��ȭ)", 775, 0, p2);

		new PurseController(r, w1, w2, p1, p2).processTransactions();
	}
	
}