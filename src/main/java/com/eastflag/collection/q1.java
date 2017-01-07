package com.eastflag.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Stream;

import com.eastflag.vo.BookVO;

public class q1 {

	public static void main(String[] args) {
		//2. 제네릭 컬렉션에 담기
		ArrayList<BookVO> mBookList = new ArrayList<BookVO>();
		mBookList.add(new BookVO("콩쥐팥쥐", 20000, "미상", 1));
		mBookList.add(new BookVO("흥부놀부", 25000, "미상", 2));
		mBookList.add(new BookVO("자바의정석", 35000, "남궁성", 3));
		mBookList.add(new BookVO("안드로이드정복", 15000, "김상형", 4));
		
		//3-1. 책값 평균 구하기
		int sum = 0;
		for(int i=0; i<mBookList.size(); ++i) {
			sum += mBookList.get(i).getPrice();
		}
		System.out.println("평균비용:" + sum/4);

		//3-2 stream과 람다식으로 구하기
		//double avg = mBookList.stream().mapToInt(book -> book.getPrice()).average().getAsDouble();

		//3-3 stream과 람다식을 method reference로 변환하여 구하기
		double avg  = mBookList.stream().mapToInt(BookVO :: getPrice).average().getAsDouble();
		System.out.println("stream으로 구한 평균비용:" + avg);

		// 4-1. 제목순으로 소팅한 후에 제목 출력하기
		// Collections.sort(List<T>, Comparator<? super T>) 을   익명클래스를 사용하여 구하기
		Collections.sort(mBookList, new Comparator<BookVO>() {

			@Override
			public int compare(BookVO o1, BookVO o2) {
				
				return o1.title.compareTo(o2.title);
			}
		});
		
		for(BookVO b : mBookList) {
			System.out.println(b.title);
		}

		//4-2 가격순으로 소팅하여 가격과 제목 출력하기
		// stream 의  sorted와 forEach 반복자 와 람다식을 사용하여 한줄로 처리하기
		Stream<BookVO> stream = mBookList.stream();
		stream.sorted((book1, book2) -> book1.getPrice() < book2.getPrice() ? -1 : 1)
				.forEach(book -> System.out.println(book.getTitle() + ":" + book.getPrice()));


		//4-3 : 1,2의 차이점은 무엇인가?
		//stream은 기존의 컬렉션을 변경하지 않는다.
		for(BookVO b : mBookList) {
			System.out.println(b.title);
		}
		
		// 5. 가격이 2만원 미만인 책을 제거한후 출력하기
		// (아래와 같이 하면 오류가 나는데 오류원인이 무엇이며 어떻게 수정해야 하는가?)
/*		for(BookVO b : mBookList) {
			if(b.getPrice()<20000) {
				mBookList.remove(b);
			}
		}*/
		
		CopyOnWriteArrayList<BookVO> mCopyList = new CopyOnWriteArrayList<>();
		for(BookVO b : mBookList) {
			mCopyList.add(b);
		}
		
		for(BookVO b : mCopyList) {
			if(b.getPrice()<20000) {
				mCopyList.remove(b);
			}
		}
		
		for(BookVO b : mCopyList) {
			System.out.println(b.title);
		}
		
		
	}
}