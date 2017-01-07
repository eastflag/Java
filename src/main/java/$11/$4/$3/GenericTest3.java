package $11.$4.$3;
import java.util.ArrayList;
import java.util.List;

public class GenericTest3 {
	//?(와일드카드) 사용 예제
	public static void main(String[] args) {
		//컬렉션에서 <T>이 폴리모피즘이 허용이 안된다.
		//컬렉션은 폴리모피즘이 허용된다.
		//List<Product> productList = new ArrayList<Product>();
		List<Product> productList = new ArrayList<Product>();
		//List<product> productList2 = new ArrayList<Tv>();  //T는 폴리모피즘 적용안됨.
		
		productList.add(new Product()); //Inner Type
		Tv tv = new Tv();
		productList.add(tv);  //Product p = new Tv();
		productList.add(new Audio());
		
		printAll(productList);
		
		//Tv예
		ArrayList<Tv> tvList = new ArrayList<Tv>();
		tvList.add(new Tv());
		tvList.add(new Tv());
		
		//printAll(tvList);   //컴파일 오류
		//List<Product> a = new ArrayList<Tv>(); =>허용안됨
		//그래서 <? extends Product> 문법이 나옴.
		printAll2(tvList);  //
	}
	
	public static void printAll(List<Product> list){
		for( Product p : list){
			System.out.println(p);
		}
	}
	
	//폴리모피즘을 적용하기 위해서 ?를 사용함.
	public static void printAll2(List<? extends Product> list){
	//public static  <T extends Product> void printAll2(ArrayList<T> list){
	//ArrayList<? super Product> => Product와 그 조상을 허용
		for( Product p : list){
			System.out.println(p);
		}
	}

}

class Product{}
class Tv extends Product{}
class Audio extends Product{}
