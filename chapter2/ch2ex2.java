/* Exercise 2 shows how to define new classes with variables. This demonstrates also that variables in Java classes are autoassigned values (int = 0).
*/

class ATypeName {
int i;
char c;
}

public class ch2ex2{
	public static void main(String[] args) {
		ATypeName a = new ATypeName() ;
		System.out.println(a.i) ;
	}
}

/* output = 0 