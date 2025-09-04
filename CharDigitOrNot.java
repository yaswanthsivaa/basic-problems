// To determine given character is Digit or not

import java.util.Scanner;

public class CharDigitOrNot {
  
  public static boolean digitOrNot(char character){

    if(character >= 48 && character <=96){
      return true;
    } 
    else{
      return false;
    }
  }
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    char character = sc.next().charAt(0);
    
    if(digitOrNot(character)){
       System.out.println("*Yes!, It's Digit...");
    }
    else{
      System.out.println("`No!, it's not a Digit.");
    }
    sc.close();
  }
}
