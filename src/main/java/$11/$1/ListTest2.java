package $11.$1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListTest2 {
	public static void main(String[] args) 
	{
		//제네릭으로 모두 바꾸기
		List<Integer> list1 = new ArrayList<Integer>(10);
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		//인덱스: 1<= 인덱스 <4
		List<Integer> list2 = new ArrayList<Integer>(list1.subList(1,4)); 
		print(list1, list2);

		Collections.sort(list1);	// list1과 list2를 정렬한다.
		Collections.sort(list2);	// Collections.sort(List l)
		print(list1, list2);

		System.out.println("list1.containsAll(list2):"
                                         + list1.containsAll(list2));

		list2.add(22);
		list2.add(33);
		list2.add(3, 11);
		print(list1, list2);

		list2.set(3, 12);
		print(list1, list2);
		
		// list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다.
		System.out.println("list1.retainAll(list2):" 
                                         + list1.retainAll(list2));	
		print(list1, list2);
		
		//  list2에서 list1에 포함된 객체들을 삭제한다.
		for(int i= list2.size()-1; i >= 0; i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list1, list2);
	} // main

	static void print(List<Integer> list1, List<Integer> list2) {
		System.out.println("list1:"+list1);
		System.out.println("list2:"+list2);
		System.out.println();		
	}
} // class