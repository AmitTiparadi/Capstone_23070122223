// Q : Payment Gateway system
// An e-commerce website uses
// UPI gateway and Card Payment
// Both gateways have a method processPayment(), A hybrid payment gateway can process both types of payments.

import java.util.Scanner;

interface UpiGateway {
    default void processPayment() {
        System.out.println("Processing payment through UPI Gateway");
    }
}
interface CardPaymentGateway {
    default void processPayment() {
        System.out.println("Processing payment through Card Payment Gateway");
    }
}

class HybridPaymentGateway implements UpiGateway, CardPaymentGateway {
    Scanner scanner = new Scanner(System.in);
    public void processPayment() {
//        UpiGateway.super.processPayment();
//        CardPaymentGateway.super.processPayment();
        System.out.println("Select payment method: 1 for UPI, 2 for Card");
        int choice = scanner.nextInt();
        if (choice == 1) {
            UpiGateway.super.processPayment();
        } else if (choice == 2) {
            CardPaymentGateway.super.processPayment();
        } else {
            System.out.println("Invalid choice");
        }
    }
}
public class Second {
    public static void main(String[] args) {
        HybridPaymentGateway gateway = new HybridPaymentGateway();
        gateway.processPayment();
    }
}
