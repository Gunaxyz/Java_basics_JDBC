package OTHERsPACK01;

public class SmallNum {
	public static void main(String[] args) {
		int [] n= {2,1,9,3,5};
		int  s=n[0];
		for(int i=0;i<n.length;i++) {
			if(n[i]<s)
				s=n[i];
		}
		System.out.println(s);
		
	}

}
