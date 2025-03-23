package External;

public class CommandLine{
    public static void main(String args[]){
    int num1,num2,sum,sub,mul,div,rem;
    num1=Integer.parseInt(args[0]);
    num2=Integer.parseInt(args[1]);
    sum= num1+num2;
    sub= num1-num2;
    mul=num1*num2;
    div= num1/num2;
    rem= num1%num2;
    System.out.println("The sum is "+sum);
    System.out.println("The Difference is "+sub);
    System.out.println("The Product is "+mul);
    System.out.println("The quotient is "+div);
    System.out.println("The reminder is "+rem);
    }
    }