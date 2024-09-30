import java.util.Scanner;

class ComplexNo{
    double real, img;

    public ComplexNo(double real, double img) {
        this.real = real;
        this.img = img ;
    }

   public  ComplexNo add(ComplexNo other) {
        double newReal =this.real + other.real;
        double newimg =this.img + other.img;
        return new ComplexNo(newReal, newimg);
}
void display(){
    System.out.println(this.real + " + "+ this.img+"i");
}
}
public class Complex{ 
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the first Complex no :");
        ComplexNo c1 = new ComplexNo(sc.nextDouble(),sc.nextDouble());
        System.out.println("Enter the second Complex no :");
        ComplexNo c2 = new ComplexNo(sc.nextDouble(),sc.nextDouble());
        ComplexNo sum = c1.add(c2);
        System.out.print("Sum is ");
        sum.display();
    }
}
