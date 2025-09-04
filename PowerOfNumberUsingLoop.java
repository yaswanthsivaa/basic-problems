// Power of a Number using loop
// Time Complexity = O(n)

import java.util.Scanner;

public class PowerOfNumberUsingLoop {
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter the Number :");
     int number = sc.nextInt();
     System.out.print("Enter the Number for Power of Above Number:");
     int power = sc.nextInt();
     
     // Powered Result
     int result = 1;
     for(int i=0; i<power; i++){
        result = number * result;
     }

     System.out.println(result);

    sc.close();
  }
}
