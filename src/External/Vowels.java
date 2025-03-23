package External;

import java.util.Scanner;

public class Vowels{

    public  static void main(String args[]){
    System.out.println("Enter the Strng :");
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String Result = Removal(str);
    System.out.println("Original string is" +str);
    System.out.println(" string after removal of vowels  is" +Result);
    }
    public static String Removal(String str)
    {
    return str.replaceAll("[AEIOUaeio]","");
    
    }
}