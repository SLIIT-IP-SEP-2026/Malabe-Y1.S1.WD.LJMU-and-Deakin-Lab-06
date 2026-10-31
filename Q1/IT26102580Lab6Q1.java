import java.util.Scanner;

public class IT26102580Lab6Q1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double num, square, sqrt;

        System.out.print("Enter a number: ");
        num = input.nextDouble();
		
		if (num <= 0) {
			System.out.println("Error: The number must be greater than zero");
		}
		else{

        square = num * num;
        sqrt = Math.sqrt(num);

        System.out.println("Square = " + square);
        System.out.println("Square Root = " + sqrt);
		}
    }
}