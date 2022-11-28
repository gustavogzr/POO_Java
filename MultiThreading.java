public class MultiThreading implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " está executando.");
        } catch (Exception e) {
            System.out.println("Exceção gerada!");
        }
    }
}
