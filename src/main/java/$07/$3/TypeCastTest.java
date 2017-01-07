package $07.$3;

public class TypeCastTest {

	//7.5.2 참조변수의 형변환 설명
	public static void main(String[] args) {
		Car car = null;
		FireEngine fe1 = new FireEngine();
		
		//다형성
		car = fe1;   //자손 -> 부모 : 형변환이 필요없음, 부모 -> 자식 형변환이 필요함
		//car.water();  //안됨
		
		FireEngine fe2 = null;
		fe2 = (FireEngine) car; //다형성 성질을 가진 조상을 자손에 넣을때는 형변환으로 가능
		fe2.water();
		
		//car 인스턴스를 fireengine에 넣는것은 런타임 오류
		Car car2 = new Car();
		FireEngine f3 = new FireEngine();
		//f3 = (FireEngine) car2; //런타임 오류, 

	}

}

class Car{
	int door=4;
	
	void drive(){
		System.out.println("drive");
	}
}

class FireEngine extends Car{
	int latter=2;
	
	void water(){
		System.out.println("water");
	}
}

class Ambulance extends Car{
	void siren(){
		System.out.println("siren");
	}
}
