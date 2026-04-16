class BlockSynch_703 { // Application - Synchronization
    int available = 10;

    synchronized void booking(int seat) {
        System.out.println("Hello: " + Thread.currentThread().getName());
        System.out.println("Hello: " + Thread.currentThread().getName());
        System.out.println("Hello: " + Thread.currentThread().getName());

        synchronized (this) {
            String name = Thread.currentThread().getName();
            if (available >= seat) {
                System.out.println("Seats are booked: " + name + "--------------------------");
                available = available - seat;
                System.out.println("Available seats: " + available + "----------------------");
            } else {
                System.out.println("Sorry " + name + "--------------------------------------");
                System.out.println("Available seats: " + available + " only-----------------");
            }
        }

        System.out.println("Bye: " + Thread.currentThread().getName());
        System.out.println("Bye: " + Thread.currentThread().getName());
        System.out.println("Bye: " + Thread.currentThread().getName());
    }
}

public class SIT_703 extends Thread { // Multithreading

    static BlockSynch_703 op;
    int seat;

    public void run() {

    }

    public static void main(String[] args) {

        op = new BlockSynch_703();

        SIT_703 t1 = new SIT_703();
        SIT_703 t2 = new SIT_703();

        t1.setName("Onkar");
        t2.setName("Alankar");

        t1.seat = 7;
        t2.seat = 6;

        t1.start();
        t2.start();
    }
}
