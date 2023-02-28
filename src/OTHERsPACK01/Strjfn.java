package OTHERsPACK01;

public class Strjfn {
	public static void main(String[] args) {
		String s = "javavadffvavav";
		int count;

		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			count = 1;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j] && ch[i] != ' ') {
					count++;
					ch[j] = '0';
				}
			}
			if (count > 1 && ch[i] != '0')
				System.out.print(ch[i]+" ");

		}

	}

}
