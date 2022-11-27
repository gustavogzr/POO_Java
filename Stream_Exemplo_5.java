import java.io.BufferedWriter;
import java.io.IOException;
import java.io.StringWriter;

public class Stream_Exemplo_5 {
    public static void main(String[] args) throws IOException {
        StringWriter stringWriter = new StringWriter();
        BufferedWriter bufferedWriter = new BufferedWriter(stringWriter);
        bufferedWriter.write(85);
        bufferedWriter.write(78);
        bufferedWriter.write(73);
        bufferedWriter.write(86);
        bufferedWriter.write(69);
        bufferedWriter.write(83);
        bufferedWriter.write(80);
        bufferedWriter.flush();
        System.out.println(stringWriter.getBuffer());
    }
}
