
import java.util.Scanner;


public class Triangle {
    public static void main(String[]args){
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side 1 :");
        double x= sc.nextDouble();
        System.out.println("Enter side 2 :");
        double y= sc.nextDouble();
        System.out.println("Enter side 3 :");
        double z= sc.nextDouble();
        String type = triangleType(x,y,z);
        double area = triangleArea(x,y,z);
        System.out.println(" The type of the triangle is "+ type);
        System.out.println(" The area of the triangle is "+ area);
    }
    public static String  triangleType(double a, double b , double c)
    {
       if(a==b && b==c)
       {return "Equilateral";
        }
       else if(a==b || b==c || a==c) {
        return "Isosceles";
       }
       else{
        return "Scalene";
       }
    }
    public static double triangleArea(double a , double b , double  c){
        double s=(a+b+c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }
}
