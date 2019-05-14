//demonstrating inheritance, composition and constructor ordering.

class Chipmunk {
	Chipmunk(){
		System.out.println("Chipmunk Constructor");

	}
}

class Paws{
	Paws(){
		System.out.println("Paws Constructor");
	}
}

class Alvin extends Chipmunk { // this is inheritence
	Paws p = new Paws(); // this counts as composition.
}

public class ch6ex1{
	public static void main(String[] args){
		Alvin a = new Alvin();
	}
}