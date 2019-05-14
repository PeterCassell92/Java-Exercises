//This shows use of Base class with non-default constructor. The base class constructor therefore has to be explicitly referenced using 'super.class Vizier {
	Vizier(int i){
		System.out.println("Give me the Dagger! Only then can you undo this curse.");
	}
}

public class ch6ex9 extends Vizier {
	ch6ex9(){
		super(5);
		System.out.println("Derived class constructor");
	}
	ch6ex9(int i){
		super(i);
		System.out.println("Derived class constructor - int argument");
	}

	public static void main(String[] args){
		ch6ex9 n = new ch6ex9();
		ch6ex9 o = new ch6ex9(9);
	}
}