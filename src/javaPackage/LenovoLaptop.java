package javaPackage;

public class LenovoLaptop {

	public LenovoLaptop(){
		this(123);
		System.out.println("default const");
	}
	public LenovoLaptop(String name ){
    System.out.println("non-para");
	}
	public LenovoLaptop(int i){
	this("gowriii");	
	System.out.println("non-para 2");
	}
	
	public static void main(String[] args) {
		LenovoLaptop l = new LenovoLaptop();
	}
	
	
}
