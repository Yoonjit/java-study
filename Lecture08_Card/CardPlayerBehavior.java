public interface CardPlayerBehavior {

    /** wantsACard - ī�� �� ���� �ްڴ��� ���Ѵ�.
     * @return ī�带 �ް� ������ true, �ƴϸ� false */
    public boolean wantsACard();

    /** receiveCard - ī�带 ���� �޴´�. �ѵ�(�迭 hand�� ũ��)�� �ʰ��ϸ� ���� �� ����.
     * @param c - ī��
     * @return ���������� �޾����� true, �׷��� ������ false */
    public boolean receiveCard(Card c);
    
}