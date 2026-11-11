import java.util.Scanner;
 
public class IT26102566Lab6Q3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 0;
        double total = 0;
        int x;
 
        System.out.println("Enter positive integers (terminate input with -99): ");
        System.out.print("Enter a number: ");
        x = sc.nextInt();
 
        while(x != -99){
            if(x < 0){
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
            }
            else{
                total = total + x*x;
                n++;
            }
            System.out.print("Enter a number: ");
            x = sc.nextInt();
        }
 
        System.out.println();
        if(n > 0){
            double rms = Math.sqrt(total/n);
            System.out.println("The Root Mean Square (RMS) is: "+rms);
        }
        else
            System.out.println("No numbers entered");
    }
}