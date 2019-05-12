// Demonstrating Constructors. This version invludes overloading and creating an array of objects.
class SuperTest{
	SuperTest() {
		System.out.println("Constructor Complete");
	}
	SuperTest(String s){
		String s1 =  s;
		System.out.println("Constructor Complete. String is " + s1);

	}
}

public class ch4ex3 {
	public static void main(String[] args){
		SuperTest a1 = new SuperTest();
		SuperTest a2 = new SuperTest("Blankity Blank");

		SuperTest[] myarray = new SuperTest[3];

	}
}