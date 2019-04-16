// Chapter 3 Exercise 10 demonstrates use of switches and integral expressions.s

public class ch3ex10{
	public static void main(String[] args){
		int x= 4;
		if (Math.random() <=0.5d)
			x = 50;

		int y = 2;
		if (Math.random() <=0.25d)
			y=1;
		switch (x / y){
			case 25 : System.out.println("Case 1"); break;
			case 2 : System.out.println("Case 2"); break;
			default : System.out.println("Default"); break;
		}
	}
}

