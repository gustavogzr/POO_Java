import java.io.IOException;

public class Throw_Teste {
    void meuMetodo(int num) throws IOException, ClassNotFoundException {
        if(num==1)
            throw new IOException("Ocorreu IOException!");
        else
            throw new ClassNotFoundException("ClassNotFoundException");
    }
}