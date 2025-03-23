package External;

import java.util.Scanner;

public class Fib{
    public static void main(String args[]){
    int num1=0,num2=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the limit :");
    int limit=sc.nextInt();
    System.out.print("The Fibonacci are "+num1 +"\t"+num2+"\t");
    for(int i =num1+num2;i<=limit;i=num1+num2){
        num1=num2;
        num2=i;
        System.out.print("\t"+i);
    }
    
  }
}