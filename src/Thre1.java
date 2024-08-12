public class Thre1 extends Thread {
    public void run() {
        for(int i=0;i<10;i++)
        {
             System.out.println("new thread");
        }
    }

}
class BClass{
    public static void main(String[] args) {
        Thre1 t= new Thre1();
        t.start();
        for(int i=0;i<10;i++)
        {
            System.out.println("Main Thread");
        }
    }
}
