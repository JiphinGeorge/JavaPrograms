public class Marks {
    private int math;
    private int science;
    private int english;

    // Constructor
    public Marks(int math, int science, int english) {
        this.math = math;
        this.science = science;
        this.english = english;
    }

    // Getters
    public int getMath() {
        return math;
    }

    public int getScience() {
        return science;
    }

    public int getEnglish() {
        return english;
    }

    // Calculate total marks
    public int getTotalMarks() {
        return math + science + english;
    }

    // Calculate average marks
    public double getAverageMarks() {
        return getTotalMarks() / 3.0;
    }
    public static void main(String[] args) {
        // Create Marks object
        Marks marks = new Marks(75, 85, 90);

        // Create StudentRecord object with the Marks object
        StudentRecord student = new StudentRecord("John Doe", marks);

        // Display student details and result
        System.out.println("Student Name: " + student.getName());
        System.out.println("Math Marks: " + student.getMarks().getMath());
        System.out.println("Science Marks: " + student.getMarks().getScience());
        System.out.println("English Marks: " + student.getMarks().getEnglish());
        System.out.println("Total Marks: " + student.getMarks().getTotalMarks());
        System.out.println("Average Marks: " + student.getMarks().getAverageMarks());
        System.out.println("Result: " + student.getResult());
    }
}

public class StudentRecord {
    private String name;
    private Marks marks;

    // Constructor
    public StudentRecord(String name, Marks marks) {
        this.name = name;
        this.marks = marks;
    }

    // Get student name
    public String getName() {
        return name;
    }

    // Get student marks
    public Marks getMarks() {
        return marks;
    }

    // Calculate result
    public String getResult() {
        double average = marks.getAverageMarks();
        if (average >= 60) {
            return "Pass";
        } else {
            return "Fail";
        }
    }
}

