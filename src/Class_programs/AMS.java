package Class_programs;

public class AMS {
	public static void main(String[] args) {
		int num1 = 0, num2=10000;
		
		for(int i=num1; i<=num2;i++)
		{
			int n=i;
			int count=0;
			
			while(n>0)
			{
				count++;
				n/=10;
			}
			n=i;
			int sum=0;
					while(n>0)
					{
						 int dig=n%10;
						 int prod=1;
						 for(int j=1;j<=count;j++)
						 {
							 prod=prod*dig;
						 }
						 sum=sum+prod;
						 n/=10;
					}
					
					if(i==sum)
					{
						System.out.println(i);
					}

		}
	}

}
