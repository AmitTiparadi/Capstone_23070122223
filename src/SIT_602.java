class BusSIT_602 implements Runnable {

    int availableSeats = 5;
    int seats;

    BusSIT_602(int passengers) {
        this.seats = passengers;
    }

    @Override
    public synchronized void run() {
        synchronized(this) {
            if (availableSeats >= seats) {
                System.out.println(Thread.currentThread().getName() +
                        ": Seats are available for " + seats + " passengers");
                availableSeats -= seats;
                System.out.println("Remaining seats: " + availableSeats);
            } else {
                System.out.println(Thread.currentThread().getName() +
                        ": Seats are NOT available for " + seats + " passengers");
                System.out.println("Remaining seats: " + availableSeats);
            }
        }
    }
}

public class SIT_602 {
    public static void main(String[] args) {
        BusSIT_602 bus = new BusSIT_602(2);

        Thread t1 = new Thread(bus, "Passenger 1");
        Thread t2 = new Thread(bus, "Passenger 2");
        Thread t3 = new Thread(bus, "Passenger 3");

        t1.start();
        t2.start();
        t3.start();
    }
}