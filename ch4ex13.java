//using death condition to verify that objects are in correct state when garbage is being collected.
class Tank{
	boolean status;
	Tank(boolean b){
		status = b;
	}

	void emptyTank(){
		status = false;
	}

	public void finalize(){
		if (status = true){ //verifys that tanks is always empty on finalization.
			System.out.println("Error: Tank is full");
		}
	}
}

public class ch4ex13{
	public static void main (String[] args){

		Tank dozer = new Tank(true);
		dozer.emptyTank();
		new Tank(true);
		System.gc();
	}

}