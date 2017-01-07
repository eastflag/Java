package com.eastflag.generic;

public class q1 {

	public static void main(String[] args) {
		Result<String> a1 = new Result<String>("AAA");
		Result<Integer> a2 = new Result<Integer>(3);

		System.out.println("Answer is " + a1.getObject() + "," + a2.getObject());
	}

}

class Result<T> {
	private T object;
	//1. 메인함수에서 인스턴스가 생성되도록 올바른 생성자 작성
	public Result(T object){
		this.object = object;
	}

	//2. 메인함수에서 "Answer is AAA,3"이 출력되도록 올바른 getObject() 함수 작성
	public T getObject(){
		return object;
	}
}