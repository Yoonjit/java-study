public class CounterStarter { // ��Ÿ�� Ŭ����
	
    public static void main(String[] args) {
        Counter model = new Counter();
        Drawing panel = new Drawing(model);
        new CounterFrame(model, panel);
    }

}