import java.util.Scanner;
 
public class IT26102566Lab6Q2C{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int i = 1, sum = 0;
    String list = "";
 
    System.out.println("Please enter 10 numbers:");
    while(i<=10){
      System.out.print("Enter number "+i+": ");
      int x = sc.nextInt();
      list = list + x + " ";
      sum = sum + x;
      i++;
    }
 
    double avg = sum/10.0;
 
    System.out.println();
    System.out.println("The numbers you entered are:");
    System.out.println(list);
    System.out.println();
    System.out.println("Sum of the numbers: "+sum);
    System.out.println("Average of the numbers: "+avg);
  }
}
 