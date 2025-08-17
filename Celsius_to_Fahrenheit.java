// Celcius to Fahrenheit  

import java.util.Scanner;

public class Celsius_to_Fahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Taking input
            System.out.print("Enter the Temperature (Celsius): ");
            double celsius = sc.nextDouble();

            // Conversion formula
            double fahrenheit = (celsius * 9 / 5) + 32;

            // Printing result
            System.out.println("Temperature in Fahrenheit: " + fahrenheit + " Fahrenheit");
        } catch (Exception e) {
            System.out.println("*Invalid Input!");
        }

        sc.close();
    }
}
