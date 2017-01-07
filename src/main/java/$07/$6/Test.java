package $07.$6;

public class Test {

	//7.7.3 ~ 7.7.4 인터페이스 상속과 구현 예제
	//instanceof 예제 포함.
	public static void main(String[] args) {
		
		 //3. 인터페이스를 구현한 클래스도 인터페이스의 조상이다.
		 Fighter f = new Fighter(); 

         if (f instanceof Unit)       {             
               System.out.println("f는 Unit클래스의 자손입니다."); 
         } 
         if (f instanceof Fightable) {       
               System.out.println("f는 Fightable인터페이스를 구현했습니다."); 
         } 
         if (f instanceof Movable) {             
               System.out.println("f는 Movable인터페이스를 구현했습니다."); 
         } 
         if (f instanceof Attackable) {       
               System.out.println("f는 Attackable인터페이스를 구현했습니다."); 
         } 
         if (f instanceof Object) {             
               System.out.println("f는 Object클래스의 자손입니다."); 
         } 
	}

}

//2. 인터페이스 구현
//class Fighter extends Unit implements Movable, Attackable{
class Fighter extends Unit implements Fightable { 
    public void move(int x, int y) { /* 내용 생략 */} 
    public void attack(Unit u) { /* 내용 생략 */} 
} 

class Unit { 
	int currentHP;       // 유닛의 체력 
	int x, y;            // 유닛의 x, y 좌표 
} 
//1. 인터페이스 상속
interface Fightable extends Movable, Attackable { } 
interface Movable {       void move(int x, int y);       } 
interface Attackable {       void attack(Unit u); } 
