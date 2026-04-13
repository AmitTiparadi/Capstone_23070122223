// Multithreading
// Multithreading with Sync
// 1) normal sync
// 2) mehthod level sync
// 3) block level sync
// 4) stattic level sync

import static java.lang.Thread.sleep;


class SingleT601 extends Thread{
    public void run(){
        try{
            for (int i = 1; i<=3; i++){
                System.out.println("Bye SIT");
                Thread.sleep(2000);
            }
        }catch(InterruptedException e){

        }
    }
}

public class SIT_601 {

    public static void main(String[] args) {
        SingleT601 op = new SingleT601();
        op.start();
        try{
            for (int i = 1; i<=3; i++){
                System.out.println("Hello SIT");
                Thread.sleep(2000);
            }
        }catch(InterruptedException e){

        }
    }
}
