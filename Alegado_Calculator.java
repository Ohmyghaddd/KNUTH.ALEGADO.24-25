import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        
        Scanner number = new Scanner(System.in);

        System.out.print( "Enter your first number ");
        int num1 = number.nextInt();
        
        System.out.print("Enter your second number ");
        int num2 = number.nextInt();
        double result;
 
        result = num1 + num2;
        System.out.println("Addition: " + result);
 
        result = num1 - num2;
        System.out.println("Subtraction: " + result);
 
        result = num1 * num2;
        System.out.println("Multiplication: " + result);
 
        result = (double) num1 / num2;
        System.out.println("Division: " + result);
    }
}