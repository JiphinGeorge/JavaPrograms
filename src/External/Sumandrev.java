package External;

import java.util.Scanner;
public class Sumandrev{

        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Number :");
       int num = sc.nextInt();
       Childrev obj = new Childrev();
       obj.sum(num);
       obj.rev(num);
       }
         }
       
       class Childrev{
         void rev(int a)
       
       {
         int sum=0, d;
       while(a>0){
       
       d=a%10;
       sum=sum*10+d;
       a=a/10;
       
        }
       System.out.println("The Reverse of the Number is :"+sum);
       
       
        }
       
       
        void sum(int a)
       
       {
         int sum=0, d;
       while(a>0){
       
       d=a%10;
       sum=sum+d;
       a=a/10;
       
        }
       System.out.println("The Sum of the Number is :"+sum);
       
       
        }
       
       
        } 