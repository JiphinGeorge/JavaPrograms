package External;

import java.util.Scanner;
public class Armstrong{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the upper limit");
    int lower=sc.nextInt();
    System.out.println("Enter the Upper Limit :");
    int upper =sc.nextInt();
    System.out.println("The Armstrong number Between "+lower+" and " +upper+" are : ");
    for(int i = lower;i<=upper;i++){
        int r,temp=i;
        double sum=0;
        int numdigits =String.valueOf(i).length();
        while (temp>0) {
            r=temp%10;
            sum=sum+Math.pow(r,numdigits);
            temp=temp/10;
        }
        if(sum==i){
System.out.print("\t"+i);
        }
    }
    }
}