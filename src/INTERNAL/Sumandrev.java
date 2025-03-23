package INTERNAL;

import java.util.Scanner;

public class  Sumandrev{

public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a digit to find the sum and Reverse :");
int sum = sc.nextInt();
Childsumandrev obj = new Childsumandrev();
obj.sum(sum);
obj.rev(sum);
}
}
class Childsumandrev{
int s=0,rev=0;
        void sum(int a){
        while(a>0)
        {
        int last= a%10;
        s=s+last;
        a=a/10;
        }
        System.out.println("The sum is "+s);
                }
        void rev(int a){

        while(a>0){
        int last=a%10;
        rev= rev*10+last;
        a=a/10;
        }
        System.out.println("The Revese of the number is "+rev);
        }
}