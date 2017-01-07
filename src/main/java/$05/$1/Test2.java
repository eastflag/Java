package $05.$1;

public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sum=0;
		String str="12345";
		String result="";
		  
		for(int i=0; i<str.length(); i++){
		     sum+=Integer.parseInt(String.valueOf(str.charAt(i)));
		     result+=str.charAt(i);
		     if(i<str.length()-1)result+="+";
		     else result+="="+sum;
		}
		System.out.println(result);

	}
}

