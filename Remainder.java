// Taking Remainder from the Division

import java.util.Scanner;

public class Remainder {
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    // Take a number 
    System.out.print("Enter the numbers for Division comma (,) separated :");
    
    String[] nums = sc.nextLine().split(",");

    int remainder = Integer.parseInt(nums[0]) % Integer.parseInt(nums[1]);

    System.out.println("The Remainder is :"+remainder);

    
  }
}
