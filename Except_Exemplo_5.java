public class Except_Exemplo_5 {
    public static void main(String[] args) {
        int result, num1, num2;
        try {
            num1 = 0;
            num2 = 25;
            result = num2 / num1;
            System.out.println(result);
            System.out.println("Estou no bloco try");
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("Divisão por zero não permitida!");
        } finally {
            System.out.println("Este é o bloco finally!");
        }
        System.out.println("Fora do bloco try/catch/finally");
    }
}
