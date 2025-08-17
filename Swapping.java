// Swapping variables
 
public class Swapping{

  public static void main(String[] args){

    Swapping swap = new Swapping();
    swap.swapWithThirdVariable();
    swap.swapWithoutThirdVariable();
     
  }

  public void swapWithThirdVariable(){
    System.out.println("--- With Third Varible ---");

    int number1 = 10;
    int number2 = 20;
    System.out.println("Number1 is :"+number1+" Number2 is :"+number2);
    // swapping the Numbers
    
    int temp = number1;
    number1 = number2;
    number2 = temp;
    
    System.out.println("After Swapping with Thrid Variable :");
    System.out.printf("Number1 is :%d and Number2 is %d\n", number1, number2);

  }

  // Swap without Third variable
  public void swapWithoutThirdVariable(){
    System.out.println("--- Without Third Varible ---");
     
    int num1 = 100;
    int num2 = 200;
    System.out.println("Number1 is :"+num1+" Number2 is :"+num2);
    // Swapping 

    num1 = num1 + num2 - num1;

    num2 = num1 + num2 - num2;
    
    System.out.println("After Swapping without Third Variable :");
    System.out.printf("Number1 is %d and Number2 is %d", num1, num2);
  }
}