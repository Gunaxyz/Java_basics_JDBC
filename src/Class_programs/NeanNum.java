package Class_programs;

public class NeanNum {
	public static void main(String[] args) {
		int num=9;
		int mul=num*num;
		int sum=0;
		
		while(mul >0) {
			int dig=mul%10;
			sum=sum+dig;
			num/=10;
		}
		System.out.println(sum);
		if(sum==num) {
			System.out.println("it is nean number");
		}
		else
		{
			System.out.println(" a nean number");
	}

}
}
