class Vehicle
{
void run(){System.out.println("Vehicle is running");}
}
class Bike2 extends Vehicle
{
void run(){
    super.run();
    System.out.println("Bike is running safely");}
public static void main(String args[]){
Bike2 obj = new Bike2();
obj.run();
}
}

//okeeyyyy
//  You can directly call the parent classs run() method within the overridden method
//  using the super keyword without creating an additional method. Here’s how:

// class Vehicle {
//     void run() {
//         System.out.println("Vehicle is running");
//     }
// }

// class Bike2 extends Vehicle {
//     @Override
//     void run() {
//         super.run(); // Calls the run() method of the parent class (Vehicle).
//         System.out.println("Bike is running safely");
//     }

//     public static void main(String[] args) {
//         Bike2 obj = new Bike2();
//         obj.run(); // This will call the overridden run() method in Bike2, which also calls the parent class’s run().
//     }
// }




// If you want to access only the parent class’s run() method (i.e., the first one) without executing the overridden method in the child class, you cannot do this directly if you’re calling the method on an instance of the child class. In object-oriented programming, once a method is overridden, the child class’s version takes precedence when called on an instance of the child class.

// However, you can achieve this by:

// Creating an instance of the parent class (Vehicle) instead of the child class (Bike2).
// Using a reference of the parent class to call the method.
// Here’s how you can do it:

// class Vehicle {
//     void run() {
//         System.out.println("Vehicle is running");
//     }
// }

// class Bike2 extends Vehicle {
//     @Override
//     void run() {
//         System.out.println("Bike is running safely");
//     }

//     public static void main(String[] args) {
//         Vehicle obj = new Vehicle(); // Create an instance of the parent class.
//         obj.run(); // This will call the parent class’s run() method.
//     }
// }
