// more constructor overloading

class Dog {
	String sound;
	public Dog(){

		sound = "Wrrrrruuuuff!";
	}
	public Dog( int i , char c){
		sound = "Wrrrgghhggrrrgh";
	}
	public Dog (char c, int i){
		sound = "Arwwwooooooooo";
	}
	public Dog (double d){
		sound = "RRRrrrraFFF";
	}
	public Dog (boolean b){
		sound = "hhggurrrrhhh";
	}
	public String getSound(){ // getter function
		return sound;
	}
}



public class ch4ex7 {
	public static void main(String[] args){

	Dog robbo = new Dog();
	Dog bonbon = new Dog(3, 'e');
	Dog yatzee = new Dog('p', 7);
	Dog finessa = new Dog(5.5);
	Dog dotty = new Dog(true);

	System.out.println(bonbon.getSound());
	System.out.println(yatzee.getSound());
	System.out.println(bonbon.sound);
	System.out.println(yatzee.sound);

	}
}