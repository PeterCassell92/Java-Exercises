// demonstrating upcasting
import src.classification.*;
public class ch6ex16{
	public static void main(String[] args){
		Frog f = new Frog();
		f.hop();
		Amphibian.swim(f); // the swim function expects an Amphibian object. The derived Frog object is also an Amphibian object.

	}
}
