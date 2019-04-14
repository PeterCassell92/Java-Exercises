/*Exercise 5 demonstrates the use of static data. Static data members are one per class rather than one per instance of the class. st1 and st2 are both StaticTest classes.
i is the same always for st1 and st2 because it is static.
*/

class StaticTest{
	static int i =47;
	
}

class StaticFun{
	static void incr() {
		StaticTest.i++;
	}
}

public class ch2ex5 {
	public static void main( String[] args){
		




		StaticTest st1 = new StaticTest();
		StaticTest st2 = new StaticTest();
		System.out.println(st1.i);
		System.out.println(st2.i);

		StaticFun sf = new StaticFun();
		sf.incr();
		sf.incr();
		sf.incr();
		System.out.println(st1.i);
		System.out.println(st2.i);





	}
}

/* output 47,47, 50,50