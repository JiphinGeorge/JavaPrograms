import java.util.Scanner;

class Time {
    int hours;
    int minutes;
    int seconds;

    // Constructor to initialize time
    Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    // Method to add two time intervals
    static Time addTime(Time t1, Time t2) {
        Time result = new Time(0, 0, 0);

        result.seconds = t1.seconds + t2.seconds;
        result.minutes = t1.minutes + t2.minutes + result.seconds / 60;
        result.seconds = result.seconds % 60;
        result.hours = t1.hours + t2.hours + result.minutes / 60;
        result.minutes = result.minutes % 60;

        return result;
    }

    // Method to display time in hh:mm:ss format
    void display() {
        System.out.println(hours + " hours " + minutes + " minutes " + seconds + " seconds");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for first time interval
        System.out.println("Enter the first time interval (hours, minutes, seconds):");
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int s1 = sc.nextInt();
        Time t1 = new Time(h1, m1, s1);

        // Input for second time interval
        System.out.println("Enter the second time interval (hours, minutes, seconds):");
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        int s2 = sc.nextInt();
        Time t2 = new Time(h2, m2, s2);

        // Add the two time intervals
        Time sum = Time.addTime(t1, t2);

        // Display the result
        System.out.print("Sum of the two time intervals: ");
        sum.display();
    }
}
