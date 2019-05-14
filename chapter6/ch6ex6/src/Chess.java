// Showing that for non-default constructors the derived class must have a constructor. The compiler otherwise will create a default constructor for the
//derived class that will attempt to call the constructors of the base classes but will fail as it does not give an argument.
class Game{
	Game(int i){
		System.out.println ("Game Constructor");
	}
}

class BoardGame extends Game{
	BoardGame(int i){
		super(i);
		System.out.println("BoardGame Constructor");
	}
}
public class Chess extends BoardGame{
	//Chess(){super(11);	}
	public static void main(String[] args){
		Chess x = new Chess();
	}
}
