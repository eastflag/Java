package $07.$2;

public class PolyConceptTest {

	//7.5.1 설명 예제
	//메모리구조로 이해하면 당연함
	public static void main(String[] args) {
		//다형성 CaptionTv -> Tv 성립.
		Tv tv1 = new CaptionTv();

		System.out.println(tv1.power);
		System.out.println(tv1.channel);
		//System.out.println(tv.caption); 안됨
		tv1.channelUp();
		//tv.display();안됨
		
		//반대는 안됨
		//CaptionTv ctv = new Tv();
		
		Tv tv2 = new TvR();
		//TvR이라는 형태를 띄고 있지만 실제로는 Tv 성질만 가지고 있음
		//TvR의 속성인 record는 접근이 불가하고 오직 자기 속성만 접근 가능

	}

}

class Tv{
	boolean power;
	int channel;
	
	void channelUp(){
		channel++;
	}
}

class CaptionTv extends Tv{
	String caption;
	
	void display(){
		System.out.println("display");
	}
}

class TvR extends Tv {
	boolean record;
}
