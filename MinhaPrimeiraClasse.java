public class MinhaPrimeiraClasse implements MinhaPrimeiraInterface {
    public void metodo1() {

    }
    public int metodo2() {
        return 10;
    }
    public String metodo3(String parametro1) {
        return null;
    }
    public static void main(String[] args) {
        System.out.println("Implementação da primeira interface...");
        MinhaPrimeiraClasse mpc = new MinhaPrimeiraClasse();
        System.out.println(mpc.metodo2());
        System.out.println(mpc.metodo3("teste"));
    }
}