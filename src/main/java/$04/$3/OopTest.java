package $04.$3;

public class OopTest {

	/**
	 * 4-1을 OOP를 사용한 에제
	 */
	public static void main(String[] args) {
		//2. 학생 인스턴스 생성
		Student tom = new Student();
		tom.MathScore = 82;
		tom.KoreanScore = 91;
		tom.EngScore =78;
		
		//3. 선생님 인스턴스 생성
		Teacher dongkee = new Teacher();
		System.out.println("톰의 수학점수: " + dongkee.GradeScore(tom.MathScore) );
		System.out.println("톰의 국어점수: " + dongkee.GradeScore(tom.KoreanScore) );
		System.out.println("톰의 영어점수: " + dongkee.GradeScore(tom.EngScore) );

	}

}

//1. 객체 모델링
class Student {
	// Property(속성) 정의
	// 수학, 국어, 영어 점수 속성 정의
	int MathScore;
	int KoreanScore;
	int EngScore;
	
	//method 정의
}

class Teacher{
	//Property
	//method, 학생의 성적을 평가하는 행위
	String GradeScore(int score){
		if(score >= 90){
			return "A";
		} else if(score >=80){
			return "B";
		} else if(score >=70){
			return "C";
		} else if(score >=60){
			return "D";
		} else {
			return "F";
		}
	}
}