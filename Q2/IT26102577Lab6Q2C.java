import java.util.Scanner;

public class IT26102577Lab6Q2C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 10 numbers:");
        System.out.print("Enter number 1: ");
        int number1 = input.nextInt();
        System.out.print("Enter number 2: ");
        int number2 = input.nextInt();
        System.out.print("Enter number 3: ");
        int number3 = input.nextInt();
        System.out.print("Enter number 4: ");
        int number4 = input.nextInt();
        System.out.print("Enter number 5: ");
        int number5 = input.nextInt();
        System.out.print("Enter number 6: ");
        int number6 = input.nextInt();
        System.out.print("Enter number 7: ");
        int number7 = input.nextInt();
        System.out.print("Enter number 8: ");
        int number8 = input.nextInt();
        System.out.print("Enter number 9: ");
        int number9 = input.nextInt();
        System.out.print("Enter number 10: ");
        int number10 = input.nextInt();

        int sum = number1 + number2 + number3 + number4 + number5 + number6 + number7 + number8 + number9 + number10;
        double average = sum / 10.0;

        System.out.println();
        System.out.println("The numbers you entered are:");
        System.out.println(number1 + " " + number2 + " " + number3 + " " + number4 + " " + number5 + " " + number6 + " " + number7 + " " + number8 + " " + number9 + " " + number10);
        System.out.println();
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);

        input.close();
    }
}
