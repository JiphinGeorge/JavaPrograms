
public class inheritancemul {
    void funciona(){
        System.out.println("base class");
    }
    
}
class childa extends inheritancemul
{
    void functionb()
    {
    System.out.println("child class");
    }
}
class childb extends childa{
    public static void main(String[]args){
    childa ac=new childa();
    ac.funciona();
    ac.functionb();
    }
}
