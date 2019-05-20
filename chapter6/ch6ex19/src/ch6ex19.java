// Using blank final reference to an object and initalizing it within a method. Showing that that the reference cannot be changed as it is final once initialized.
class Bullet {
	Bullet(){}
}

class Revolver {
	final Bullet b;
	public void switchammunition() {
		if (b == null){
			this.b = new Bullet();
			System.out.println("Look - it's perfectly safe. It only contains blanks.");
		}
	}
}

public class ch6ex19{
	public static void main(String[] args){
		Revolver r = new Revolver();
		r.switchammunition();
	}
}