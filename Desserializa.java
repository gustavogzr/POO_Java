import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Desserializa {
    public static void main(String[] args) {
        Funcionario_Serie e;
        try {
            try (FileInputStream fileIn = new FileInputStream("C:\\Users\\gusta\\POO_Java\\funcionario.ser");
                    ObjectInputStream in = new ObjectInputStream(fileIn)) {
                    e = (Funcionario_Serie) in.readObject();
                }
            } catch(IOException i) {
                return;
            } catch (ClassNotFoundException c) {
            System.out.println("Classe Funcionario_Serie não encontrada!");
            return;
        }
        System.out.println("Funcionario desserealizado:");
        System.out.println("Nome: " + e.nome);
        System.out.println("Endereco: " + e.endereco);
        System.out.println("Id: " + e.id);
        System.out.println("Numero: " + e.numero);
    }
}
