package OTHERsPACK01;

public class InnerClass {
	int x=90;
	
	class B{
		int u=80;
		
	}
	public static void main(String[] args) {
		InnerClass a1=new InnerClass();
		
		B b1=a1.new B();
		
		System.out.println(b1.u + " "+a1.x);
		
		System.out.println(a1.x);
		
	}
}
