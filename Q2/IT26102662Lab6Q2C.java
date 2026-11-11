import java.util.Scanner;

public class IT26102662Lab6Q2C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int i = 1;
        String numbers = "";  

        System.out.println("Please enter 10 numbers:");

        while (i <= 10) {
            System.out.print("Enter number " + i + ": ");
            int num = input.nextInt();
            sum += num;
            numbers += num + " ";
            i++;
        }

        double average = (double) sum / 10;

        System.out.println();
        System.out.println("The numbers you entered are:");
        System.out.println(numbers);

        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);

        input.close();
    }
}