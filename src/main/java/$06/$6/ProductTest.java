package $06.$6;
class ProductTest { 
	/**
	 * 초기화 테스트
	 * 초기화 순서 : 
	 * 클래스 변수 초기화(명시적 초기화 => 블락 초기화 => 생성자 초기화) 
	 *   => 인스턴스 변수 초기화(명시적 초기화 => 블락 초기화 => 생성자 초기화)
	 */
      public static void main(String args[]) { 
    	//1. 클래스 로드시 메서드 에어리어 영역에 클래스 변수가 초기화
  		
  		//2. 인스턴스 변수 초기화
            Product p1 = new Product(); 
            Product p2 = new Product(); 
            Product p3 = new Product(); 

            System.out.println("p1의 제품번호(serial no)는 " + p1.serialNo); 
            System.out.println("p2의 제품번호(serial no)는 " + p2.serialNo); 
            System.out.println("p3의 제품번호(serial no)는 " + p3.serialNo); 
            System.out.println("생산된 제품의 수는 모두 " +Product.count +"개 입니다."); 
      } 
} 

class Product { 
    static int count = 0;       // 생성된 인스턴스의 수를 저장하기 위한 변수 
    int serialNo;                  // 인스턴스 고유의 번호 
    
    /*
	static{
		count = 3;
	}
	*/

    { 
//Product인스턴스가 생성될 때마다 count의 값을 1씩 증가시켜서 serialNo에 저장한다. 
          ++count; 
          serialNo = count; 
    } 

    public Product() {} 
} 