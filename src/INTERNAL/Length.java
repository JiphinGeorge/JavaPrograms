package INTERNAL;

import java.util.Scanner;
public class Length{
public static void main (String args[]){

Scanner sc = new Scanner(System.in);
System.out.println("Enter the Length in Centimeters :");
double length = sc.nextDouble();
double inch = length /2.54;
double meters =length/100;
double kilometer = length/10000;
System.out.println("The Length "+length+"is Equal to ");
System.out.println(inch+" inches");
System.out.println(meters+" m");
System.out.println(kilometer+" km");
}
}