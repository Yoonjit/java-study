public class Demo {
	
    public static void main(String[] args) {
    	String slogan = "������ ��¥�� �ƴϴ�";
        System.out.println(slogan);
        System.out.println(slogan.length());
        
        String slogan2 = "  " + slogan + "  ";
        System.out.println(slogan2 + "!");
        System.out.println(slogan2.length());
        
        String slogan3 = slogan2.trim(); // �¿� ���� ����
        System.out.println(slogan3 + "!");
        System.out.println(slogan);
        System.out.println(slogan3);
        System.out.println(slogan == slogan3); // ���ڿ��� �� �ּҰ� �ٸ�(�ּҸ� ���ϰ� ��), false
        System.out.println(slogan.equals(slogan3)); // ������ ����, ���ΰ����� ���ΰ�3�� �ּҸ� �ְ� ��
        System.out.println(slogan.charAt(5));
        System.out.println(slogan.substring(4,6));
        
        String slogan_eng = "Freedom is not free";
        System.out.println(slogan_eng);
        System.out.println(slogan_eng.toUpperCase());
        System.out.println(slogan_eng.toLowerCase());
        System.out.println(slogan_eng.indexOf('o'));
        System.out.println(slogan_eng.indexOf('o',6));
        System.out.println("a".compareTo("d"));
        System.out.println("D".compareTo("A"));
    }
    
}