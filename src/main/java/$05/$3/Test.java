package $05.$3;

public class Test {

	/**
	 * 2차원 배열 예제
	 * 수학, 국어, 영어 점수를 가지는 4명의 학생을 이차원 배열로 저장하고, 각 과목의 평균과 총점을 구한다
	 */
	public static void main(String[] args) {
		//1. 3X4 배열, 3열 4행 생성. 수학, 국어, 영어 점수를 가지는 4명의 학생
		int [][] score = {     //new int[4][3] => int[행][열]
				{85, 75, 92},  //학생 A 수학, 국어, 영어
				{66, 92, 55},  //학생 B
				{52, 77, 55},  //학생 C
				{88, 59, 49}   //학생 D
		};
		
		//test
		System.out.println( "score[2][1] " + score[2][1]); //3행 2열 =>77
		
		//4.전체 총점과 평균 구하기
		int MathTotal = 0;
		int KoreanTotal = 0;
		int EngTotal = 0;
		
	    System.out.println("번호 수학 국어 영어 총점 평균");
	    System.out.println("=============================");
		for(int i=0; i< score.length; i++){ //4행 반복
			//4-1. 학과목 총점 구하기
			MathTotal += score[i][0];
			KoreanTotal += score[i][1];
			EngTotal += score[i][2];
			
			//1 번호 프린트
			System.out.print(" " + (i + 1) + " ");  //번호 프린트
			//2 학생별 점수 프린트
			int sum=0;
			for(int j=0; j < score[i].length; j++){  //3열을 반복
				System.out.print(" " + score[i][j] + " ");  //각 열의 점수 프린트
				//3. 총점 프린트
				sum += score[i][j];
			}
			//3 학생별 총점과 평균 프린트
			System.out.println( sum + " " + sum/3);
		}
		
		//4-2. 각 과목의 총점 출력과 평균 출력
		System.out.println("총점 " + MathTotal + " " + KoreanTotal + " " + EngTotal);
		System.out.println("평균 " + MathTotal/score.length + " " + KoreanTotal/score.length + " " + EngTotal/score.length);
	}

}
