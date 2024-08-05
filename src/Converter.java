import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length in centimeters: ");
        double cm = sc.nextDouble();
        
        double inches = cm / 2.54;

        double meters = cm / 100;
  
        double kilometers = cm / 100000;

        System.out.println(cm + " centimeters is equal to:");
        System.out.println(inches + " inches");
        System.out.println(meters + " meters");
        System.out.println(kilometers + " kilometers");

    }
}
