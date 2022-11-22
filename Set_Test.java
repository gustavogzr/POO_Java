import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set_Test {
    private static final String colors[] = {"vermelho", "branco", "azul",
                                            "verde", "laranja", "branco", "cinza"};
                                            
    private void printNonDuplicates(Collection<String> collection) {
        Set<String> set = new HashSet<String>(collection);
        System.out.println("\nNonduplicates are: ");

        for (String s : set) {
            System.out.printf("%s ", s);
        }

        System.out.println();
    }

    public Set_Test() {
        List<String> list = Arrays.asList(colors);
        System.out.printf("ArrayList: %s\n", list);
        printNonDuplicates(list);
    }

    public static void main(String[] args) {
        new Set_Test();
    }
}
