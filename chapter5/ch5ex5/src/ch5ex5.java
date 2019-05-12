// demonstrating being able to turn Assert statements on and off by changing which package is loaded.
import src.tools.debug.Assert; // or src.tools.Assert.java for debug = off.
public class ch5ex5{
	public static void main(String[] args){
		Assert.is_true((2 + 2) == 5);
		Assert.is_false((1+1) == 2);
		Assert.is_true((2+2) == 5, "2+2 ==5");
		Assert.is_false((1+1) == 2, "1+1 !=2");

	}
}