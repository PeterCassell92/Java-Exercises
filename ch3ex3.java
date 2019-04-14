//Chapter 3 Exercise 3 is the testcode for if-else statements. This example is deliberately using less efficient code. Return statements could be used in place of "result =" statements.

public class ch3ex3{
	static int test (int testval, int target){
		int result = 0 ;
		if (testval > target)
			result = +1;
		else if (testval < target)
			result = -1;
		else
			result = 0 ; //match
		return result;
	}

	public static void main(String[] args){
		System.out.println(test(10,5));
		System.out.println(test(5,10));
		System.out.println(test(5,5));


	}
}