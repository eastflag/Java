package $07.$7;

//1. 유닛 객체모델링 : 상속과 추상화
//2. 유닛을 움직일 Player 클래스 객체 모델링
//3. 응용프로그램에서 Player 인스턴스 생성.
// Player가 마우스로 탱크, 마린, 드랍십 유닛을 선택후 
// 화면상 10,10 포인트로 마우스 우클릭했다고 가정

public class StarcraftTest {

	public static void main(String[] args) {
		Player playerA = new Player();
		playerA.SetPoint(10, 10); // 화면상의 10, 10 지점을 마우스로 클릭
		
		Marine m = new Marine();
		playerA.MoveUnit(m);
		Tank t = new Tank();
		playerA.MoveUnit(t);
		Dropship d = new Dropship();
		playerA.MoveUnit(d);
		
		playerA.RepairUnit(t);
		playerA.RepairUnit(d);
		playerA.RepairUnit(new Repairable() {
			
			@Override
			public void repair() {
				System.out.println("unit repair");
				
			}
		});
	}

}

class Player {
	int x ,y; //화면상 클릭한 포인트
	void SetPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	//1. 상속과 추상화만 이용 => 새로운 유닛 추가시 Player 클래스에 변형...
	/*
	void MoveUnit(Marine m){
		m.move();
	}
	void MoveUnit(Tank t){
		t.move();
	}
	void MoveUnit(Dropship d){
		d.move();
	}
	*/
	//2. ploymorphism 이용
	void MoveUnit(Unit u){ // Unit u = new Marine()
		u.move();
	}
	
	//인수로 Marine, Tank, Dropship을 받지 않고 인터페이스를 받는다.
	void RepairUnit(Repairable r){  //인터페이스를 구현한 인스턴스를 변수로 받는다. or null
		r.repair();
	}
	void AttackUnit(Attackable a){
		a.attack();
	}
}

//3. 탱크와 드랍쉽의 수리가능하다는 공통성을 뽑아서 interface로 추상화
interface Repairable{
	void repair();
}

//4. 탱크와 마린은 공격가능하다는 공통성을 뽑아서 추상화
interface Attackable{
	void attack();
}

abstract class Unit {
	int x, y;
	void stop(){
	}
	abstract void move();
}

class Marine extends Unit implements Attackable{
	@Override
	void move() {
		System.out.println("Marine move");
	}

	@Override
	public void attack() {
		System.out.println("Marine attack");
	}
}

class Tank extends Unit implements Repairable, Attackable{
	@Override
	void move() {
		System.out.println("Tank move");
	}

	@Override
	public void repair() {
		System.out.println("Tank repair");
	}

	@Override
	public void attack() {
		System.out.println("Tank attack");
	}
}

class Dropship extends Unit implements Repairable{
	@Override
	void move() {
		System.out.println("Dropship move");
	}

	@Override
	public void repair() {
		System.out.println("Dropship repair");
	}
}
