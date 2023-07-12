public class CounterStarter { // 스타터 클래스
	
    public static void main(String[] args) {
        Counter model = new Counter();
        Drawing panel = new Drawing(model);
        new CounterFrame(model, panel);
    }

}