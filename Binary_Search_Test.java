import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Binary_Search_Test {
    private static final String colors[] = {"red","white","blue","black",
    "yellow", "purple", "tan", "pink"};
    private List<String> list;

    public Binary_Search_Test() {
        list = new ArrayList<String>(Arrays.asList(colors));
        Collections.sort(list);
        System.out.printf("Sorted ArrayList: %s\n", list);
    }
    private void search() {
        printSearchResults(colors[3]); //primeiro item
        printSearchResults(colors[0]); //item intermediário
        printSearchResults(colors[7]); //último item
        printSearchResults("aqua"); // abaixo do mais baixo
        printSearchResults("gray"); //não existe
        printSearchResults("teal"); //não existe
        printSearchResults("purple"); //não existe
    }
    private void printSearchResults(String key) {
        int result = 0;
        System.out.printf("\nSearching for: %s\n", key);
        result = Collections.binarySearch(list, key);
        if(result>=0) {
            System.out.printf("Found at index %d\n", result);
        } else {
            System.out.printf("Not Found (%d)\n", result);
        }
    }
    public static void main(String[] args) {
        Binary_Search_Test binarySearchTest = new Binary_Search_Test();
        binarySearchTest.search();
    }
}
