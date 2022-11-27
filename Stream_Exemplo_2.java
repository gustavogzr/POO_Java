import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Stream_Exemplo_2 {
    public static void main(String[] args) throws Exception {
        FileInputStream inputStream = new FileInputStream("C:\\Users\\gusta\\POO_Java\\entrada.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        while (bufferedInputStream.available() > 0) {
            char c = (char)bufferedInputStream.read();
            System.out.println("Caractere: " + c);
        }
        bufferedInputStream.close();
    }
}
