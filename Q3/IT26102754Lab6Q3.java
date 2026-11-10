import java.util.Scanner;
public class IT26102754Lab6Q3 
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);

    int count = 0;
    double squaredSum=0;

    System.out.print("Enter number : ");
    int number = sc.nextInt();

    while(number != -99)
    {
        if(number>0)
        {
    
        squaredSum = squaredSum + number*number;
        count++;
        }
        else 
        { 
            System.out.println("Enter a positive number");
            return;
        }
        System.out.print("Enter next Number :");
        number = sc.nextInt();

    } 

    double rms = Math.sqrt(squaredSum/count);
    System.out.println("");
    System.out.print("Root Menu Square =" + rms);

    }


    
}
  
