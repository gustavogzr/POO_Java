import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;

public class Stream_Exemplo_3 {
    public static void main(String[] args) throws Exception {
        ByteArrayOutputStream byteArrayOutStr = new ByteArrayOutputStream();
        BufferedOutputStream buffOutputStr 
            = new BufferedOutputStream(byteArrayOutStr);
        for (int i = 65; i<91; i++) {
            buffOutputStr.write(i);
        }
        buffOutputStr.flush();
        for(byte by : byteArrayOutStr.toByteArray()) {
            char ch = (char)by;
            System.out.print(ch);  
        }
    }
}
