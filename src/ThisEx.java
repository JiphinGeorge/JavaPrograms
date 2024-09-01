class ThisEx{
    int rollno;
    String name;
    float fee;
    ThisEx(int rollno,String name,float fee){
    this.rollno=rollno;
    this.name=name;
    this.fee=fee;
    }
    void display(){System.out.println(rollno+" "+name+" "+fee);}
    }
    class TestThis2{
    public static void main(String args[]){
    ThisEx s1=new ThisEx(111,"ankit",5000f);
    ThisEx s2=new ThisEx(112,"sumit",6000f);
    s1.display();
    s2.display();
    }}



    // class ThisEx{
    //     int roll;
    //     String name1;
    //     float fee1;
    //     ThisEx(int rollno,String name,float fee){
    //    this.roll=rollno;
    //     name1=name;
    //     fee1=fee;
    //     }
    //     void display(){System.out.println(roll+" "+name1+" "+fee1);}
    //     }
    //     class TestThis2{
    //     public static void main(String args[]){
    //     ThisEx s1=new ThisEx(111,"ankit",5000f);
    //     ThisEx s2=new ThisEx(112,"sumit",6000f);
    //     s1.display();
    //     s2.display();
    //     }}