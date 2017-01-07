package $07.$4;

class PolyArguTest { 
	
    public static void main(String args[]) { 
    		//7.5.5 매개변수의 다형성 예제
			Buyer b = new Buyer(); 
			Tv tv = new Tv(); 
			Computer com = new Computer(); 
			
			b.buy(tv); //Product p = new Tv ();
			b.buy(com); //Product p = new Computer();
			//만일 새로운 제품이 등장하면 Buyer 클래스에 but 함수는 다시 추가 되어야함.
			//그러므로 다형성을 이용하면 더이상의 코드 추가는 없음.
			
			System.out.println("현재 남은 돈은 " + b.money + "만원입니다."); 
			System.out.println("현재 보너스점수는 " + b.bonusPoint + "점입니다."); 
			
			//7.5.6 다형성을 이용한 여러종류의 객체를 배열로 담기
			Product [] p = new Product[3];
			p[0] = new Tv();
			p[1] = new Computer();
			p[2] = new Tv();
			for(int i =0; i < p.length ; i++){
				b.buy(p[i]);
			}
			
			System.out.println("현재 남은 돈은 " + b.money + "만원입니다."); 
			System.out.println("현재 보너스점수는 " + b.bonusPoint + "점입니다."); 
      } 
} 

class Product { 
      int price;                   // 제품의 가격 
      int bonusPoint;             // 제품구매 시 제공하는 보너스점수 
      Product(int price) { 
            this.price = price; 
            bonusPoint =(int)(price/10.0);       // 보너스점수는 제품가격의 10% 
      } 
} 

class Tv extends Product { 
      Tv() { 
            // 조상클래스의 생성자 Product(int price)를 호출한다. 
            super(100);                   // Tv의 가격을 100만원으로 한다. 
      } 

      public String toString() {       // Object클래스의 toString()을 오버라이딩한다. 
            return "Tv"; 
      } 
} 

class Computer extends Product { 
      Computer() { 
            super(200); 
      } 

      public String toString() { 
            return "Computer"; 
      } 
} 

class Audio extends Product {
	Audio(){
		super(70);
	}
	public String toString(){
		return "Audio";
	}
}

class Buyer {                   // 고객, 물건을 사는 사람 
      int money = 1000;       // 소유금액 
      int bonusPoint = 0;       // 보너스점수 
      
      void buy(Tv tv){
    	  if(money < tv.price){
    		  System.out.println("잔액이 부족하여 물건을 살수 없습니다."); 
              return; 
    	  }
    	  money -= tv.price;
    	  bonusPoint += tv.bonusPoint;
    	  System.out.println( tv.toString() + "를 구입하였습니다.");
      }
      
      void buy(Computer c){
    	  if(money < c.price){
    		  System.out.println("잔액이 부족하여 물건을 살수 없습니다."); 
              return; 
    	  }
    	  money -= c.price;
    	  bonusPoint += c.bonusPoint;
    	  System.out.println( c.toString() + "를 구입하였습니다.");
      }
      
      void buy(Audio a){
    	  if(money < a.price){
    		  System.out.println("잔액이 부족하여 물건을 살수 없습니다."); 
              return; 
    	  }
    	  money -= a.price;
    	  bonusPoint += a.bonusPoint;
    	  System.out.println( a.toString() + "를 구입하였습니다.");
      }

      void buy(Product p) { 
            if(money < p.price) { 
                  System.out.println("잔액이 부족하여 물건을 살수 없습니다."); 
                  return; 
            } 
            money -= p.price;             // 가진 돈에서 구입한 제품의 가격을 뺀다. 
            bonusPoint += p.bonusPoint;       // 제품의 보너스 점수를 추가한다. 
            System.out.println(p + "을/를 구입하셨습니다."); 
      } 
} 
