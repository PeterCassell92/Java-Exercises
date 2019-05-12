// demonstrating correct use of import / custom classes. There is a deliberate collision here where both Vector and List are classes within two different libraries so the compiler does not know which to select.
import src.simple.*;
import java.util.*;
public class ch5ex3 {
	public static void main(String[] args){
		Vector v = new Vector();
		List l = new List();
	}
}
