// Demonstrating Constructors. This version invludes overloading and creating an array of objects. Now initializing the array of objects.
class SuperTest{
	SuperTest() {
		System.out.println("Constructor Complete");
	}
	SuperTest(String s){
		String s1 =  s;
		System.out.println("Constructor Complete. String is " + s1);

	}
}

public class ch4ex4 {
	public static void main(String[] args){
		SuperTest a1 = new SuperTest();
		SuperTest a2 = new SuperTest("Blankity Blank");

		SuperTest[] myarray = new SuperTest[3];

		myarray[0] = new SuperTest("Legalomaniac");
		myarray[1] = new SuperTest("Duplodocous");
		myarray[2] = new SuperTest("Kinexoskeleton");


	}
}