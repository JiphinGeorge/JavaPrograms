/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Inheritence {
     public void inheri1()
     {
          System.out.println("This is not Working");
     }
}
 class Inheritence1 extends Inheritence {
     public void inheri2()
     {
          System.out.println("Still not Working");
      }
     public static void main(String args[])
     {
         Inheritence1 obj = new Inheritence1();
         obj.inheri1();
         obj.inheri2();
      }
}
