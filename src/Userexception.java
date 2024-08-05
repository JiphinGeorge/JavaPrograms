import java.util.Scanner;

public class Userexception {
    static int age;
    void check()
    {
         try {
             System.out.println("Enter limit :");
             Scanner sc = new Scanner(System.in);
             age = sc.nextInt();
             if(age <18)
             {
                 throw new AgeLimitException();
             }
         } catch (Exception e) {
            System.out.println(e);
         }
    }
    public static void main(String[] args) {
        Userexception t = new Userexception();
        t.check();
    }
}
class AgeLimitException extends RuntimeException
{
    AgeLimitException()
    {
        super.getMessage();
    }
}
