package cleancode.interest;

import java.util.Scanner;
public class InterestMain {
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int timePeriod;
		double principalAmount,rateOfInterest;
		int choice;
		System.out.format("1. SimpleInterest  2. CompundInterest\n");
		System.out.format("enter your choice\n");
		choice=sc.nextInt();
		if(choice!=1 && choice!=2)
		{
			System.out.format("Invalid Choice");
		}
		else 
		{
			System.out.format("Enter principle amount\n");
			principalAmount=sc.nextDouble();
			System.out.format("Enter rate of Interest\n");
			rateOfInterest=sc.nextDouble();
			System.out.format("Enter value of period in years\n");
			timePeriod=sc.nextInt();
			Interest interest=new Interest(principalAmount,rateOfInterest,timePeriod);
			if(choice==1)
				System.out.format("Simple Interest is "+interest.calculateSimpleInterest()+"\n");
			else
				System.out.format("Compound Interest is "+interest.calculateCompoundInterest()+"\n");
		}
	}
}
