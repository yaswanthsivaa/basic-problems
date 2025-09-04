// Sum of Two Numbers

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter the two numbers separated by a comma: ");
        String input = scanner.nextLine();

        // Split input by comma
        String[] nums = input.split(",");

        // Convert strings to integers and calculate sum
        int num1 = Integer.parseInt(nums[0].trim());
        int num2 = Integer.parseInt(nums[1].trim());
        int sum = num1 + num2;

        // Print result
        System.out.println("The Sum of " + num1 + " and " + num2 + " is : " + sum);
    }
}
