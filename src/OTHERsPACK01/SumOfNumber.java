package OTHERsPACK01;

import java.util.Scanner;

public class SumOfNumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println(" Enter the numbers");
		int number =scn.nextInt();
		int digit;
		int sum=0;
		 while(number>0)
			 {
		 	digit=number%10;
			sum=sum+digit;
		 	number/=10;
		 	System.out.println("sum=" +sum);
		 }
	}
}
