import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializa {
    public static void main(String[] args) {
        Funcionario_Serie e = new Funcionario_Serie();
        e.nome = "Joao da Silva";
        e.endereco = "Rua das Flores";
        e.id = 203040;
        e.numero = 100;
        try {
            FileOutputStream fileOut = new FileOutputStream("C:\\Users\\gusta\\POO_Java\\funcionario.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.printf("Os dados serializados estão salvos no arquivo funcionario.ser");
        } catch (IOException i) {
            return;
        }
    }
}
