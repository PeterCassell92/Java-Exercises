//Demonstrating that the default constructor will be made for ch6ex7 and will call its base class.
class PrinceofPersia {
	PrinceofPersia(){
		System.out.println("You have unleashed the Sands of Time!");
	}
}

public class ch6ex7 extends PrinceofPersia {
	public static void main(String[] args){
		ch6ex7 n = new ch6ex7();
	}
}