package $08.$1;

import java.util.ArrayList;
import java.util.HashMap;

public class NullTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> map = new HashMap<String, String>();
		ArrayList<String> array = new ArrayList<String>();
		
		array.add("aaa");
		map.put("aaa", "bbb");
		
		try {
			//System.out.println("parse:" + map.get("ccc").length());
			System.out.println("parse:" + array.get(1).length());
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		//체크 익셉션은 컴파일시 발생하는 에러로 Exception이 잡아내지 못함
		//예: IOException
		//언체크 익셉션은 런타임시 발생하는 에러로 Exception이 잡아낼수 있음
		//NullPointException, IndexOutOfBoundException
	}

}
