package Estudo_Unicamp;

public class Contador_Aplicacao {
    public static void main(String args[]) {
        Contador umcont;
        umcont = new Contador();
        umcont.comeca(0);
        System.out.println(umcont.num);
        umcont.incrementa();
        System.out.println(umcont.num);
        umcont.decrementa();
        System.out.println(umcont.num);
    }
}
