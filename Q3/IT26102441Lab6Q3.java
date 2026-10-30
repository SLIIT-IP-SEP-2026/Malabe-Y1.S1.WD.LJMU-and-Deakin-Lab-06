import java.util.Scanner;
public class IT26102441Lab6Q3{
	public static void main(String[] args){
		Scanner obj=new Scanner(System.in);
		int count=0;
		double sum=0;
		double rms=0;
		int number=0;
		System.out.println("Enter positive numbers: ");
		while(number != -99){
			number = obj.nextInt();
			System.out.println("Enter a number: "+number);
			if(number== -99){
				break;
			}
			if(number<0){
				System.out.println("invalid number");
				continue ;
			}
			sum=sum+(number*number);
			count++;
			if(count>0){
				rms=Math.sqrt(sum/count);
				
			}else{
				System.out.println("no numbers entered");
			}
			System.out.println("The Root Mean Square(RMS) is: "+rms);
			
		}
	}
	
}