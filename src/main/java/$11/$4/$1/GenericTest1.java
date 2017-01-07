package $11.$4.$1;


public class GenericTest1 {

	public static void main(String[] args) {
		Gen str = new Gen("answer");
		Gen i = new Gen(35);

		System.out.println(str.getObject().toString() + i.getObject().toString());
	}

}

class Gen{
	private Object object;
	
	public Object getObject(){
		return object;
	}
	
	public Gen(Object object){
		this.object = object;
	}
}
