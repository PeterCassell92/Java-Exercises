//showing initiliazation of a string using a constructor.
class Initmonlee{
	static String s = " Kick"; 
}

class Initmonchan{
	static String s;
	static {
		s = "Punch";
	}
}

public class ch4ex17{
	public static void main(String[] args){
		Initmonlee a1 = new Initmonlee();
		Initmonchan a2 = new Initmonchan();
		System.out.println(a1.s);
		System.out.println(a2.s);
	}

}