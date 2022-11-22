import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main_Teste_2 {
    public static void main(String[] args) {

        HashSet<String> dset = new HashSet<String>();

        dset.add("Zoraide");

        dset.add("Maria");

        dset.add("Janete");

        dset.add("João");

        dset.add("Heitor");



        Iterator<String> iterator = dset.iterator();



        while (iterator.hasNext()) {

            System.out.print(iterator.next() + " ");

        }

    }
}
