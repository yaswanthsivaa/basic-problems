// To Find the Power of a Number

import java.util.Scanner;

public class PowOfNum {
  
  public static void main(String[] args){

     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the Number :");
     int number = sc.nextInt();
     System.out.print("Enter the Number for Power of Above Number:");
     int power = sc.nextInt();
     PowOfNum a = new PowOfNum();
     System.out.printf("The Circumference of the circle is :%.2f",a.PowOfNumber(number, power));
     
     System.gc();
     sc.close();
  }

  public double PowOfNumber(int num,int power){
    
    return Math.pow(num, power);
  }
}
