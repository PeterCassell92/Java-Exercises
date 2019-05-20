// Demonstrating use of final and static final and how they differ.

class Countdown{
	final int i1; // can be assigned as blank.
	static final int VAL1 = 300;

	Countdown(){
		i1 = 24; // can be assigned during constructor / other method.
	}

}
public class ch6ex18{
	public static void main(String[] args){
		Countdown c = new Countdown();
		c.i1= 30; // both cannot be changed as is final (throws error)
		c.VAL1 = 190; // both cannot be changed as is final (throws error)
	}
}
