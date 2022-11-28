public class CriaThread extends Thread {
    static class Task1 extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("Utiliza Herança!");
            }
        }
    }
    static class Task2 implements Runnable {
        public void run() {
            for (int i = 0; i<10; i++) {
                System.out.println("Utiliza Runnable!");
            }
        }
    }
    public static void main(String[] args) {
        Thread threadComHeranca = new Task1();
        Task2 tarefa = new Task2();
        Thread threadComRunnable = new Thread(tarefa);
        threadComHeranca.start();
        threadComRunnable.start();
    }
}
