// more constructor overloading

class Dog {
	Dog(){

		String sound = "Wrrrrruuuuff!";
	}
	Dog( int i){
		String sound = "Wrrrgghhggrrrgh";
	}
	Dog (char c){
		String sound = "Arwwwooooooooo";
	}
	Dog (double d){
		String sound = "RRRrrrraFFF";
	}
	Dog (boolean b){
		String sound = "hhggurrrrhhh";
	}
}



public class ch4ex6 {
	public static void main(String[] args){

	Dog robbo = new Dog();
	Dog bonbon = new Dog(3);
	Dog yatzee = new Dog('p');
	Dog finessa = new Dog(5.5);
	Dog dotty = new Dog(true);

	}
}