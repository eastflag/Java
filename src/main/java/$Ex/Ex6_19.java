package $Ex;

public class Ex6_19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "ABC123";
		System.out.println(str);
		change(str);
		System.out.println("After change:"+str);

	}
	
	public static void change(String str) {
		str += "456";
		}

}