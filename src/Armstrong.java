
import java.util.Scanner;


public class Armstrong {
    public static void main(String args[])
    {
        int number1,number2;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number");
        number1=sc.nextInt();
        System.out.println("Enter the Second number");
        number2=sc.nextInt();
        System.out.println("The Armstrong numbers are ");
        for(int i=number1;i<=number2;i++)
      {
        int temp,result=0,r;
        temp=i;
        while(temp!= 0)
        { 
           r=temp%10;
           result=result+r*r*r;
           temp=temp/10;
         }
        if(result==i)
        { System.out.println(i);
        }
      
     }

     }
    
}
