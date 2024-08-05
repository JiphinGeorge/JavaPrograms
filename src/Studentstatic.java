/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Studentstatic {
 int rollno;
 String name;
 static String college ="ITS";
 
 static void change()
 {
     college = "BBDIT";
 } 
 Studentstatic(int r , String n){
 
      rollno = r;
      name = n;
 }
 void display(){
 
      System.out.println(rollno+" "+name+" "+college);
 }
 public static void main(String args[]){
 
      change();
      Studentstatic s1 = new Studentstatic(111,"Diya");
      Studentstatic s2 = new Studentstatic(112,"sayooj");
      Studentstatic s3 = new Studentstatic(113,"Rahul");
      s1.display();
      s2.display();
      s3.display();
      
 }
 
}
