public class CilletBang extends Detergent{
	public void scrub(){
		append(" Bang and the dirt is gone");
		super.scrub();
	}
	public void introduce(){ // problem called for Sterilize method but this seems better.
		System.out.println("Hi, I'm Barry Scott");
	}
}