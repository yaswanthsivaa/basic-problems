// check whether given number is +ve or -ve

import java.util.Scanner;

public class PositiveOrNegative {
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter a number :");
    int num = sc.nextInt();
    
    String result = num >= 0 ? "Positive" : "Negitive";

    System.out.printf("The Given Number %d is :%s",num,result);
  }
}
