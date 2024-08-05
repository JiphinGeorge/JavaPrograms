
import java.util.Scanner;

public class Sumandrev {
    int sum=0, rev=0,reminder;
    void sum(int num){
        while(num>0){
            reminder=num%10;
            sum=sum+reminder;
            num=num/10;
        }
        System.out.println("The sum of digits are :"+sum);
    }
    void reverse(int num){
        while(num>0)
        {
            reminder=num%10;
            rev=rev*10+reminder;
            num=num/10;
        }
        System.out.println(" Reverse of the number is "+rev);
    }
}
class Sumrev{
    public static void main(String[] args) {
        int n;
        System.out.println("Enter a number :");
        Scanner sc= new Scanner(System.in);
        n= sc.nextInt();
        Sumandrev obj= new Sumandrev();
        obj.sum(n);
        obj.reverse(n);
    }
}