package $A;
public class VarArgsTest {

	public static void main(String[] args) {
		System.out.println( concatenate("-", "100", "200", "300") );
		System.out.println( concatenate("-", "100", "200", "300", "400") );

	}
	
	//delimiter를 뒤에 오는 변수마다 붙여준다
	private static String concatenate(String delim, String... params ){
		String result="";
		/*
		for(int i=0; i<params.length ; i++){
			result += params[i] + delim;
		}
		*/
		for(String arg : params){
			result += arg + delim;
		}
		
		return result;
	}

}
