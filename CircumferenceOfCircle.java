// Circumference Of Circle

import java.util.Scanner;

public class CircumferenceOfCircle {

  public static void main(String[] args){

     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the Radius of a Circle :");
     int circleRadius = sc.nextInt();
     CircumferenceOfCircle a = new CircumferenceOfCircle();
     System.out.printf("The Circumference of the circle is %.2f",a.circumferenceOfCircle(circleRadius));
     
     System.gc();
     sc.close();
  }

  public double circumferenceOfCircle(int radius){
    
    // 2 x Radius x PI

    return 2 * Math.PI * radius;
  }
}
