public class Dice { // 모델 클래스 1
	
    private int face1; // 1번 주사위의 수
    private int face2; // 2번 주사위의 수
    private int sum; // 두 주사위의 합
    private int difference; // 두 주사위의 차
    private boolean twin; // 두 주사위가 같으면 TRUE, 다르면 FALSE
	
    public int face1() { return face1; }	
    public int face2() { return face2; }	
    public int sum() { return sum; }
    public int difference() { return difference; }
    public boolean twin() { return twin; }
	
    public void rollDice() { // 주사위 2개를 굴려서 필드 변수 값 지정하는 메소드
        face1 = (int)(Math.random() * 6) + 1; // 1~6 중 난수 생성
        face2 = (int)(Math.random() * 6) + 1;
        sum = face1 + face2;
        difference = Math.abs(face1 - face2);
        if (face1 == face2) {
        	twin = true;
        }
    }
    
}