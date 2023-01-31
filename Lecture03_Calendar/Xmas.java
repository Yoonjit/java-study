public class Xmas {

	public static void main(String[] args) {
		Model m = new Model();
		ViewOut o = new ViewOut();
		
		new Controller().controlXmas(m, o);
	}

}