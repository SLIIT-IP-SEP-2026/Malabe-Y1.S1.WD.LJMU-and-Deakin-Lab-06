import java.util.Scanner;

public class IT26102722Lab6Q1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double num, square, root;

        System.out.print("Enter a Number : ");
        num = input.nextDouble();

        if(num <= 0)
        {
            System.out.println("Error:The number must be greater than Zero");
        }
        else
        {
            square = num * num;
            root = Math.sqrt(num);

            System.out.println("The Square of " + num + " is : " + square);
            System.out.println("The Square Root of " + num + " is = " + root);
        }
    }
}