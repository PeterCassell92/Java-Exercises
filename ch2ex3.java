/*Shows more of using variables within classes in Java.
*/

class DataOnly {
	int i;
	float f;
	boolean b;
}

public class ch2ex3 {
	public static void main( String[] args){
		DataOnly d = new DataOnly();
		System.out.println(d.i);
		System.out.println(d.f);
		System.out.println(d.b);
	}
}