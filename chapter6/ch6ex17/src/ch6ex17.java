// demonstrating upcasting including method overrides in this case.
import src.classification.*;
public class ch6ex17{
	public static void main(String[] args){
		Frog f = new Frog();
		f.hop();
		Amphibian.swim(f); //the swim function expects an Amphibian object. The derived Frog object is also an Amphibian object.
		Frog.swim(f);
		Amphibian.landmove(f);
		Frog.landmove(f);
	}
}
