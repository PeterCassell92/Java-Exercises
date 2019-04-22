//showing initiliazation of a string using a Instance Initialization. Need to understand the full relevance of this.

//The use of instance initializers are rare, but still it can be a useful alternative to instance variable initializers if:

//(1) initializer code must handle exceptions
//(2) perform calculations that can't be expressed with an instance variable initializer.

//anonymous classes can't have constructors, but they can have instance initializers

class Initmontop{
	String s;
	{
		s = " Spin"; //this is the instance initializer block.
	}
	 
}


public class ch4ex18{
	public static void main(String[] args){
		Initmontop a1 = new Initmontop();
		System.out.println(a1.s);
		}

}