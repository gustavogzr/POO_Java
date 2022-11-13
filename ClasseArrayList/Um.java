package ClasseArrayList;

import java.util.ArrayList;

public class Um {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<>();
        int i;

        for(i=10; i<=70 ; i=i+10) {
            x.add(i);
        }
        mostrar(x);
        x.remove(1);
        x.add(0, 55);
        mostrar2(x);

    }
    public static void mostrar(ArrayList<Integer> lista) {
        int i, n = lista.size();
        for(i=0;i<n;i++) {
            System.out.printf("%d: %d\n", i, lista.get(i));
        }
    }
    public static void mostrar2(ArrayList<Integer> lista) {
        System.out.print("\n{");
        for(Integer item: lista) {
            System.out.printf(" %d", item);
        }
        System.out.print(" }\n\n");
    }
}
