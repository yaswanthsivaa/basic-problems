// Student Grading System

import java.util.Scanner;

public class GradeOfStudent {
  
  public char studentGradeCalculator(int marks){
     
    if(marks >= 90){
      return 'A';
    }
    else if(marks >= 75){
      return 'B';
    }
    else if(marks >= 60){
      return 'C';
    }
    else if(marks >= 35){
      return 'D';
    }
    else{
      return 'F';
    }

  }
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the Marks of a Student :");
    int marks = sc.nextInt();

    GradeOfStudent gs = new GradeOfStudent();

    char grade = gs.studentGradeCalculator(marks);

    if(grade != 'F')     
      System.out.println("Congratulations, Your Grade is :" + grade);
    else
      System.out.println("Ohh! No, Your Grade is :" + grade);

    sc.close();
  }
}
