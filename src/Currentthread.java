
public class Currentthread {
    public static void main(String args[]){
        Thread t=Thread.currentThread();
        System.out.println("current thread:"+t);
        t.setName("my thread");
        System.out.println("current thread:"+t);
        try{
            for(int i=0;i<10;i++)
            {
                System.out.println(i);
                Thread.sleep(10000);
                
            }
        }
        catch(InterruptedException e){
            System.out.println("main thread is interrupted");
        }
        
    }
    
}
class A extends Thread{
    public void run()
    {
        for(int i=0;i<10;i++){
            System.out.println("new thread");
        }
}
}
class Bclass 
        {
    public static void main(String args[]){
        A t=new A();
        t.start();
        for(int i=0;i<10;i++){
            System.out.println("main thread");
        }
    }
    
}
