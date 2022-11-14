import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Iterador {
    public static void main(String[] args) {
        Set<Integer> mySet = new HashSet<Integer>();
        mySet.add(1);
        mySet.add(3);
        mySet.add(2);
        mySet.add(3);
        mySet.add(1);
        Iterator<Integer> iMySet = mySet.iterator();
        while(iMySet.hasNext()) {
            System.out.println(iMySet.next());
        } 
    }
    
}
