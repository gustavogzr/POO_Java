public class Throw_Exemplo {
    public static void main(String[] args) {
        try {
            Throw_Teste obj = new Throw_Teste();
            obj.meuMetodo(1);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
