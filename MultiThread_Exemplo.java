public class MultiThread_Exemplo {
    public static void main(String[] args) {
        int n = 8;
        for (int i = 0; i<n; i++) {
            Thread t = new Thread(new MultiThreading());
            t.start();
        }
    }
}
