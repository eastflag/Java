package $05.$2;
import java.util.ArrayList;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//ArrayList 예제 1
		//JDK 1.5 이전 사용 방법
		ArrayList ar1 = new ArrayList(); //ArrayList 선언, Object를 담는다.
		
		ar1.add(90);
		ar1.add("80");
		ar1.add(75);
		
		int sum = 0;
		for(Object obj: ar1){
			sum += Integer.parseInt(obj.toString());
		}
		System.out.println("sum:" + sum);
		
		//ArrayList 예제 2
		//Generic => JDK 1.5에 새롭게 추가. 담을수 있는 타입을 미리 결정
		//Integer => int 타입의 Wrapper 클래스
		int sum2 = 0;
		ArrayList<Integer> ar2 = new ArrayList<Integer>(); //선언, Integer만 담겠다.
		ar2.add(90);  //Interger외에 못담는다
		ar2.add(80);  //"80" 스트링 타입 못담음
		ar2.add(75);
		for(Integer i : ar2){
			sum2 += i;
		}
		
		System.out.println("sum2:" + sum2);

	}

}
