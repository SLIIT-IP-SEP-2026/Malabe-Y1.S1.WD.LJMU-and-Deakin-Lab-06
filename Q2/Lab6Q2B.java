import java.util.Scanner;

public class IT26102753Lab6Q2B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 1;

        while (count <= 10) {
            System.out.print("Enter number: ");
            int num = sc.nextInt();

            System.out.println(num);
            count++;
        }
    }
}