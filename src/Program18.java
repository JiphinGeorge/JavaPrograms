class Oddnum implements Runnable{
    public void run(){
        for(int i=1;i<=10;i++){
            if(i%2!=0){
                System.out.println("odd :"+i);
            }
        }
    }
}
class evennum implements Runnable{
    public void  run(){
        for(int i=1;i<=10;i++){
            if(i%2==0){
                System.out.println("even :"+i);
            }
        }
    }
}
public class Program18{
    public static void main(String[] args) {
        Oddnum t1= new Oddnum();
        evennum t2= new evennum();
        t1.run();
        t2.run();
    }
}