import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

	public static void main(String[] args){ // 문제 해결 1) 뒤에 throws Exception
		// 문제 해결 2) try, catch 사용하기
		try {
			System.out.println("영어를 우리말로 번역해드립니다.");
			
			InputStreamReader reader = new InputStreamReader(System.in);
			BufferedReader keyboard = new BufferedReader(reader);
			String input = keyboard.readLine();
			// Unhandled exception type IOException : IOException 발생할 듯;; 컴파일 안 해줌ㅋ
			
			if (input.equals("yes")) System.out.println("그렇습니다.");
			else if (input.equals("no")) System.out.println("아닙니다.");
			else System.out.println("저는 yes와 no밖에 모릅니다.");
		}
		catch (IOException e){}
	}
	
}