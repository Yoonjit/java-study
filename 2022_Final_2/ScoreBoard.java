import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
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
        p1.add(new JLabel("Guest"));
        p1.add(new JLabel(":"));
        p1.add(new JLabel("Home"));
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
    
    
    /* begin - 새 경기를 기록할 수 있도록 점수 버튼을 모두 0으로 세팅하고,  
     *         세트 스코어도 0 : 0 으로 세팅한다.
     */
    public void begin() {
        if (matchOver()) {
            set_score_guest.setText("0");
            set_score_home.setText("0");
            point_guest.setText("0");
            point_home.setText("0");
        }
    }

    /* matchOver - 경기가 끝났는지 판정해준다. 둘 중 하나가 2세트를 먼저 따면 승패가 결정되어 경기가 끝난다.
     * @returns true - 경기가 끝났음, false - 경기가 끝나지 않았음
     */
    public boolean matchOver() {
        int guest = Integer.parseInt(set_score_guest.getText());
        int home = Integer.parseInt(set_score_home.getText());
        return guest == 2 || home == 2;
    }
    
    /* update - 스코어보드를 갱신한다.
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
    
    /* updateSetScore - 승리한 선수의 세트 스코어를 1 증가시킨다.
     * @param winner - 승리한 선수의 JLabel 객체
     */
    private void updateSetScore(JLabel winner) {
        int new_set_score = Integer.parseInt(winner.getText()) + 1;
        winner.setText(Integer.toString(new_set_score));
    }

}