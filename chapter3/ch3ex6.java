//Chapter 3 Exercise 6 uses boolean comparisons on String Objects.

public class ch3ex6 {
	public static void stringCompare(String a, String b) {
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a.equals(b));
		System.out.println("\n");
	}

	public static void main(String[] args){
		String x = new String();
		x = "Yellow";
		String y = new String();
		y = "Yellow";
		String z = new String();
		z = "Blue";
		stringCompare(x,y);
		stringCompare(y,z);
		stringCompare(x,z);
	}



}