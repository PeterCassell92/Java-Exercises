// Demonstrating Constructors. This version invludes overloading.
class SuperTest{
	SuperTest() {
		System.out.println("Constructor Complete");
	}
	SuperTest(String s){
		String s1 =  s;
		System.out.println("Constructor Complete. String is " + s1);

	}
}

public class ch4ex2 {
	public static void main(String[] args){
		SuperTest a1 = new SuperTest();
		SuperTest a2 = new SuperTest("Blankity Blank");

	}
}