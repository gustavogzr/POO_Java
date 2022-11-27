import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Stream_Exemplo_4 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader fileReader = new FileReader("C:\\Users\\gusta\\POO_Java\\entrada.txt");
        BufferedReader buffReader = new BufferedReader(fileReader);

        while (buffReader.ready()) {
            System.out.println("Caractere: " + (char)buffReader.read());
        }
        buffReader.close();
    }
}
