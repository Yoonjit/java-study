public class Hand {
    // ī�� ���� �ϴ� �������� �տ� ��� �ִ� ī���� ��

    private Card[] hand;
    private int number_of_cards;

    /** Card ���� �޼ҵ�
     * @param max - ��� ���� �� �ִ� ī���� �ִ� ��� */
    public Hand(int max) {
        hand = new Card[max];
    }

    /** ī�带 ���� �޴´�. �ѵ��� �ʰ��ϸ� ���� �� ����.
     * @param c - ī��
     * @return ���������� �޾����� true, �׷��� ������ false
     */
    public boolean receiveCard(Card c) {
        if (number_of_cards < hand.length) {
            hand[number_of_cards] = c;
            number_of_cards += 1;
            return true;
        }
        else
            return false;
    }

    /** ������ ī�带 ����. ������ �� �� ����.
     * @param c - ī��
     * @return ī�尡 ������ �տ��� �����ϰ� true�� ����, ������ false�� ����
     */
    public boolean playCard(Card c) {
        boolean found = false;
        int index = 0;
        while (!found && index < number_of_cards) {
            if (hand[index].equals(c))
                found = true;
            else
                index += 1;
        }
        if (found) {
            for (int i = index+1; i < number_of_cards; i++)
                hand[i-1] = hand[i];
            number_of_cards -= 1;
            hand[number_of_cards] = null;
            return true;
        }
        else
            return false;
    }

    /** ��� �ִ� ī�带 ��� ����â�� ���� �ش�.
     *  ī�尡 ������ ������ �˷� �ش�. */
    public void showHand() {
        if (number_of_cards == 0)
            System.out.println("ī�尡 �����ϴ�.");
        else {
            Card card;
            System.out.println(number_of_cards + "�� �ֽ��ϴ�.");
            for (int i = 0; i < number_of_cards; i++) {
                card = hand[i];
                System.out.println("#" + (i + 1) + " " + card.suit() + " " + card.rank());
            }
        }
    }

}