// Creating a class that has three ovberloaded methods then making a derived class that overloads this method again and showing that an instances of the derived class can call any of these methods.

class PowerRanger{
	PowerRanger(){
		System.out.println("Huuaaah!");
	}
	void strike(){
		System.out.println("Fwwwwuuuuuuah");
	}
	void strike(String s){
		System.out.println(s + "aarrrrraaaaaah!");
	}
	void strike(String s, int i){
		System.out.println(s + "hrrrrraaauyah");
	}
}

class PinkRanger extends PowerRanger{
	PinkRanger(){
		super();
	}
	void strike(int i, String s){
		System.out.println(s + "moooochawa!");
	}
}

public class ch6ex13{
	public static void main(String[] args){
		PinkRanger p = new PinkRanger();
		p.strike();
		p.strike("bwaaaaaa");
		p.strike("bwaaaaaa", 3);
		p.strike(3, "bwaaaaaa");

	}
}
