import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest {
    private static final String names[] = {"vermelho", "branco", "azul",
    "verde", "laranja", "branco", "cinza"};
    public SortedSetTest() {
        SortedSet<String> tree = new TreeSet<String>(Arrays.asList(names));
        System.out.println("Sorted set: ");
        printSet(tree);
        System.out.print("\nheadSet (\"laranja\"): ");
        printSet(tree.headSet("laranja"));
        System.out.print("tailSet (\"laranja\"): ");
        printSet(tree.tailSet("laranja"));
        System.out.printf("first: %s\n", tree.first());
        System.out.printf("last: %s\n", tree.last());
    }
    private void printSet(SortedSet<String> set) {
        for(String s : set)
            System.out.printf("%s ", s);
        System.out.println();
    }
    public static void main(String[] args) {
        new SortedSetTest();
    }
}
