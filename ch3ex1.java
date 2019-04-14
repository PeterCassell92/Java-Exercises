// Chapter 3 Exercise 1 is a simple exercises to demonstrate mathematical operator precedence. due to the order of operations being altered by parantheses, the values of a and b can be shown to be different.

public class ch3ex1{
	public static void main(String[] args){

		int x = 5;
		int y = 23;
		int z = 18;

		int a = x + y - 2/2 + z;
		System.out.println(a);
		int b = x + (y - 2)/(2 + z);
		System.out.println(b);
	}
}