import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ApiStream_Exemplo {
    public static void main(String[] args) {
        List<Integer> numList1 = Arrays.asList(10,20,30,40);
        List<Integer> multiplica = numList1.stream().map(y -> y*y).collect(Collectors.toList());
        System.out.println("Resultado da multiplicação: " + multiplica);

        List<String> nomes = Arrays.asList("UNIVESP", "USP", "UNICAMP", "UNESP");
        List<String> resultado = nomes.stream().filter(s->s.startsWith("UN")).collect(Collectors.toList());
        System.out.println("Resultado do filtro: " + resultado);
        List<String> mostra = nomes.stream().sorted().collect(Collectors.toList());
        System.out.println("Resultado com método sorted: " + mostra);

        List<Integer> numList2 = Arrays.asList(100,200,300,400,500);
        Set<Integer> multiplicaSet = numList2.stream().map(x->x*x).collect(Collectors.toSet());
        System.out.println("Resultado método Collect + Set: " + multiplicaSet);

        numList2.stream().map(x->x*x).forEach(y->System.out.println(y));
    }
}