package $11.$4.$2;

public class GenericTest2 {

	public static void main(String[] args) {
		
		//3. Generic
		Result<String> a1 = new Result<String>("AAA");
		Result<Integer> a2 = new Result<Integer>(3);
		
		System.out.println("Answer is " + a1.getObject() + "," + a2.getObject());

	}

}

class Result<T> {
	private T object;
	public Result(T object){
		this.object = object;
	}
	
	public T getObject(){
		return object;
	}
}