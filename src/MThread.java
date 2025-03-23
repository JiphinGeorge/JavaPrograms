import java.util.Scanner;


public class MThread {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: "); 
        int limit = sc.nextInt();  // Reading the limit from the user
        sc.close();  // Closing the scanner to prevent memory leaks

        // Creating and starting the Odd number thread
        Thread t1 = new Thread(new OddNum(limit));
        t1.start();

        // Creating and starting the Even number thread
        Thread t2 = new Thread(new EvenNum(limit));
        t2.start();
    }
}

// Class to print odd numbers using a thread
class OddNum implements Runnable {
    private final int limit;

    public OddNum(int limit) { 
        this.limit = limit;  // Assigning the limit
    }

    public void run() {
        for (int i = 1; i <= limit; i++) { 
            if (i % 2 != 0) {  // Checking if the number is odd
                System.out.println("Odd: " + i);
            }
        }
    }
}

// Class to print even numbers using a thread
class EvenNum implements Runnable {
    private final int limit;

    public EvenNum(int limit) { 
        this.limit = limit;  // Assigning the limit
    }

    public void run() { 
        for (int i = 1; i <= limit; i++) { 
            if (i % 2 == 0) {  // Checking if the number is even
                System.out.println("Even: " + i);
            }
        }
    }
}


