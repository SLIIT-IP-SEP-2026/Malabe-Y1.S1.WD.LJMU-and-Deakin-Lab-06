import java.util.Scanner;

public class IT26102752Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, count = 0;
        double sum = 0;

        System.out.println("Enter numbers (-99 to stop):");

        while (true) {
            num = sc.nextInt();

            if (num == -99)
                break;

            if (num < 0) {
                System.out.println("Invalid Input");
                continue;
            }

            sum += num * num;
            count++;
        }

        double rms = Math.sqrt(sum / count);

        System.out.println("RMS = " + rms);
    }
}