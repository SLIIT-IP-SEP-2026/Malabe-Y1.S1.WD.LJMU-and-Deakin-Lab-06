import java.util.Scanner;

public class IT26102578Lab06Q2B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Please enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("The numbers you entered are:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}


