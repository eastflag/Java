package $07.$5;

public class Test {

	//7.6 abstract + 다형성 예제
	public static void main(String[] args) {
		Unit [] u = new Unit[5];
		u[0] = new Marine();
		u[1] = new Tank();
		u[2] = new Dropship();
		u[3] = new Marine();
		u[4] = new Tank();
		
		for(int i=0; i < u.length ; i++){
			u[i].move(0, 0);
		}
	}

}

//1. Unit 클래스 없이 3가지 클래스 작성
//2. Unit 클래스 정의 후 x,y,  move 함수 공통화(추상화)
abstract class Unit { 
    int x, y; 
    abstract void move(int x, int y); 
    void stop() {       /* 현재 위치에 정지 */ } 
} 

class Marine extends Unit {       // 보병 
    void move(int x, int y) { 
    	System.out.println("Marine moved:" + x + "," + y);
    } 
    void stimPack() {       /* 스팀팩을 사용한다.*/} 
}

class Tank extends Unit { // 탱크 
    void move(int x, int y) { 
    		System.out.println("Tank moved:" + x + "," + y); 
    } 
    void changeMode() {       /* 공격모드를 변환한다. */} 
}

class Dropship extends Unit { // 수송선 
    void move(int x, int y) { 
    	System.out.println("Dropship moved:" + x + "," + y);
    } 
    void load() { /* 선택된 대상을 태운다.*/ } 
    void unload() { /* 선택된 대상을 내린다.*/ } 
}