import java.util.Scanner;

public class IT26102752Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double num = sc.nextDouble();

        System.out.println("Square = " + (num * num));
        System.out.println("Square Root = " + Math.sqrt(num));
    }
}