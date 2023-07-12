public class Demo {
	
    public static void main(String[] args) {
    	String slogan = "자유는 공짜가 아니다";
        System.out.println(slogan);
        System.out.println(slogan.length());
        
        String slogan2 = "  " + slogan + "  ";
        System.out.println(slogan2 + "!");
        System.out.println(slogan2.length());
        
        String slogan3 = slogan2.trim(); // 좌우 공백 제거
        System.out.println(slogan3 + "!");
        System.out.println(slogan);
        System.out.println(slogan3);
        System.out.println(slogan == slogan3); // 문자열이 들어간 주소가 다름(주소를 비교하게 됨), false
        System.out.println(slogan.equals(slogan3)); // 내용을 비교함, 슬로건한테 슬로건3의 주소를 주고 비교
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