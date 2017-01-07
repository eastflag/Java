package $05.$3;
import java.util.ArrayList;


public class OopTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Student A = new Student();
		A.name = "Tom";
		A.MathScore= 85; A.KoreanScore = 72; A.EngScore = 92;
		
		Student B = new Student();
		B.name = "Jone"; 
		B.MathScore= 66; B.KoreanScore = 92; B.EngScore = 55;
		
		Student C = new Student();
		C.name = "Lee";
		C.MathScore= 52; C.KoreanScore = 77; C.EngScore = 55;
		
		Student D = new Student();
		D.name = "Kim";
		D.MathScore= 88; D.KoreanScore = 59; D.EngScore = 49;
		
		/*
		A.CalculateScore();
		B.CalculateScore();
		C.CalculateScore();
		D.CalculateScore();
		*/
		
		System.out.println("�л� ���� ���� ���� ���� ���");
		System.out.println("=======================");
		/*
		System.out.println(A.name + " " + A.MathScore + " " + A.KoreanScore + " " + A.EngScore + " " + A.total + " " + A.average);
		System.out.println(B.name + " " + B.MathScore + " " + B.KoreanScore + " " + B.EngScore + " " + B.total + " " + B.average);
		System.out.println(C.name + " " + C.MathScore + " " + C.KoreanScore + " " + C.EngScore + " " + C.total + " " + C.average);
		System.out.println(D.name + " " + D.MathScore + " " + D.KoreanScore + " " + D.EngScore + " " + D.total + " " + D.average);
		*/
		System.out.println( String.format("asdf %s %s", "a", "b") );
		
		//ArrayList�� ����Ͽ� �ݺ����� �κ��� ����
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(A);
		students.add(B);
		students.add(C);
		students.add(D);
		
		for(Student any : students){
			any.CalculateScore();
			System.out.println(any.name + " " + any.MathScore + " " + any.KoreanScore + " " + any.EngScore + " " + any.total + " " +any.average);
		}
		
	}

}

//1. ��ü �𵨸�
class Student {
	// Property(�Ӽ�) ����
	// ����, ����, ���� ���� �Ӽ� ����
	String name;
	int MathScore;
	int KoreanScore;
	int EngScore;
	int total;
	int average;
	
	//method ����
	void CalculateScore(){
		total = MathScore + KoreanScore + EngScore;
		average = total/3;
	}
}

class Teacher{
	//Property
	int total;
	int average;
	
	//method, �л��� ������ ���ϴ� ����
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
