// Even without the Cartoon constructor the compiler will create a default constructor that calls the Base class constructors in descending order.

class Art {
	Art(){
		System.out.println("Art Constructor");
	}
}

class Drawing extends Art {
	Drawing(){
		System.out.println("Drawing Constructor");
	}
}

public class Cartoon extends Drawing {
	//Cartoon(){	System.out.println("Cartoon Constructor");	} Commented out deliberately.
	public static void main(String[] args){
		Cartoon x = new Cartoon();
	}
}

