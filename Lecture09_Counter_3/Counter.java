public class Counter { // �� Ŭ����
    private int count; // ī��Ʈ�� ����� �ʵ庯��

    /** Counter - ī���� �ʱ� ����
     * @param start - ī������ �ʱⰪ */
//    public Counter(int start) {
//        count = start;
//    }

    /** increment - ī���� �� ���� */
    public void increment() {
        count = count + 1;
    }

    /** count - ī���� �� ����
     * @return ī���� ���� ��  */
    public int count() {
        return count;
    }

}