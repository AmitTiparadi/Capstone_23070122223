public class SIT_303 {
    public static void main(String[] args) {

        int n = 3;
        play(n, 'A', 'B', 'C');

    }

    private static void play(int n, char source, char helper, char destination) {
        if(n == 1){
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }
        play(n-1, source, destination, helper);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        play(n-1, helper, source, destination);
    }

}
