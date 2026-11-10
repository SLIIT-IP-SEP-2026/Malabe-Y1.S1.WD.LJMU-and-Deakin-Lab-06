import java.util.Scanner;
public class IT26102754Lab6Q1
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter a number : ");
        double num = sc.nextDouble();

        if(num<=0)
        {
            System.out.print("The entered number should be greater than 0");
        }
        else
        {   
            double square = num * num;
            double sqrRoot = Math.sqrt(num);
            System.out.println("");
            System.out.println("The square of " + num + " is :" + square);
            System.out.println("The square root of " + num + " is : " + sqrRoot);
        }

    }
}
