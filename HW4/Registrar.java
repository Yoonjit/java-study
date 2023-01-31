import javax.swing.JOptionPane;

public class Registrar { // 뷰 클래스 (input)
						 // 외부 사용자에게서 정보를 받아서 전달하는 역할
	
    public String invitePlayer() {
        return JOptionPane.showInputDialog("이름을 등록해 주세요."); // 플레이어 이름
    }
	
    public int wantToContnue() {
        return JOptionPane.showConfirmDialog(null, "더 하시겠어요?"); // Yes 누르면 0 전달
        														 // No 누르면 다른 수 전달
    }

}