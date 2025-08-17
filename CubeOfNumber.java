// Cube of a Number

public class CubeOfNumber {
  
  public static void main(String[] args){
    
    int num = 9;

    new CubeOfNumber().cubeOfNum(num);

    System.gc();
  }

  public void cubeOfNum(int num){
    
    // calculating Cube of Number

    int cubeOfNum = num*num*num;

    System.out.println("Cube of a Number is :"+cubeOfNum);
  }
}
