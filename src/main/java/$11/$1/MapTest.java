package $11.$1;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<String, Integer>(); 
		map.put("홍길동", new Integer(1));
		map.put("김삿갓", new Integer(2));
		map.put("이도령", new Integer(3));
		map.put("춘향이", new Integer(4));
		map.put("향단이", new Integer(5));

		System.out.println(map.get("홍길동"));
		System.out.println(map.get("김삿갓"));
		System.out.println(map.get("이도령"));
		System.out.println(map.get("춘향이"));
		System.out.println(map.get(""));


	}

}
