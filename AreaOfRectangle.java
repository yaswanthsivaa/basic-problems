// Area of Rectange

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for length
        System.out.print("Enter the Length of the Rectangle: ");
        int length = sc.nextInt();

        // Taking input for breadth
        System.out.print("Enter the Breadth of the Rectangle: ");
        int breadth = sc.nextInt();

        // Calculating the area
        int areaOfRectangle = length * breadth;

        // Printing result
        System.out.println("The Area of the Rectangle: " + areaOfRectangle + " meters");

        sc.close();
    }
}
