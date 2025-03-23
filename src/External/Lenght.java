package External;

import java.util.Scanner;
public class Lenght{
    public static void main (String args[])
    {
    
     Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Length in Centimeter :");
    int cm =sc.nextInt();
    double meter = cm/100.0;
    double inch = cm/2.54;
    double km = cm /10000.0;
    
    System.out.println(cm +" Centimeter is : ");
    System.out.println(inch+" inches");
    System.out.println(meter+" m");
    System.out.println(km +" kilometer");
     }
    }