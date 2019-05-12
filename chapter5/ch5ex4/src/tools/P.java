// creating custom tools using packages. Demonstrating overloading methods with different variable types.
package src.tools;

public class P{
	public static void rint (String s) {
		System.out.print(s);
	}
	public static void rint(int i){
		System.out.print(i);
	}
	public static void rintln(String s){
		System.out.println(s);
	}
	public static void rintln(long l){
		System.out.println(l);
	}
	public static void rintln(float f){
		System.out.println(f);
	}
	public static void rintln(double d){
		System.out.println(d);
	}
}