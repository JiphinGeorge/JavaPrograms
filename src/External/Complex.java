package External;

import java.util.Scanner;

public class Complex{
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
System.out.println("Enter the First Complext Number");
ComplexNo c1 = new ComplexNo(sc.nextInt(),sc.nextInt());
System.out.println("Enter the Second Complext Number");
ComplexNo c2 = new ComplexNo(sc.nextInt(),sc.nextInt());
ComplexNo sum = c1.add(c2);
sum.display();
}
}
class ComplexNo{
    double real,img;
ComplexNo(double real , double img){
    this.real= real;
    this.img = img;
}
ComplexNo add(ComplexNo others){
    double newReal = this.real+others.real;
    double newimg = this.img+others.img;
    return new ComplexNo(newReal,newimg);
}
void display(){

    System.out.println(this.real+"  +  "+this.img+"i");
}
}