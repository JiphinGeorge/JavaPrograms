
import java.util.Scanner;

public class Mark {
    
    private String name;
    private int rollNumber;
    
    public void readStudentDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student's name: ");
        name = scanner.nextLine();
        System.out.print("Enter roll number: ");
        rollNumber = scanner.nextInt();
    }

    
    public void displayStudentDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
}

class Hai extends Mark {
     int[] marks = new int[5];
     int total;
     double average;

    public void readMarks() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks for 5 subjects: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
    }

    private void calculateTotalAndAverage() {
        total = 0;
        for (int mark : marks) {
            total += mark;
        }
        average = total / 5.0;
    }

    public void displayMarksAndResult() {
        displayStudentDetails(); 
        System.out.println("Marks obtained in 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
        calculateTotalAndAverage();
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }
}
class Hello {
    public static void main(String[] args) {
        Hai marks = new Hai();
       
        marks.readStudentDetails();
        
        marks.readMarks();
        marks.displayMarksAndResult();
    }
}



