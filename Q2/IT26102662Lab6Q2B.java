
import java.util.Scanner;

public class IT26102662Lab6Q2B {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1 = 0, number2 = 0, number3 = 0, number4 = 0, number5 = 0, number6 = 0, number7 = 0, number8 = 0, number9 = 0,number10 = 0;

        int number = 1;

        System.out.println("Please enter 10 numbers:");

        while (number <= 10) {

            System.out.print("Enter number " + number + ": ");

            if (number == 1) {
                number1 = input.nextInt();
            } else if (number == 2) {
                number2 = input.nextInt();
            } else if (number == 3) {
                number3 = input.nextInt();
            } else if (number == 4) {
                number4 = input.nextInt();
            } else if (number == 5) {
                number5 = input.nextInt();
            } else if (number == 6) {
                number6 = input.nextInt();
            } else if (number == 7) {
                number7 = input.nextInt();
            } else if (number == 8) {
                number8 = input.nextInt();
            } else if (number == 9) {
                number9 = input.nextInt();
            } else {
                number10 = input.nextInt();
            }

            number++;
        }

        System.out.println("\nThe numbers you entered are:");

        System.out.println(number1 + " " + number2 + " " + number3 + " " + number4 + " " + number5 + " " + number6 + " " + number7 + " " + number8 + " " + number9 + " " + number10);

        input.close();
    }
}
