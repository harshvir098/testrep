package hilos;

public class Ex {

    public static void main(String[] args) {
        Thread persona1 = new Thread(new Persona(1));
        Thread persona2 = new Thread(new Persona(2));

        persona1.start();
        persona2.start();
    }

    static class Persona implements Runnable {
        private final int id;

        public Persona(int id) {
            this.id = id;
        }

        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println(" operación " + i);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}
