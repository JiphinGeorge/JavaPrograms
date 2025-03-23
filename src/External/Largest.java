package External;

import java.util.Scanner;

public class Largest{

    public static void main(String args[]){
    
    Scanner sc= new Scanner(System.in);
    System.out.print("ENTER THE size more than 10");
    int num = sc.nextInt();
    int arr[]= new int [num];
    System.out.println("Enter the element of the arry");
    
    for(int i =0; i<num;i++){
    arr[i]=sc.nextInt();
    
    }
    
    for(int i =0;i<num;i++)
    {
       for (int j=i+1;j<num;j++){
        if(arr[i]>arr[j])
        {
    int temp = arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
         } 
       }
    }
    
    
    System.out.println("The smallest element is "+ arr[0]);
    System.out.println("The Largest element is "+ arr[num-1]);
    
    System.out.println("The 2nd largest element is "+ arr[num-2]);
    
    }
     }