import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_Remove {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<Integer>();
        myList.add(5);
        myList.add(9);
        myList.add(12);
        myList.add(18);
        myList.add(25);
        myList.add(55);
        myList.add(67);
        myList.add(81);
        myList.add(83);
        
        for(Iterator<Integer> it = myList.iterator(); it.hasNext();) {
            if(it.next()>10) {
                it.remove();
            }
        }
        for(Integer eachElement : myList) {
            System.out.println(eachElement);
        }    
    }
}
