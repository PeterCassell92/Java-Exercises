//using lazy initialization

class Bread{
	Bread(){
		System.out.println("I'm flat yet textured"); //is not called during this program.

	}
}

class Sandwich{
	Bread b; //lazy intialisation

}

public class ch6ex3{
	public static void main(String[] args){
		Sandwich s = new Sandwich();
	}
}