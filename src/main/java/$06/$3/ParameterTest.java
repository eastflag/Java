package $06.$3;

//call by reference 와 call by value
public class ParameterTest {

	 public static void main(String[] args) { 

       Data d = new Data(); 
       d.x = 10; 
       System.out.println("main() : x = " + d.x); 

       //call by value
       change(d.x); 
       System.out.println("After change(d.x)"); 
       System.out.println("main() : x = " + d.x); 
       
       
       //call by reference (오버로딩)
       change(d);
       System.out.println("After change(d)"); 
       System.out.println("main() : x = " + d.x); 
 } 

 static void change(int x) { 
       x = 1000; 
       System.out.println("change() : x = " + x); 
 } 
 
 static void change(Data d){
	   d.x = 1000;
 }

}

class Data {
	int x;
}
