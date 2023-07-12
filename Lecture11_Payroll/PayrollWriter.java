import java.io.FileWriter;
import java.io.PrintWriter;

public class PayrollWriter {

    private PrintWriter outfile;

    public PayrollWriter(String file_name) { // 쓸 파일 이름이 주어지면
        try {
            outfile = new PrintWriter(new FileWriter(file_name));
        }
        catch (Exception e) {
            System.out.println("PayrollWriter Error: " + file_name);
            throw new RuntimeException(e.toString());
        }
    }

    public void close() {
        outfile.close();
    }

    public void printCheck(String name, int payment) {
        outfile.println(name + "," + payment);
    }

    public void printCheck(String s) { // !
        outfile.println(s);
    }

}