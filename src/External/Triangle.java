package External;
import java.util.Scanner;

public class Triangle {
  public static void main(String args[]){
  
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter the side 1:");
  int a = sc.nextInt();
  System.out.print("Enter the side 2:");
  int b = sc.nextInt();
  System.out.print("Enter the side 3:");
  int c = sc.nextInt();
  
  
  if((a+b)>c && (c+a)> b && (b+c)>a)
  {
    String type  = Triangletype(a,b,c);
    double area = Trianglearea(a,b,c);
    System.out.println("Type of trinagle is "+type);
    System.out.println("Area :"+area);
  }
  else{
  System.out.print("Cannt form a triangle");
  }
  
  }
  
  public static String Triangletype(int a, int b , int c){
  
  if(a==b && b==c && c==a)
  return "equilaternal";
  else if (a==b || b==c || c==a )
  return "isoscelous";
  else
  return "scalene";
  }
  
  public static double Trianglearea(int a ,int b, int c){
  
  int s= (a+b+c)/2;
  return Math.sqrt(s*(s-a)*(s-b)*(s-c));
  }
  }