class Parent{
    void PrintData() {
    System.out.println("method of parent class");
    }
    }
    class Child extends Parent {
    void PrintData() {
    System.out.println("method of child class");
    }
    }
    class UpcastingExample{
    public static void main(String args[]) {
    Parent obj1 = new Child();
    Parent obj2 = new Child();
    obj1.PrintData();
    obj2.PrintData();
    }
    }