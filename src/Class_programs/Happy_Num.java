
package Class_programs;

public class Happy_Num {

	public static int ishappy(int n)
	{
		int rem=0;
		int sum=0;
		while(n>0)
		{
			rem=n%10;
			sum+=(rem*rem);
			n/=10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int num=13;
		int m=num;
		while(m!=1 && m!=4)
		{
			m=ishappy(m);
		}
		if(m==1)
			System.out.println("happy");
		else
				System.out.println("not happy");
	}
}
