package $04.$1;

public class Test {
	final static int PERPECT =10;
	final static int A = 9;
	final static int B = 8;
	final static int C = 7;
	final static int D = 6;

	/**
	 * if 문과 switch 문 사용 예
	 * switch문의 경우 실전적인 예제를 보여준다.
	 * 90이상 A, 80이상 B, 70이상 C, 60이상 D 그외 F
	 */
	public static void main(String[] args) {
		int score =75; //100, 55, 80 등으로 테스트
		
		//1. if문
		if(score >= 90){
			System.out.println("A");
		} else if(score >=80){
			System.out.println("B");
		} else if(score >=70){
			System.out.println("C");
		} else if(score >=60){
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
		//2. switch문
		switch(score/10){ //int의 연산 결과는 int
		//3. 중복문 처리
		/*
		case 10:
			System.out.println("A");
			break;
		case 9:
			System.out.println("A");
			break;
		*/
		//4  숫자로 처리
		/*
		case 10:
			System.out.println("A");
			break;
		case 9: 
			System.out.println("B");
			break;
		case 8: 
			System.out.println("B");
			break;
		case 7: 
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}
		*/
		//2-3  final 상수로 처리
		case PERPECT:  
		case A:
			System.out.println("A");
			break;
		case B: 
			System.out.println("B");
			break;
		case C: 
			System.out.println("C");
			break;
		case D:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}

	}

}
