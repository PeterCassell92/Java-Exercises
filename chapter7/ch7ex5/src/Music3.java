// implemented random method that demonstrates polymorphism of the classes selected as, regardless of type, they can all take the same methods.
import java.util.*;

class Instrument{
	public void play(){
		System.out.println("Instrument.play()");
	}
	public String what(){
		return "Instrument";
	} 
	public void adjust(){}
	// added method to override toString which is used in System.out.println method.
	public String toString(){ 
		return what();
	}
}

class Wind extends Instrument {
	public void play(){
		System.out.println("Wind.play()");
	}
	public String what(){
		return "Wind";
	}
	public void adjust() {}
}

class Brass extends Instrument {
	public void play(){
		System.out.println("Brass.play()");
	}
	public String what(){
		return "Brass";
	}
	public void adjust() {}
}

class Stringed extends Instrument {
	public void play(){
		System.out.println("Stringed.play()");
	}
	public String what(){
		return "Stringed";
	}
	public void adjust() {}
}

class Woodwind extends Wind {
	public void play(){
		System.out.println("Woodwind.play()");
	}
	public String what(){
		return "Woodwind";
	}
	public void adjust() {}
}

class Viola extends Stringed{
	public void play(){
		System.out.println("Viola.play()");
	}
	public String what(){
		return "Viola";
	}
	public void adjust(){}
}

public class Music3{
	static void tune (Instrument i){
		i.play();
	}
	static void tuneAll(Instrument[] e){
		for (int i =0; i <e.length; i++)
			tune(e[i]);
	}
	static Instrument randInst(){ 
		switch ((int)(Math.random()*5)){
			default:
			case 0: return new Wind();
			case 1: return new Brass();
			case 2: return new Stringed();
			case 3:	return new Woodwind();
			case 4:	return new Viola();
		}
	}
	public static void main(String[] args){
		Instrument[] orchestra = new Instrument[5] ;
		int i =0;
		//upcasting during addition to the array:
		orchestra[i++] = randInst();
		orchestra[i++] = randInst();
		orchestra[i++] = randInst();
		orchestra[i++] = randInst();
		orchestra[i++] = randInst();
		tuneAll(orchestra);

		System.out.println(orchestra[2]);// directly prints class objects as the toString() method ensures string is correctly produced.
		System.out.println(orchestra[3]);
	}
}