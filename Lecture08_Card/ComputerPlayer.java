public class ComputerPlayer extends CardPlayer implements CardPlayerBehavior{

//    public ComputerPlayer(int max_cards) {
//        super(max_cards);
//    }

    public boolean wantsACard() {
        boolean decision;
        Card[] cards = showCards();
        // ���ӿ� ���� �ٸ� ������ ����
        return true;
    }

}