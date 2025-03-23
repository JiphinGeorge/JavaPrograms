package External;
import java.util.Scanner;

public class Triangle{
public static void main(String args[]){
Scanner sc =new Scanner(System.in);
System.out.println("Enter the Length of Side A :");
int a = sc.nextInt();
System.out.println("Enter the Length of Side B :");
int b = sc.nextInt();
System.out.println("Enter the Length of Side C :");
int c = sc.nextInt();


String type = TriangleType(a,b,c);
double area = TriangleArea(a,b,c);
System.out.println("The type of Triangle is :" +type);
System.out.println("The Area of the Triangle is "+area);
}
    public static String TriangleType(int x, int y , int z){

        if(x==y&&y==z)
        { 
        return"equilateraal";
        }
        else if (x==y || y==z ||x==z){
        return "isosceles";
        }
        else
        {
        return "scalene";
        }
        }
      public static  double TriangleArea(double a,double b, double c){
        double s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
      }
}
