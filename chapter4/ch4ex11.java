//cdmonstrating use of finalize() to run when garbage collector runs
import java.util.*; // needed for ArrayLists
import java.lang.*; //needed for forcing garbage collection

class Brieyonce {
	List<String> sound = new ArrayList<String>();
	Brieyonce(){
		sound.add("pokerface");
	}

	void ladyGorgonzola() {
		String s = "po";
		sound.add("s");
		System.out.println("po");
	}
	public void finalize(){ // needs to be publicly accessible so that garbage collector can call it from anywhere.
		System.out.println("kerface po po pokerface!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}

}

public class ch4ex11{
	public static void main(String[] args){
		Brieyonce a1 = new Brieyonce();
		int x =0;
		while(x < 10 ){
			a1.ladyGorgonzola();
			x++;
			new Brieyonce(); //without this line program will not work. this makes a new object and drops the old reference without cleaning up.
		}
		
		java.lang.System.gc(); // forces garbage collection.
	}

}

