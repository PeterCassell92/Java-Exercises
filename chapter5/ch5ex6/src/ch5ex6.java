// playing with class access.

import src.mrbig.Bigclass;

public class ch5ex6{
	public static void main(String[] args){
		Bigclass b = new Bigclass();

		b.openseason("Howdie");
		//b.closedforlunch("sorry no bread"); Have now tested that this throws up an error as is private
		//b.trespassersbeware("Don't take another step!"); have now confirmed that this throws up an error as is protected.
		b.variablegetter();
	}
}