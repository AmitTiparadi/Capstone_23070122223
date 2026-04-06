// Q : 3 Employee Management System
// this is the classic structure A --> B, C --> D

// Q - create a real-time employee notification system.
// A = Employee
// B = EmailNotification
// C = SMSNotification
// D = Manager
// Both B & C inherit from A

interface Employee {
    default void notifyEmployee() {
        System.out.println("Notifying employee");
    }
}

interface EmailNotification extends Employee {
    default void notifyEmployee() {
        System.out.println("Notifying employee via Email");
    }
}

interface SMSNotification extends Employee {
    default void notifyEmployee() {
        System.out.println("Notifying employee via SMS");
    }
}

class Manager implements EmailNotification, SMSNotification {
    public void notifyEmployee() {
        EmailNotification.super.notifyEmployee();
        SMSNotification.super.notifyEmployee();
    }
}


public class Third {
}
