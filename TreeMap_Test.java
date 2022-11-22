import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap_Test {
    public static void main(String[] args) {
        TreeMap<Integer, String> tmap;
        tmap = new TreeMap<Integer, String>();
        tmap.put(1,"UNIVESP");
        tmap.put(7,"USP");
        tmap.put(6,"UNICAMP");
        tmap.put(4,"UNESP");
        tmap.put(5,"UFMG");
        Set set = tmap.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.print("A chave é: " + mentry.getKey() + " & O valor é: ");
            System.out.println(mentry.getValue());
        }
    }
}
