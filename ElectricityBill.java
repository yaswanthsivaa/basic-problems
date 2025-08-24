// To find electricity bill based on the slabs
import java.util.Scanner;

public class ElectricityBill {
  
  public static int calculateElectricity(int wats){
    
    if(wats <= 100){
      return wats * 3;
    }
    else if(wats >= 100 && wats <= 300){
      
      int basic = 100;
      int units = wats;
      int count = 1;
      int totalPrice = 0;
      while(units > basic){
        units = units - 100;
        if(count == 1){
          totalPrice += basic * 3;
          count++;
        }
        else if(count == 2){
          totalPrice += basic * 5;
          count++;
        }
        else if(count == 3){
          totalPrice += basic * 7;
          count++;
        }
      }

      if(count == 2)
       totalPrice += units * 5;
      else if(count == 3)
       totalPrice += units * 7 ;
  
     return totalPrice;
    }
    else{
      int basic = 100;
      int units = wats;
      int count = 1;
      int totalPrice = 0;

      while(units > basic){
        units = units - 100;
        if(count == 1){
          totalPrice += basic * 3;
          count++;
        }
        else if(count == 2){
          totalPrice += basic * 5;
          count++;
        }
        else if(count == 3){
          totalPrice += basic * 7;
          count++;
        }
        else if(count > 3){
          totalPrice += basic * 10;
          count++;
        }

      }

      if(count == 2)
       totalPrice += units * 5;
      else if(count == 3)
       totalPrice += units * 7 ;
      else
       totalPrice += units * 10;

     return totalPrice;
    }
  }

  public static void main(String[] args){
     
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the Units in slabs :");

    int total = calculateElectricity(sc.nextInt());

    System.out.println(total);
    sc.close();
  }
}
