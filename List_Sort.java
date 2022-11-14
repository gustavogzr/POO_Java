import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class List_Sort {
    private static final String suits[] = {"Hearts","Diamonds","Clubs","Spades"};
    public void printElements() {
        List<String> list = Arrays.asList(suits);
        System.out.printf("Unsorted array elements:\n%s\n", list);
        Collections.sort(list);
        System.out.printf("Sorted array elements:\n%s\n", list);
    }
    public static void main(String[] args) {
        List_Sort list_sort = new List_Sort();
        list_sort.printElements();
    }
}
