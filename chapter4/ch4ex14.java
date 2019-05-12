//showing that Java will initialize primitive datatypes within a class.
class InitTest{
	char c;
	int i; 
}

public class ch4ex14{
	public static void main(String[] args){
		InitTest a1 = new InitTest();
		System.out.println(a1.c);
		System.out.println(a1.i);
	}

}