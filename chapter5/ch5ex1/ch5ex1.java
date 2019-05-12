// Program demonstrates how to directly use Classes from other packages.
// import java.util.ArrayList;   Unecessary line given that we reference the package location directly further on.

public class ch5ex1 {

	public static void main(String[] args){
		java.util.ArrayList<String> i = new java.util.ArrayList<String>();
		i.add("4");
		i.add("5");
		System.out.println(i);


	}
}