//  Chapter 3 Ex2 shows the usage of ternary operators as more compact code than if else statements.

public class ch3ex2{
	static int ternary(int i){
		return i < 10 ? i*100 : i*10;
	}

	static int alternative(int i){
		if (i<10)
			return i * 100;
		else
			return i*10;
	}
	public static void main(String[] args){
			
		System.out.println("Alternative = " + alternative(4));
		System.out.println("Ternary = " + ternary(4));
	}
}