//showing initiliazation of a string using a constructor.
class Initmonlee{
	String s = " Kick"; 
}

class Initmonchan{
	String s;
	Initmonchan(){
		s = "Punch";
	}
}

public class ch4ex16{
	public static void main(String[] args){
		Initmonlee a1 = new Initmonlee();
		Initmonchan a2 = new Initmonchan();
		System.out.println(a1.s);
		System.out.println(a2.s);
	}

}