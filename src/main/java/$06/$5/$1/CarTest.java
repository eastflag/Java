package $06.$5.$1;

public class CarTest { 
    public static void main(String[] args) { 
          Car c1 = new Car(); 
          c1.color = "white"; 
          c1.gearType = "auto"; 
          c1.door = 4; 

          Car c2 = new Car("white", "auto", 4); 
          System.out.println("c1의 color=" + c1.color + ", gearType=" +c1.gearType+ ", door="+c1.door); 
          System.out.println("c2의 color=" + c2.color + ", gearType=" +c2.gearType+ ", door="+c2.door); 
    } 
} 

class Car { 
  String color;         // 색상 
  String gearType;      // 변속기 종류 - auto(자동), manual(수동) 
  int door;             // 문의 개수 

  Car() {} //1. 최초 클래스 작성시 작성 안하고, 위에서 인스턴스 생성시 오류남을 확인
  Car(String c, String g, int d) { 
        color = c; 
        gearType = g; 
        door = d; 
  } 
} 