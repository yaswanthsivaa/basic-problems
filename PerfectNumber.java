// To Find Given Number is Perfect Number or not 

import java.util.Scanner;

public class PerfectNumber {
  
  public static String perfectNumber(int num){
     
    int sum = 0;
    for(int i=1; i<num; i++){

      if(num % i == 0){
         sum = sum + i;
      }
    }

    if(sum == num){
      return "Yes Given Number is Perfect Number.";
    }
    else{
      return "No Given Number is not Perfect Number.";
    }

  }
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter a Number :");

    String result = perfectNumber(sc.nextInt());
    
    System.out.println(result);

    sc.close();
  }
}
