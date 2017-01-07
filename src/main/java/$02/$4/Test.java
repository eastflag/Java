package $02.$4;

public class Test {

	/**
	 * Primitive type과 reference type의 메모리 할당 관계 예제
	 */
	public static void main(String[] args) {
		int a=3;
		byte b=4;
        
        Tv tv = new Tv();
        tv.power = 3;
        tv.volume = 4;
        
        System.out.println(tv.volume);

        float d = 11.312218f;
        float f = Math.round(d*100)/100f;
        
        System.out.println("" + f);
	}

}

class Tv {
	int power;
	byte volume;
	
	void volumeUp(int a){
		volume += a;
	}
}
