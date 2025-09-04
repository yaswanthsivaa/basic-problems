// To Find Whether a Letter is Vowel or Consonent

import java.util.Scanner;

public class Vowel_Consonent {
  
  public static void main(String[] args){

     Scanner sc = new Scanner(System.in);

     String vowels = "AEIOUaeiou";
     
     char letter = sc.next().charAt(0);
     
     if (vowels.contains(String.valueOf(letter))){
        System.out.printf("Yes, %c is Vowel.", letter);
      }
      else{
       System.out.printf("No, %c is a consonent.", letter);
     }
     
     sc.close();

  }
}
