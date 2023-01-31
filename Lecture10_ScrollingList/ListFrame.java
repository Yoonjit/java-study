import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.WindowConstants;

public class ListFrame extends JFrame { // + JScrollBar라는 것도 있으니 나중에 찾아보기
	
    private Counter2[] counters;
    private JList items;

    public ListFrame(Counter2[] c) {
        counters = c;
        items = new JList(counters);  
        
        JScrollPane sp = new JScrollPane(items); // 스크롤바가 필요에 따라 자동으로 붙는 페인
        Container cp = getContentPane();
        cp.setLayout(new GridLayout(2, 1));
        cp.add(sp);
        
        JPanel p = new JPanel(new GridLayout(2, 1));
        p.add(new ListButton("Go", counters, this));
        p.add(new ExitButton("Quit"));
        cp.add(p); 	
        
        update();
        
        setTitle("Scroll List");
        setSize(280, 280);
        setLocation(630, 180);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public int getSelection() {
        return items.getSelectedIndex();
    }

    public void update() {
        items.clearSelection();
    }
    
}