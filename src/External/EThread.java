package External;

import java.util.Scanner;

public class EThread{

    public static void main(String args[]){
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the limit: ");

    int limit = sc.nextInt();
    Thread t1 = new Thread(new EvenNum(limit));
    Thread t2 = new Thread(new OddNum(limit));
t1.start();
t2.start();
    }

}

class EvenNum implements Runnable{
    int limit;
    EvenNum(int limit){
        this.limit= limit;
    }
    public void run(){
        for(int i =1;i<=limit;i++)
        {
            if(i%2==0){
                System.out.println("Even :"+i);
            }
           
        }
    }
}

class OddNum implements Runnable{
int limit;
OddNum(int limit )
{
     this.limit= limit;
}
public void run(){
    for(int i =1;i<=limit;i++)
        {
            if(i%2!=0){ 
                System.out.println("Odd :"+i);
            }
           
        }
}
}