// class with various different methods.
package src.mrbig;

public class Bigclass{
	public static int x = 1;
	private static int y =2;
	int z = 3;
	public static void openseason(String s){
		System.out.println(s);
	}
	private static void closedforlunch(String s){
		System.out.println(s);
	}
	protected static void trespassersbeware(String s){
		System.out.println(s);
	}
	public void variablegetter(){
		System.out.println(this.x + "doooooooo");
		System.out.println(this.y + "yoooooou");
		System.out.println(this.z + "knoooow?");
	}	
}