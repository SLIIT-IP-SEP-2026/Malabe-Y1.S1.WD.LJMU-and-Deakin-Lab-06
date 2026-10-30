import java.util.Scanner;
public class IT26102441Lab6Q1{
	public static void main(String[] args){
		Scanner obj= new Scanner (System.in);
		System.out.println("Enter the number: ");
		double number = obj.nextDouble();
		if (number > 0.0){
			double square = number*number;
			double sqrt = Math.sqrt(square);
			System.out.println("The square of " + number + ":" +square);
			System.out.println("The square root of"  + number + "is:" +sqrt);
		}else
		{
			System.out.println("Invalid number");
		}
		
	}
}