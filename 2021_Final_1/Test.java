import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

	public static void main(String[] args){ // ���� �ذ� 1) �ڿ� throws Exception
		// ���� �ذ� 2) try, catch ����ϱ�
		try {
			System.out.println("��� �츮���� �����ص帳�ϴ�.");
			
			InputStreamReader reader = new InputStreamReader(System.in);
			BufferedReader keyboard = new BufferedReader(reader);
			String input = keyboard.readLine();
			// Unhandled exception type IOException : IOException �߻��� ��;; ������ �� ���ܤ�
			
			if (input.equals("yes")) System.out.println("�׷����ϴ�.");
			else if (input.equals("no")) System.out.println("�ƴմϴ�.");
			else System.out.println("���� yes�� no�ۿ� �𸨴ϴ�.");
		}
		catch (IOException e){}
	}
	
}