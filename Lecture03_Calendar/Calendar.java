public class Calendar {

	public static void main(String[] args) {
		Model m = new Model();
		ViewIn i = new ViewIn();
		ViewOut o = new ViewOut();
		
		new Controller().control(m, i, o);
	}

}