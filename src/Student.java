
public class Student {
     int roll,sem;
     String name;
     
     void display()
     {
         System.out.println(roll);
         System.out.println(sem);
         System.out.println(name);
     }
    
}
class BCA extends Student{

    void project()
    {
         System.out.println("1sd child ");
     }
}
class Age extends BCA{
    void thirdchild()
    {
        System.out.println("2nd class");
     }
 
      public static void main(String args[])
     {
       Age obj= new Age();
       obj.name="rahul";
       obj.roll=23;
       obj.sem=3;
       obj.display();
       obj.project();
       obj.thirdchild();
     }
 }