public class Counter2 extends Counter { // ��� ������� ī���� Ŭ������ ��� ��ӹ���

    private int index;

    public Counter2(int n, int i) {
        super(n); // �ʱⰪ�� ī������ �ʱⰪ�̴ϱ� super
        index = i;
    }

    // toString() �������̵�, �����, ���� toString �� ���� ���� ���� �� ����
    public String toString() { // ����Ʈ���ٰ� �� �Ŵϱ� ���� �ʿ��� (����)
        return "Counter " + index + " has " + count();
    }
    
}