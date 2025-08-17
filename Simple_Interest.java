// Simple Interest Using Java

import java.util.Scanner;

public class Simple_Interest{

  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);

    //Taking the Price
    System.out.print("Enter the Amount :");
    int price = sc.nextInt();

    // Taking Time Period
    System.out.print("Enter the Time Period :");
    int timePeriod = sc.nextInt();

    // Taking Rate Of Interest
    System.out.print("Enter the Rate Of Interest :");
    int rateOfInterest = sc.nextInt();
    
    // Calculating Simple Interest 

    float simpleInterest = (price * timePeriod * rateOfInterest) / 100 ;

    System.out.printf("The Simple interest is : %.2f",simpleInterest);

    sc.close();
  }
}
