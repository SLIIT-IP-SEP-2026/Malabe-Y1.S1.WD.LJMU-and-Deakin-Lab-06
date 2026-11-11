import java.util.Scanner;
public class IT26102619Lab6Q3{
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);

    int count = 0;
    double squaredSum=0;
	double root=0.0;
	
    System.out.print("Enter a number : ");
    int number = input.nextInt();

    while(number != -99){
        if(number>0)
        {
    
        squaredSum = squaredSum + number*number;
        count++;
        }
		
        else 
			
        { 
            System.out.println("Invalid input. Please enter a positive integer or -99 to terminate ");
            
        }
		
        System.out.print("Enter a Number : ");
        number = input.nextInt();
		
		} 
		
		if (count > 0) {
		root = Math.sqrt(squaredSum/count);
    System.out.println("\nThe Root Mean Square (RMS) is: " + root);
		}
		else {
    System.out.print("The Root Mean Square (RMS) is: " + root);
	
		}
    }
}
  
