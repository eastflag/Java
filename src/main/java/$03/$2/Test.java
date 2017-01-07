package $03.$2;

public class Test {

	/**
	 * instanceof 연산자
	 */
	public static void main(String[] args) {
		Tv tv = new Tv();
		
		CaptionTv cTv = new CaptionTv();
		
		if( tv instanceof Tv) {
			System.out.println("tv는 Tv의 instance 이다");
		}
		
		if( cTv instanceof Tv) {
			System.out.println("cTv는 Tv의 instance 이다");
		}
		
		Tv ptv = new CaptionTv();
		
		if( ptv instanceof Tv) {
			System.out.println("ptv는 Tv의 instance 이다");
		}
		
		if( ptv instanceof CaptionTv) {
			System.out.println("ptv는 CaptionTv의 instance 이다");
		}
	}

}

class Tv {
	int volum;
	int channel;
	void channelUp(){
		volum++;
	}
}

class CaptionTv extends Tv{
	String caption;
}
