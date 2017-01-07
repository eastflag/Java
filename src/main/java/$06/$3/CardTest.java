package $06.$3;

public class CardTest {

	/**
	 * 클래스 영역 예
	 */
	public static void main(String[] args) {
		// 클래스변수(static 변수)는 객체생성없이 '클래스이름.클래스변수'로 직접 사용 가능하다. 
        System.out.println("Card.width = " + Card.width); 
        System.out.println("Card.height = " + Card.height); 

        Card c1 = new Card(); 
        c1.kind = "Heart"; 
        c1.number = 7; 

        Card c2 = new Card(); 
        c2.kind = "Spade"; 
        c2.number = 4; 

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")" ); 
        System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")" );             
        System.out.println("이제 c1의 width와 height를 각각 50, 80으로 변경합니다."); 
        c1.width = 50; 
        c1.height = 80; 

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")" ); 
        System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")" ); 

	}

}

class Card { 
    String kind ;                       // 카드의 무늬 - 인스턴스 변수 
    int number;                         // 카드의 숫자 - 인스턴스 변수 
    static int width = 100;             // 카드의 폭 - 클래스 변수 
    static int height = 250;            // 카드의 높이 - 클래스 변수 
} 