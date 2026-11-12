
import java.util.Scanner;

public class IT26102539LAB6Q2B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, num3, num4, num5;
        int num6, num7, num8, num9, num10;
        int i = 1;

        while (i <= 10) {
            System.out.print("Enter number " + i + ": ");

            if (i == 1) {
                num1 = input.nextInt();
            } else if (i == 2) {
                num2 = input.nextInt();
            } else if (i == 3) {
                num3 = input.nextInt();
            } else if (i == 4) {
                num4 = input.nextInt();
            } else if (i == 5) {
                num5 = input.nextInt();
            } else if (i == 6) {
                num6 = input.nextInt();
            } else if (i == 7) {
                num7 = input.nextInt();
            } else if (i == 8) {
                num8 = input.nextInt();
            } else if (i == 9) {
                num9 = input.nextInt();
            } else {
                num10 = input.nextInt();
            }

            i++;
        }

        System.out.println("The Numbers You Entered Are:");

        System.out.println(num1 + " " + num2 + " " + num3 + " "
                + num4 + " " + num5 + " " + num6 + " "
                + num7 + " " + num8 + " " + num9 + " " + num10);

        input.close();
    }
}
