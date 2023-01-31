import java.awt.Color; // �ϼ�

public class Cell {
    
    private Color color; // ���� ����
    private boolean revealed; // ���������� ����, �巯������ ��
    
    public Cell(Color c) { // ���� ���� c�� ������
        color = c;
    }
    
    public Color color() { // ���� ���� �������� �˷���
        return color; 
    }

    public boolean revealed() { // �巯������ �����ִ��� �巯���� �޼ҵ�
        return revealed; 
    }
    
    public void reveal() { // �巯��
        revealed = true;
    }
    
    public void hide() { // ����
        revealed = false;
    }
    
    public boolean isATwinWith(Cell c) { // c�� ����� ������ �ٸ��� �����ϱ�
    	return color.equals(c.color());
    }

}