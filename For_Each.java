import java.util.ArrayList;

public class For_Each {

    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<Integer>();
        myList.add(1);
        myList.add(2);
        for(Integer listElements : myList) {
            System.out.println(listElements);
        }
    }
}
