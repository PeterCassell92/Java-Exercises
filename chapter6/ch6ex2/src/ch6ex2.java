//demonstrating inheritance, composition and constructor ordering. expanding on ch6ex1.

class Chipmunk {
	Chipmunk(String s){
		System.out.println("Chipmunk Constructor");

	}
}

class Paws{
	Paws(String s){
		System.out.println("Paws Constructor");
	}
}

class Alvin extends Chipmunk { // this is inheritence
	protected String msg; // allows the later a.msg print function to work from outside of the function.
	Alvin(String s){
		super(s);
		this.msg = s;

	}
	Paws p = new Paws(msg); // this counts as composition.
}

public class ch6ex2{
	public static void main(String[] args){

		Alvin a = new Alvin("cuckoo");
		System.out.println(a.msg);
	}
}