import java.util.Scanner;

public class IT26102381Lab6Q2C {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter 10 numbers:");

        // ¯\_(ツ)_/¯ = without using array
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int num5 = 0;
        int num6 = 0;
        int num7 = 0;
        int num8 = 0;
        int num9 = 0;
        int num10 = 0;

        int i = 0;
        while (i < 10) {
            i++;

            System.out.print("Enter number " + i + ": ");
            int number = sc.nextInt();

            switch (i) {
                case 1: num1 = number; break;
                case 2: num2 = number; break;
                case 3: num3 = number; break;
                case 4: num4 = number; break;
                case 5: num5 = number; break;
                case 6: num6 = number; break;
                case 7: num7 = number; break;
                case 8: num8 = number; break;
                case 9: num9 = number; break;
                case 10: num10 = number; break;
            }
        }

        int sum = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;
        double average = sum / 10.0;

        System.out.println("\nThe numbers you entered are:");
        System.out.println(num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5 + " " + num6 + " " + num7 + " " + num8 + " " + num9 + " " + num10);

        System.out.println("\nSum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);

        sc.close();

    }

}