package $09.$1;

class StringEx5 {
	static String s;
	static String s2 = "";
	public static void main(String[] args) 
	{
		for(int i=1; i < 10; i++) {
			s  += i;		// s = s + i;			
			s2 += i;
		}

		System.out.println(s); //null123456789
		System.out.println(s2); //123456789
	}
}