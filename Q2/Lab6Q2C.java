import java.util.Scanner;

public class IT26102752Q2C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 1;
        int sum = 0;

        while (count <= 10) {
            System.out.print("Enter number: ");
            int num = sc.nextInt();

            sum += num;
            count++;
        }

        double average = sum / 10.0;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}