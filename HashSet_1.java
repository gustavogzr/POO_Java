import java.util.HashSet;
import java.util.Set;

public class HashSet_1 {
    public static void main(String[] args) {
        Set<String> cargos = new HashSet<>();
        cargos.add("Gerente");
        cargos.add("Diretor");
        cargos.add("Presidente");
        cargos.add("Secretária");
        cargos.add("Funcionário");
        System.out.println(cargos.add("Diretor"));
        
        System.out.println(cargos);

    }
}


