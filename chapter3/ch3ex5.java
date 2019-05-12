//Chapter 3 Exercise 5. The object of the program is to print from 1 to 100. This time there is a break when the program hits 47.
//learning point - java loops do require {} if they contain more than one statement.

public class ch3ex5{

	public static void main(String[] args){

		for ( int x =1; x <=100; x++ ){ // use x++ post-fix so value is given first then it is incremented.
			System.out.println(x);
			if (x == 47){
				break;
			}
		}
	}
}