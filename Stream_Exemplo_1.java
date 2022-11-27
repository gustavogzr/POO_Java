import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Stream_Exemplo_1 { 
    public static void main(String[] args) {
        InputStream inputstream;
        try {
            inputstream = new FileInputStream("C:\\Users\\gusta\\POO_Java\\entrada.txt");
            int data = inputstream.read();
            while (data != -1) {
                System.out.println(data);
                data = inputstream.read();
            }
            inputstream.close();
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
