import java.util.Scanner;


public class IT26102381Lab6Q1 {

    public static void main(String[] args) {

        double integer, intSqure, intSqureRoot;

        Scanner sc = new Scanner(System.in);

        // user input
        System.out.print("Enter a number: ");
        integer = sc.nextDouble();

        // validate
        boolean validate = integer <= 0 ? false : true;

        if (!validate) {
            System.out.println("The integer MUST be greater than zero");
            return;
        }

        intSqure = Math.pow(integer, 2);
        intSqureRoot = Math.sqrt(integer);

        System.out.println("The squre of " + integer + " is : " + intSqure);
        System.out.println("The squre root of " + integer + " is : " + intSqureRoot);

        sc.close();
    }

}