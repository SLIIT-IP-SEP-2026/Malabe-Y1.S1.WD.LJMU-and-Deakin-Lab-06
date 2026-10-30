import java.util.Scanner;
public class IT26102660Lab6Q2B {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = 1;
        int[] numbers = new int[10];

        System.out.println("Please enter 10 numbers:");
        while (number <= 10){
            System.out.print("Enter number " + number + ": ");
            numbers[number - 1] = input.nextInt();
            number++;
        }

        System.out.println();
        System.out.println("The numbers you entered are: ");
        number = 1;
        while (number <= 10){
            System.out.print(numbers[number - 1] + " ");
            number++;
        }
        System.out.println();

        input.close();
    }
}