public abstract class CardPlayer implements CardPlayerBehavior {
	// �Ϻθ� ������ �Ŵϱ� abstract �տ� ����� ��

    private Card[] hand; // ���� �ִ� ī��
    private int card_count; // ���� �ִ� ī���� �� ��
    
    /** receiveCard - ī�带 �� �� �޴´�. �ѵ�(�迭 hand�� ũ��)�� �ʰ��ϸ� ���� �� ����.
     * @param c - ī��
     * @return ���������� �޾����� true, �׷��� ������ false */
    public boolean receiveCard(Card c) {
        if (card_count < hand.length) {
            hand[card_count] = c;
            card_count += 1;
            return true;
        }
        else
            return false;
    }

//    /** Constructor CardPlayer - max_cards ī�带 ���밡���� Card �迭 ��ü�� ����� CardPlayer ����
//     * @param max_cards - ��� ���� �� �ִ� ī���� �ִ� �� */
//    public CardPlayer(int max_cards) {
//        hand = new Card[max_cards];
//        card_count = 0;
//    }
//
//    /** wantsACard - ī�� �� ���� �ްڴ��� ���Ѵ�.
//     * @return ī�带 �ް� ������ true, �ƴϸ� false */
//    public abstract boolean wantsACard();
//
//    
//    /** showCards - ��� �ִ� ī�带 ���ش�.
//     * @return ��� �ִ� ī�� ��ü  */
//    public Card[] showCards() {
//        Card[] card = new Card[card_count];
//        for (int i = 0; i < card_count; i++)
//            card[i] = hand[i];
//        return card;
//    }

}