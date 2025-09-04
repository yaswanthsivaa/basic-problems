// Finding whether an year is leap year or not

import java.util.Scanner;

public class LeapYear {
  
  public static boolean leapYear(int year){
    if(year % 4 == 0){
      if(year % 100 == 0){
        if(year % 400 == 0){
          return true;
        }
        return false;
      }
      return true;
    }
    return false;

  }
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the Year :");
    int year = sc.nextInt();
    
    boolean result = leapYear(year);

    if (result == true){
      System.out.printf("Yes, %d is a Leap Year", year);
    }
    else{
      System.out.printf("No, %d is not a Leap Year", year);
    }
    
    sc.close();
  }

}
