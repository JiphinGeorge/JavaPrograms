package External;

import java.util.Scanner;
public class Overloading {
 
    public static void main(String args[]){
   double a,b,c;
   Scanner sc = new Scanner(System.in);
   Cal obj= new Cal();
   System.out.println("Enter the lemnght of side of the cube :");
   a= sc.nextInt();
   obj.volume(a);
   
   
   System.out.println("Enter the length, breath, heigh of side of the Rectangular box :");
   a= sc.nextInt();
   b=sc.nextInt();
   c=sc.nextInt();
   obj.volume(a,b,c);
   
   System.out.println("Enter the radious and height of side of the cylinder :");
   a= sc.nextInt();
   b= sc.nextInt();
   obj.volume(a,b);
   
   
   
   }
    }
   class Cal {
   void volume(double a)
   {
   System.out.println("The area of the cube is "+a*a*a);
   }
   void volume(double a, double b, double c)
   {
   System.out.println("The area of the Rectangular box  is "+a*b*c);
   }
   void volume(double a, double b)
   {
   System.out.println("The area of the cylinder is " +3.14*a*a*b);
   }
   
   }