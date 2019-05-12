//showing that Java will initialize string datatypes within a class.
class InitTest{
	String s; 
}

public class ch4ex15{
	public static void main(String[] args){
		InitTest a1 = new InitTest();
		System.out.println(a1.s); // output "null"
	}

}