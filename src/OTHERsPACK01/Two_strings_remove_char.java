package OTHERsPACK01;

public class Two_strings_remove_char {
	public static void main(String[] args) {
		String s1 = "gunasekhar";
		String s2 = "keerthi";
		String s3="";
		
		for(int i=0;i<s1.length();i++) {
			char a=s1.charAt(i);
		} 
		for(int j=0;j<s2.length();j++) {
			char b=s2.charAt(j);
		}
		s3= s1+s2;
		for(int i=0;i<s3.length();i++)
		{
			System.out.println(s3);
			break;
		}
		
		String s4="";
		
		for(int i=0;i<s3.length();i++)
		{
			char c=s3.charAt(i);
			if((s4.indexOf(c)==-1) || (s4.indexOf(c)==1))
				s4=s4+c;
		}
		
		System.out.println(s4);
	
			
		
	}
		
}
