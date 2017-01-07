package $05.$1;


public class Test {

	/**
	 * 일차원 배열 에제
	 */
	public static void main(String[] args) {
		//배열의 선언과 생성 방법
		//1. 선언과 생성을 따로따로
		int [] score1; //int score [];
		score1 = new int[5];
		//2. 선언과 생성을 한번에
		int [] score2 = new int[5];
		
		//배열의 초기화
		//1. 한번에 초기화
		int [] score3 = {1, 2, 3, 4, 5};
		//따로따로는 허용되지 않는다.
		//int [] score4;
		//score4 = {1, 2, 3, 4, 5};
		//2.
		int [] score;
		score = new int[]{90, 80, 75};
		
		//배열 읽기 1
		for(int i=0; i< score.length; i++){
			System.out.println("score[" + i + "] " + score[i]);
		}
		
		//JDK 1.5 특징 : 향상된 for문
		for(int i : score){
			System.out.println("score: " + i);
		}

	}

}