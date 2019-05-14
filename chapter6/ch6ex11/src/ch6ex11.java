//takes ex10 and adds various different arguments to constructors.
class Blade{
	Blade(float f){
		System.out.println("Blade Constructor");
	}

}
class Vein{
	Vein(long l){
		System.out.println("Vein Constructor");
	}
}
class Midrib{
	Midrib(short s){
		System.out.println("Midrib Constructor");
	}

}

class Root{
	Root(String s){
		System.out.println("Root Constructor");
	}
	Blade b = new Blade(8.8f);
	Vein v = new Vein((long)2.393946); // casting datatypes
	Midrib m =new Midrib((short)25445);
}

class Stem extends Root {
	Stem(String s){
		super(s);
		System.out.println("Stem Constructor");
	}
	Blade b = new Blade(5.5f);
	Vein v = new Vein((long)1.8989833); // casting datatypes
	Midrib m =new Midrib((short)21224);
}


public class ch6ex11{

	public static void main(String[] args){
		Stem s = new Stem("manatee");
	}
}