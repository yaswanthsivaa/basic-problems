// Print the Ascii Value of a Number

import java.util.Scanner;

public class CharacterToAscii {
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Character for ASCII :");
    char letter = sc.next().charAt(0);
    
    System.out.printf("The ASCII Value of \"%c\" is :%d",letter, (int)letter);

  }
}
