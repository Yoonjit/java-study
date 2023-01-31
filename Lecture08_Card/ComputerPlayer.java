public class ComputerPlayer extends CardPlayer implements CardPlayerBehavior{

//    public ComputerPlayer(int max_cards) {
//        super(max_cards);
//    }

    public boolean wantsACard() {
        boolean decision;
        Card[] cards = showCards();
        // 게임에 따라 다른 전략을 세움
        return true;
    }

}