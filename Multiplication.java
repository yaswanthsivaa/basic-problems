// Multiplication of a table

import java.util.Scanner;

public class Multiplication {
  
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number to print its table :");
    int num = sc.nextInt();
    
    for(int i=1; i<11; i++){
      System.out.printf("%d x %d = %d\n", num, i, num*i);
    }
 
  }
}
