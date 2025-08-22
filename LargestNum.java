// Largest Number

import java.util.Scanner;

public class LargestNum {
  
  public static int greatestNum(int num,int num2,int num3){
     
    if(num > num2){
      if(num > num3){
        return num;
      }
      if(num2 > num3){
        return num2;
      }
      return num3;
    }
    if(num2 > num3){
        return num2;
    }
    return num3;

  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the Three for Largest Number :");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int num3 = sc.nextInt();
    
    int lnum = greatestNum(num1, num2, num3);
    System.out.println("The Greatest Num is  :" + lnum);
    sc.close();
  }
}
