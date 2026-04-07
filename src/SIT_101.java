// Diamond Problem
// Java does not support multiple inheritance with classes
// So this topic is usually demonstrated using interfaces
// Q : A smart home system has DeviceA and DeviceB and both systems have same ops i.e, turnOn
// sol : SmartDevice implements both method/interfaces.

interface DeviceA{
    default void turnOn(){
        System.out.println("Device A is on");
    }
}
interface DeviceB{
    default void turnOn(){
        System.out.println("Device A is on");
    }
}

class SmartDevice implements DeviceA, DeviceB{
    public void turnOn(){
        DeviceA.super.turnOn();
        DeviceA.super.turnOn();
    }
}

public class SIT_101 {
    public static void main(String[] args) {
        SmartDevice device = new SmartDevice();
        device.turnOn();
    }
}