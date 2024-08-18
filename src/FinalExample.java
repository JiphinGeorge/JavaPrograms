public class FinalExample {
 final int x = 10;
 public static void main(String[] args)
 {
 FinalExample myObj = new FinalExample();
 myObj.x = 25;  //We cannot assign a valuue to a final variable
 System.out.println(myObj.x);
 }
}

