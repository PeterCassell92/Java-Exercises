package src.classification;
public class Frog extends Amphibian{
	public Frog(){}
	public static void hop(){
		System.out.println("Boing Boing Boing...");
	}
	public static void swim(Amphibian a){
		System.out.println("The Frog performs breast stroke.");
	}
	public static void landmove(Amphibian a){
		System.out.println("The Frog spiderman crawls along the forest floor.");
	}
}