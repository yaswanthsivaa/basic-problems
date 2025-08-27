// To find whether a Triangle is Valid or not .

import java.util.Scanner;

public class Triangle {
 
  public static void main(String[] args){

     Scanner sc = new Scanner(System.in);

     System.out.print("Enter the First side of the triangle :");
     int firstSide = sc.nextInt();
     System.out.print("Enter the second side of the triangle :");
     int secondSide = sc.nextInt();
     System.out.print("Enter the Third side of the triangle :");
     int thirdSide = sc.nextInt();

     if(firstSide+secondSide > thirdSide && firstSide+thirdSide > secondSide && secondSide + thirdSide > firstSide){
      System.out.println("Valid Triangle --- ");
     }
     else{
      System.out.println("Not a Valid Triangle --- ");
     }
  }
}
