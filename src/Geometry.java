
import java.util.Scanner;


public class Geometry {
     double radius;
     double height;
     double cylinderradius;
    void readData(){
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter radius of the sphere:");
        radius=sc.nextDouble();
        System.out.println(" enter radius of the cylinder:");
        cylinderradius=sc.nextDouble();
        System.out.println(" enter height of the cylinder:");
        height=sc.nextDouble(); 
    }
    void dispVolume(){
        double spherevolume=(4.0/3.0)*Math.PI*Math.pow(radius, 3);
        System.out.println("volume of the sphere:"+spherevolume);
        double culindervolume=Math.PI*Math.pow(cylinderradius, 2)*height;
        System.out.println("volume of the cylinder:"+culindervolume);
        
    }
        
    }
class volume{
    public static void main(String[]args){
        Geometry ge=new Geometry();
        ge.readData();
        ge.dispVolume();
    }
}
  
