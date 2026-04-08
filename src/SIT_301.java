public class SIT_301 {
    public static void main(String[] args) {
        int n = 40;

        for(int i = 2; i <= n; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
    static boolean isPrime(int num){
        if(num <= 1) return false;
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0) return false;
        }
        return true;
    }
}
