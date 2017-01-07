package $02.$1;

public class GenTest {
	public static void main(String[] args){
		
		Gen<String> g1 = new Gen<String>("str");
		
		Gen<Integer> i1 = new Gen<Integer>(3);
		
		System.out.println(g1.getObject() + ","+ i1.getObject());
	}
}

class Gen<T>{
	private T object;
	
	public Gen(T object){
		this.object = object;
	}

	public T getObject() {
		return object;
	}

	public void setObject(T object) {
		this.object = object;
	}
	
}
