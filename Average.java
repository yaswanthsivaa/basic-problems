// Finding Average of Numbers

import java.util.Scanner;

public class Average {
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int num1;
    int num2;
    int num3;
    
    System.out.println("Enter the Numbers for Average:");
    num1 = sc.nextInt();
    num2 = sc.nextInt();
    num3 = sc.nextInt();
    
    new Average().average(num1, num2, num3);
    sc.close();
    System.gc();
  }

  public void average(int num1,int num2,int num3){
    
    // Average of Numbers
    float avg = (num1 + num2 + num3) / 3;

    System.out.println("Average of Three Numbers is : "+Math.round(avg));
  }
}
