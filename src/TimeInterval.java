import java.util.Scanner;

class TimeInterval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for first time interval
        System.out.println("Enter the first time interval (hours, minutes, seconds):");
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int s1 = sc.nextInt();

        // Input for second time interval
        System.out.println("Enter the second time interval (hours, minutes, seconds):");
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        int s2 = sc.nextInt();

        // Add seconds, minutes, and hours
        int totalSeconds = s1 + s2;
        int totalMinutes = m1 + m2 + totalSeconds / 60;
        int totalHours = h1 + h2 + totalMinutes / 60;

        // Normalize seconds and minutes
        totalSeconds = totalSeconds % 60;
        totalMinutes = totalMinutes % 60;

        // Output the result
        System.out.println("Sum of the two time intervals: " + totalHours + " hours " 
                + totalMinutes + " minutes " + totalSeconds + " seconds");
    }
}

