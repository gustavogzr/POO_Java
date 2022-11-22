import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapHashTest {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "UNIVESP");
        hm.put(2, "USP");
        hm.put(7, "UNICAMP");
        hm.put(9, "UNESP");
        hm.put(3, "UFMG");
        Set set = hm.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.print("A chave é: " + mentry.getKey() + " & o Valor é: ");
            System.out.println(mentry.getValue());
        }
        String var = hm.get(2);
        System.out.println("Valor no índice 2 é: " + var);
        hm.remove(3);
        System.out.println("Chave e valor do mapa após a remoção:");
        Set set2 = hm.entrySet();
        Iterator iterator2 = set2.iterator();
        while(iterator2.hasNext()) {
            Map.Entry mentry2 = (Map.Entry)iterator2.next();
            System.out.print("A chave é: " + mentry2.getKey() + " & o valor é: ");
            System.out.println(mentry2.getValue());
        }
    }
}