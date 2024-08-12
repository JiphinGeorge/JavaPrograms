public class Thre {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("current thread :" +t);
        t.setName("My Thread");
        System.out.println("current thread :" +t);
        try {
            for(int i =0;i<10;i++)
            {
                System.out.println(i);
                Thread.sleep(10000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread is interrupted");
        }
    }
}
