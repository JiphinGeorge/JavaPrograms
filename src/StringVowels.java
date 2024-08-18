import java.util.Scanner;

public class StringVowels {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a String :");
        String input = sc.nextLine();
        String result = removeVowels(input);
        System.out.println("Original String :" +input);
        System.out.println("String Without Vowels :" +result);
    }
    public static String removeVowels(String str){
     return str.replaceAll("[AEIOUaeiou]","");   
    }
}
