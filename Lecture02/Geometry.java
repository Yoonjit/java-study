public class Geometry {
	
    public static void main(String[] args) {
    	int radius1;
        int area1;
        radius1 = 7;
        area1 = (int)(3.14 * radius1 * radius1);
        System.out.println(area1);
        
        int radius2;
        int area2;
        radius2 = 7;
        area2 = (int)(Math.PI * Math.pow(radius2, 2)); 
        System.out.println(area2);
    }
    
}