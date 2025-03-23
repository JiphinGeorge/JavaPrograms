package External;

import java.util.Scanner;

public class Volume{

    public static void main(String args[]){
    Calculator obj = new Calculator();
    obj.readData();
    obj.dispvolume();
    }
    }
    
    class Calculator{
    double rofsphere, rofc,hofc;
    
    void readData(){
    Scanner sc= new Scanner (System.in);
    System.out.println("Enter the radious of the sphere:");
    rofsphere = sc.nextDouble();
    System.out.println("Enter the radious of the Cylinder:");
    rofc=sc.nextDouble();
    System.out.println("Enter the height of the Cylinder:");
    hofc=sc.nextDouble();
    }
    
   void dispvolume(){
    System.out.println("The volume of the sphere is "+(4.0/3.0)*3.14*rofsphere*rofsphere*rofsphere);
    System.out.println("The volume of the cylinder is "+3.14*rofc*rofc*hofc);
    
    }
    }