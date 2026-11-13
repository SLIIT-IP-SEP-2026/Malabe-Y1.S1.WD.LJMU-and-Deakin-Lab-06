

public class IT26102758Lab6Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;
        int count = 0;
        double sum = 0;

        while (true) {

            System.out.print("Enter a positive number (-99 to stop): ");
            num = input.nextInt();

            if (num == -99) {
                break;
            }

            if (num <= 0) {
                System.out.println("Invalid input! Enter a positive number.");
                continue;
            }

            sum = sum + (num * num);
            count++;
        }

        if (count > 0) {

            double rms = Math.sqrt(sum / count);

            System.out.println("Number of values = " + count);
            System.out.println("Sum of squares = " + sum);
            System.out.println("Root Mean Square = " + rms);

        } else {
            System.out.println("No valid numbers entered.");
        }

        input.close();
    }
}
