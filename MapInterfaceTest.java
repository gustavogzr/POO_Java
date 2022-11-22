import java.util.HashMap;
import java.util.Map;

public class MapInterfaceTest {
    public static void main(String[] args) {
        Map<Integer, String> mapaNomes = new HashMap<Integer, String>();
        mapaNomes.put(1, "UNIVESP");
        mapaNomes.put(2, "USP");
        mapaNomes.put(3, "UNICAMP");
        mapaNomes.put(3, "UNESP");
        System.out.println(mapaNomes);
        System.out.println(mapaNomes.keySet());
        System.out.println(mapaNomes.values());
        System.out.println(mapaNomes.get(2));

    }
}
