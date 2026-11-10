import java.util.Scanner;

public class IT26102576Lab6Q3{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2, num3, num4, num5, num6, num7;
        int count = 0;
        double sum = 0;

        System.out.println("Enter positive integers (-99 to stop):");

        System.out.print("Enter number 1: ");
        num1 = input.nextInt();

        if (num1 != -99 && num1 > 0) {
            sum = sum + num1 * num1;
            count++;
            
            System.out.print("Enter number 2: ");
            num2 = input.nextInt();

            if (num2 != -99 && num2 > 0) {
                sum = sum + num2 * num2;
                count++;

                System.out.print("Enter number 3: ");
                num3 = input.nextInt();

                if (num3 != -99 && num3 > 0) {
                    sum = sum + num3 * num3;
                    count++;

                    System.out.print("Enter number 4: ");
                    num4 = input.nextInt();

                    if (num4 != -99 && num4 > 0) {
                        sum = sum + num4 * num4;
                        count++;

                        System.out.print("Enter number 5: ");
                        num5 = input.nextInt();

                        if (num5 != -99 && num5 > 0) {
                            sum = sum + num5 * num5;
                            count++;

                            System.out.print("Enter number 6: ");
                            num6 = input.nextInt();

                            if (num6 != -99 && num6 > 0) {
                                sum = sum + num6 * num6;
                                count++;

                                System.out.print("Enter number 7: ");
                                num7 = input.nextInt();

                                if (num7 != -99 && num7 > 0) {
                                    sum = sum + num7 * num7;
                                    count++;
                                }
                            }
                        }
                    }
                }
            }
        }
		
		System.out.println();
		
        if (count > 0) {
            double rms = Math.sqrt(sum / count);
            System.out.println("Root Mean Square: " + rms);
        } else {
            System.out.println("No valid numbers entered.");
        }
    }
}