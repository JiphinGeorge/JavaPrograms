package External;

import java.util.Scanner;

public class Traceandtrancepose {

    public static void main(String args[])
    {
     int sum = 0, i,j;
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of Rows and Columns :");
    int rows = sc.nextInt();
    int cols = sc.nextInt();
    
    if(rows!= cols)
    {
     System.out.println("Only Square matrix allowed");
    
    }
    else{
    
    int matrix[][] =new int[rows][cols];
    int transpose[][]=new int[cols][rows];
    System.out.println("Enter the Elements of the matrix :");
    for(i=0;i<rows;i++)
    {
     for(j=0;j<cols;j++)
    {
     matrix[i][j]=sc.nextInt();
     
    }
     }
    
    System.out.println("Entered matrix :");
    for(i=0;i<rows;i++){
    for(j=0;j<cols;j++){
    System.out.print(matrix[i][j]+" ");
    
    }
    System.out.println(" ");
    }
    
    
    for(i=0;i<rows;i++){
    for(j=0;j<cols;j++){
    
    transpose[j][i]=matrix[i][j];
    if(i==j)
    {
    
    sum=sum+matrix[i][j];
}
    }
    }
    
    System.out.println("The trace of the given matrix is " +sum);
    System.out.println("The tanspose of the matrix is :");
    
    for(i=0;i<rows;i++){
    for(j=0;j<cols;j++)
    
    {
     System.out.print(transpose[i][j]+" ");
    
     }
    System.out.println("\t");
    }
    
    }
    }
    }