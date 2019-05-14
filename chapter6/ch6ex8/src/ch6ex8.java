//Demonstrating that the default constructor will be made for ch6ex7 and will call its base class. This follows from previous exercise and also shows that Base class constructors are called first.
class PrinceofPersia {
	PrinceofPersia(){
		System.out.println("You have unleashed the Sands of Time!");
	}
}

public class ch6ex8 extends PrinceofPersia {
	ch6ex8(){
		System.out.println("Derived class constructor");
	}
	public static void main(String[] args){
		ch6ex8 n = new ch6ex8();
	}
}