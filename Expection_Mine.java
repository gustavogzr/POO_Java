public class Expection_Mine extends Exception{
    String str1;
    Expection_Mine(String str2) {
        str1 = str2;
    }
    @Override
    public String toString() {
        return("Ocorreu a minha exceção: " + str1);
    }
    public static void main(String[] args) {
        try {
            System.out.println("Início do bloco try...");
            throw new Expection_Mine("Minha mensagem de erro!");
        } catch (Expection_Mine exp) {
            System.out.println("Bloco catch!");
            System.out.println(exp);
        }
    }
}
