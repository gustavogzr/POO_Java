import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class List_Reverse_Fill {
    private final Character[] letters = {'F','C','M'};
    private Character[] lettersCopy;
    private List<Character> list;
    private List<Character> copyList;

    public List_Reverse_Fill() {
        list = Arrays.asList(letters);
        lettersCopy = new Character[3];
        copyList = Arrays.asList(lettersCopy);
        System.out.println("Initial list: ");
        output(list);
        Collections.reverse(list);
        System.out.println("After calling reverse: ");
        output(list);
        Collections.copy(copyList, list);
        System.out.println("After copying: ");
        output(copyList);
        Collections.fill(list, 'R');
        System.out.println("After calling fill: ");
        output(list);
    }
    private void output(List<Character> listRef) {
        System.out.print("The list is: ");
        for(Character eachElement : listRef) {
            System.out.printf("%s ", eachElement);
        }
        System.out.printf("\nMax: %s", Collections.max(listRef));
        System.out.printf("\nMin: %s\n", Collections.min(listRef));
    }
    public static void main(String[] args) {
        new List_Reverse_Fill();
    }
}
