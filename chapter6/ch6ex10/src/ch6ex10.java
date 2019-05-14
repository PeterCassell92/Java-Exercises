class Blade{
	Blade(){
		System.out.println("Blade Constructor");
	}

}
class Vein{
	Vein(){
		System.out.println("Vein Constructor");
	}
}
class Midrib{
	Midrib(){
		System.out.println("Midrib Constructor");
	}

}

class Root{
	Root(){
		System.out.println("Root Constructor");
	}
	Blade b = new Blade();
	Vein v = new Vein();
	Midrib m =new Midrib();
}

class Stem extends Root {
	Stem(){
		System.out.println("Stem Constructor");
	}
	Blade b = new Blade();
	Vein v = new Vein();
	Midrib m =new Midrib();
}


public class ch6ex10{

	public static void main(String[] args){
		Stem s = new Stem();
	}
}