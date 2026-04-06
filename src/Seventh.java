// Jack is excited on sundays as he gets to play entire day
// Every time a new month starts, Jack always counts the number of Sundays
// Count the number of Sundays jack will get within a number of n days

import java.util.Scanner;

public class Seventh {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of days: ");
            int n = scanner.nextInt();
            System.out.println("Enter the staring day of the month (0 for Sunday, 1 for Monday, ..., 6 for Saturday): ");
            int startDay = scanner.nextInt();
            int sundays = countSundays(n, startDay);
            System.out.println("Number of Sundays in " + n + " days: " + sundays);
        }

        public static int countSundays(int n, int startDay) {
            int sundays = 0;
            for (int i = 0; i < n; i++) {
                if ((startDay + i) % 7 == 0) { // Check if the day is Sunday
                    sundays++;
                }
            }
            return sundays;
        }
}
