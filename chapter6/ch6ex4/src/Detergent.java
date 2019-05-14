class Cleanser {
	private String s = new String("Cleanser");
	public void append(String a) { s+=a ; }
	public void dilute() { append(" dilute()"); }
	public void apply() { append(" apply()"); }
	public void scrub() { append(" scrub()"); }
	public void print()	{ System.out.println(s); }
}

public class Detergent extends Cleanser{
	public void scrub() { // overwrites previous scrub method when called Detergent object.
		append ( " Detergent.scrub()");
		super.scrub(); // calls base class version
	}
	public void foam(){ append(" foam()"); }
}
