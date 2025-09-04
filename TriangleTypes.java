// To determine whether a triangle is equilateral, isoceles and scalene triangle. 

import java.util.Scanner;

public class TriangleTypes {
  
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the First Side of the Triangle :");
    int firstSide = sc.nextInt();
    System.out.print("Enter the second Side of the Triangle :");
    int secondSide = sc.nextInt();
    System.out.print("Enter the Third Side of the Triangle :");
    int thirdSide = sc.nextInt();

    if( firstSide == secondSide && secondSide == firstSide && thirdSide == firstSide)
       System.out.println("Yes The triangle is a EQUILATERAL Triangle.");
    else if(firstSide == secondSide || secondSide == thirdSide || firstSide == thirdSide)
       System.out.println("Yes, Given triangle is ISOCELES TRIANGLE. ");
    else
       System.out.println("Yes, The given triangle is a SCALENE TRIANGLE. ");
    sc.close();
  }
}
