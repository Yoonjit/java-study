import javax.swing.JOptionPane; // 완성

public class Reader {
    
    public int readInput() {
        String input = JOptionPane.showInputDialog("번호를 선택하세요.");
        int number = Integer.parseInt(input);
        while (number < 1 || number > 16) {
            input = JOptionPane.showInputDialog("번호를 선택하세요.");
            number = Integer.parseInt(input);
        }
        return number;
    }

}