// To find Day of the week based on the 
import java.util.Scanner;

public class DayOfTheWeek{

  public static String DayOfTheweek(int dayNumber){

    switch(dayNumber){

      case 1:
         return "Monday";
      case 2:
         return "Tuesday";
      case 3:
         return "Wednesday";
      case 4:
         return "Thursday";
      case 5:
         return "Friday";
      case 6:
         return "Saturday";
      case 7:
         return "Sunday";
      default:
         return "Invalid";
    }
  }

  public static void main(String[] args){

     System.out.print("Enter the number from 1 to 7 to :");
     
     Scanner sc = new Scanner(System.in);
     
     int dayNum = sc.nextInt();
     if(dayNum >= 1 && dayNum <=7){
       String day = DayOfTheweek(dayNum);
       System.out.println("The Corresponded Day is  : " + day);
       sc.close();
    }
    else{
      System.out.println("*Invalid Day Number`");
    }
  }
}