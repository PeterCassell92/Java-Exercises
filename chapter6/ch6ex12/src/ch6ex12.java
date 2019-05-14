//takes ex11 and uses cleanup methods to get rid of fields after use.
class Blade{
	Blade(float f){
		System.out.println("Blade Constructor");
	}
	void cleanup(){
		System.out.println("Blade clean");

	}
}

class Vein{
	Vein(long l){
		System.out.println("Vein Constructor");
	}
	void cleanup(){
		System.out.println("Vein clean");

	}
}
class Midrib{
	Midrib(short s){
		System.out.println("Midrib Constructor");
	}
	void cleanup(){
		System.out.println("Midrib clean");

	}
}

class Root{
	Root(String s){
		System.out.println("Root Constructor");
	}
	Blade b = new Blade(8.8f);
	Vein v = new Vein((long)2.393946); // casting datatypes
	Midrib m =new Midrib((short)25445);
	void cleanup(){
		System.out.println("Root clean");
		m.cleanup();
		v.cleanup();
		b.cleanup();

	}
}

class Stem extends Root {
	Stem(String s){
		super(s);
		System.out.println("Stem Constructor");
	}
	Blade b = new Blade(5.5f);
	Vein v = new Vein((long)1.8989833); // casting datatypes
	Midrib m =new Midrib((short)21224);
	void cleanup(){
		System.out.println("Stem clean");
		m.cleanup();
		v.cleanup();
		b.cleanup();
		super.cleanup();

	}
}

public class ch6ex12{

	public static void main(String[] args){
		Stem s = new Stem("manatee");
		try{
			// code
		} finally {
			s.cleanup();
		}
	}
}