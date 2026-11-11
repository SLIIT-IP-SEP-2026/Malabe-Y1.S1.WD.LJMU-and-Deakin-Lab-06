
import java.util.Scanner;
 
public class IT26102566Lab6Q1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double n = sc.nextDouble();
 
        double sq = n*n;
        double root = Math.sqrt(n);
 
        System.out.println();
        System.out.println("The square of "+n+" is : "+sq);
        System.out.println("The square root of "+n+" is : "+root);
    }
}