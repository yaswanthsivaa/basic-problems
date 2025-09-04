// To Find given character is Alphabet or not

import java.util.Scanner;

public class character_check {
  public static int checkingCharAplhaOrNot(char letter){

    int ascii = (int)letter;

    if(ascii >= 65 && ascii <= 90 || ascii >= 97 && ascii <= 122){
       return 1;
    }
    else
      return 0;
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter an Alphabetical Letter :");
    char letter = sc.next().charAt(0);
    int result = checkingCharAplhaOrNot(letter);
    
    switch(result){
      case 1:
          System.out.println("Yes!, The Given Character is an Alphabet.");
          break;
      case 0:
          System.out.println("No!, The Given Character is not an Alphabet.");
          break;
    }
    sc.close();
  }
}
