package $06.$5.$2;

//this : 참조변수
//this() : 생성자 호출
class CarTest2 { 
   public static void main(String[] args) { 
         Car c1 = new Car();       
         Car c2 = new Car("blue"); //2. 인자가 하나짜리 생성

         System.out.println("c1의 color=" + c1.color + ", gearType=" +c1.gearType+ ", door="+c1.door); 
         System.out.println("c2의 color=" + c2.color + ", gearType=" +c2.gearType+ ", door="+c2.door); 
   } 
} 

class Car { 
 String color;             // 색상 
 String gearType;      // 변속기 종류 - auto(자동), manual(수동) 
 int door;                   // 문의 개수 

 Car() { 
 	//1. 메인에서 초기화한 부분을 생성자로 이동
      this("white", "auto", 4);    // Car(String color, String gearType, int door)를 호출 
 } 

 //2. 
 Car(String color) { 
       this(color, "auto", 4); 
 } 

 Car(String color, String gearType, int door) { 
 	//3. this 키워드 사용법.
       this.color = color; 
       this.gearType = gearType; 
       this.door = door; 
 } 
}