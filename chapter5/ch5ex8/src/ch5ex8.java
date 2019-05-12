//exploring Friendly access methods.

import src.edible.Cookie;

public class ch5ex8{
	public ch5ex8(){
		System.out.println("ch5ex8 Constructor");
	}
	public static void main(String[] args){
		Cookie x = new Cookie();
		//x.bite(); will not compile because the default Friendly nature of bite() does not allow outside access (except from within the same directory as the default package)
	}
}