package OTHERsPACK01;

public class DefaultValues {

	static int i;
	float f;
	boolean b;
	char c;
	long l;
	short s;
	byte bb;
	double d;

	String sss;

	
	public static void main(String[] args) {
		
		DefaultValues dv = new DefaultValues();
		// TODO Auto-generated method stub


		System.out.println("Byte Default value is : " + dv.bb +", Byte range or minimum and maximam value is : -128 to 127");
		System.out.println();
		
		System.out.println("Short Default value is : " + dv.s+" ,Short range or minimum and maximam value is : -32768 to 32767");
		System.out.println();
		
		System.out.println("Integer Default value is : " + DefaultValues.i
				+" ,integer range or minimum and maximam value is : -2^31 to 2^31-1 by defalt data type in signed 32 bit");
		System.out.println();
		
		System.out.println("Long Default value is : " + dv.l+" ,Byte range or minimum and maximam value : -2^63 to 2^63-1");
		System.out.println();
		
		System.out.println("Float Default value is : " + dv.f );
		System.out.println();
		
		System.out.println("Boolean Default value is : " + dv.b);
		System.out.println();
		
		System.out.println("Char Default value is : " + dv.c);
		System.out.println();
		

		
		System.out.println("Double Default value is : " + dv.d);
		System.out.println();
		System.out.println("String default values is : " + dv.sss);
		
		 byte b=-128;  //byte assign the value is nagitive storage 
		 byte b1=127;
		// byte b2=-129;
		 //byte b3=128;
		 


	}

}
