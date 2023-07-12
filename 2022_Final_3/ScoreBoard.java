import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class ScoreBoard extends JFrame {

    private JLabel set_score_guest;
    private JLabel set_score_home;
    private PointButton point_guest;
    private PointButton point_home;

    public ScoreBoard() {
        Container cp = getContentPane();
        cp.setLayout(new GridLayout(4,1));
        JPanel p1 = new JPanel(new FlowLayout());
        
        String message1 = "Enter your name.\n";
        String input1 = JOptionPane.showInputDialog(message1);
        p1.add(new JLabel(input1));
        
        p1.add(new JLabel(":"));
        
        String message2 = "Enter your name.\n";
        String input2 = JOptionPane.showInputDialog(message2);
        p1.add(new JLabel(input2));
        
        cp.add(p1);
        JPanel p2 = new JPanel(new FlowLayout());
        set_score_guest = new JLabel("0");
        p2.add(set_score_guest);
        p2.add(new JLabel(":"));
        set_score_home = new JLabel("0");
        p2.add(set_score_home);
        cp.add(p2);
        JPanel p3 = new JPanel(new FlowLayout());
        point_guest = new PointButton(this);
        p3.add(point_guest);
        point_home = new PointButton(this);
        p3.add(point_home);
        cp.add(p3);
        JPanel p4 = new JPanel(new FlowLayout());
        p4.add(new NewButton(this));
        p4.add(new ExitButton());
        cp.add(p4);
        begin();
        setTitle("Badminton");
        setSize(200,160);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    
    
    /* begin - �� 寃쎄린瑜� 湲곕��� �� ����濡� ���� 踰��쇱�� 紐⑤�� 0�쇰� �명����怨�,  
     *         �명�� �ㅼ��대�� 0 : 0 �쇰� �명������.
     */
    public void begin() {
        if (matchOver()) {
            set_score_guest.setText("0");
            set_score_home.setText("0");
            point_guest.setText("0");
            point_home.setText("0");
        }
    }

    /* matchOver - 寃쎄린媛� ���щ��吏� �����댁���. �� 以� ����媛� 2�명�몃�� 癒쇱�� �곕㈃ �뱁�④� 寃곗������ 寃쎄린媛� ������.
     * @returns true - 寃쎄린媛� ���ъ��, false - 寃쎄린媛� ����吏� ������
     */
    public boolean matchOver() {
        int guest = Integer.parseInt(set_score_guest.getText());
        int home = Integer.parseInt(set_score_home.getText());
        return guest == 2 || home == 2;
    }
    
    /* update - �ㅼ��대낫��瑜� 媛깆������.
     */
    public void update() {
        int guest = Integer.parseInt(point_guest.getText());
        int home = Integer.parseInt(point_home.getText());
       
        if(guest >= 10 && home >= 10) {
        	if(guest - home == 2) {
        		JLabel winner = set_score_guest;
            	updateSetScore(winner);
            	point_guest.setText("0");
                point_home.setText("0");
        	}
        	if(home - guest == 2) {
        		JLabel winner = set_score_home;
            	updateSetScore(winner);
            	point_guest.setText("0");
                point_home.setText("0");
        	}
        }
        
        else {
        	if(guest == 11) {
            	JLabel winner = set_score_guest;
            	updateSetScore(winner);
            	point_guest.setText("0");
                point_home.setText("0");
            }
            if(home == 11) {
            	JLabel winner = set_score_home;
            	updateSetScore(winner);
            	point_guest.setText("0");
                point_home.setText("0");
            }
        }
        
    }
    
    /* updateSetScore - �밸━�� ������ �명�� �ㅼ��대�� 1 利�媛����⑤��.
     * @param winner - �밸━�� ������ JLabel 媛�泥�
     */
    private void updateSetScore(JLabel winner) {
        int new_set_score = Integer.parseInt(winner.getText()) + 1;
        winner.setText(Integer.toString(new_set_score));
    }

}