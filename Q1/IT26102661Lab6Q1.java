import java.util.Scanner;

public class IT26102661Lab6Q1 {
	
    public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
		
        double num, square, squareroot;

        System.out.print("Enter a number: ");
        num = input.nextDouble();

        square = num * num;
        squareroot = Math.sqrt(num);

        System.out.println();
        System.out.println("The square of " + num + " is : " + square);
        System.out.println("The square root of " + num + " is : " + squareroot);
    }
}