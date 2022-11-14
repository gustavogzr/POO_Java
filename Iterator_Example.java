import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_Example {

    public static void main(String[] args) {
        ArrayList<String> carsList = new ArrayList<String>();
        carsList.add("Volvo");
        carsList.add("BMW");
        carsList.add("Ford");
        carsList.add("Mazda");
        carsList.add("Toyota");
        
        Iterator<String> iMyList = carsList.iterator();
        
        while(iMyList.hasNext()) {
            String obj = (String) iMyList.next();
            System.out.println(obj);
        }
    }
}
