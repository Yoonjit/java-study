public class Counter {

    private int count; // ī��Ʈ�� ����ϰ� �ִ� �ʵ庯��

    /** Counter - ī���� �ʱ� ����
     * @param n - ī������ �ʱⰪ */
    public Counter(int n) { // ���۰��� �ָ� �װɷ� ī���Ͱ� ���۵�
        count = n;
    }

    /** increment - ī���� �� ���� */
    public void increment() {
        count += 1;
    }

    /** count - ī���� �� ����
     * @return ī���� ���� ��  */
    public int count() {
        return count;
    }

}